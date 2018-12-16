GIT地址：https://github.com/cathubhome/design-model.git  
# Java的三种代理模式：  
释义：代理模式是23种设计模式之一，是==通过代理对象访问目标对象，扩展目标对象的功能==。    

## 1、静态代理
静态代理在使用时需要定义接口或者父类，被代理对象与代理对象必须实现相同的接口或者继承相同的父类

sumary:  
静态代理可以在不修改目标对象功能的前提下，对目标功能对象扩展，但是由于目标对象与代理对象要实现相同的接口，一旦接口新增方法，目标对象与代理对象都要维护，这样会比较繁琐，如何解决这一弊端呢？答案是可以使用动态代理方式

## 动态代理（jdk代理或是接口代理）  
特点：
==代理对象不需要实现接口,代理对象的生成，是利用jdk的api,动态的在内存中构建代理对象==（要指定目标对象与目标对象实现的接口类型） 

JDK中生成代理对象的API：
代理类所在的包java.lang.reflect.Proxy  
jdk实现代理只需要使用newProxyInstance方法  

```
public static Object newProxyInstance(ClassLoader loader,
                                          Class<?>[] interfaces,
                                          InvocationHandler h)
        throws IllegalArgumentException

ClassLoader loader：指定目标对象的类加载器  
Class<?>[] interfaces：目标对象实现的接口类型，使用泛型方式确认类型  
InvocationHandler h：事件处理,执行目标对象的方法时,会触发事件处理器的方法,会把当前执行目标对象的方法作为参数传入
```

summary:==jdk代理中代理对象不需要实现接口,但是目标对象一定要实现接口,否则不能用动态代理== == 

思考：静态代理与jdk代理都要求目标对象是实现一个接口的对象，如果是单独的对象怎么办呢？这个时候可以使用以目标对象子类的方式实现代理，这种方法被称为CGLIB代理.

## CGLIB代理：
==cglib代理也称为子类代理，它是在内存中构建一个子类从而实现对目标对象功能的扩展==  
jdk代理的限制：使用jdk代理的对象必须实现一个或多个接口，如果想代理没有实现接口的类，可以使用cglib代理  
cglib是一个强大的代码生成包，可以在运行期间扩展java类与实现java接口，被广泛应用于AOP框架，如Spring AOP,为它们提供方法的拦截器  
cglib的底层是通过一个轻量级的*字节码处理框架ASM*来转换字节码并生成新的类，不鼓励直接使用ASM，除非你对jvm的内部结构，包括class文件的格式与指令集都很熟悉  
Cglib子类代理实现方法:
- 1.需要引入cglib的jar文件,但是Spring的核心包中已经包括了Cglib功能,所以直接引入sping-core-xxx.jar即可.
- 2.引入功能包后,就可以在内存中动态构建子类
- 3.==代理的类不能为final==,否则报错
- 4.==目标对象的方法如果为final/static,那么就不会被拦截==,即不会执行目标对象额外的业务方法.
- 

```
public class CglibProxyFactory implements MethodInterceptor{

    /**
     * 目标对象
     */
    private Object target;

    public CglibProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 创建代理对象
     * @return
     */
    public Object getProxyInstance(){
        //工具类
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(target.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //创建子类（代理对象）
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("start transaction...");
        Object invoke = method.invoke(target, objects);
        System.out.println("transaction commit...");
        return invoke;
    }
}
```


Spring AOP中使用到了jdk代理与cglib代理，对于加入IOC容器的目标对象，如果实现了接口就使用jdk代理，如果没有实现接口，就是使用cglib代理
