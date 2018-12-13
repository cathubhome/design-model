>git地址：https://github.com/cathubhome/design-model.git

**抽象工厂模式定义**：为创建一组或相互依赖的对象提供一个接口，而且不需要指定它们的具体类。抽象工厂模式与工厂方法模式的最大区别就在于,工厂方法模式针对的是一个产品等级结构，而抽象工厂模式则需要面对多个产品等级结构。   

**抽象工厂模式的优点**:良好的封装,客户端不需要关心具体的实现类,客户端只需要关注接口即可。

**抽象工厂模式的缺点**:不易扩展新产品。  

**角色**：  
- 抽象工厂角色：抽象工厂模式的核心，与应用商业系统无关。通常是抽象类或接口，具体工厂要继承抽象工厂或实现接口  
- 具体工厂角色：这个角色直接在客户端的调用下创建产品的实例，包含了选择合适产品对象的逻辑，而这个逻辑是与应用系统商业逻辑紧密相关的  
- 抽象产品角色：这个角色是工厂模式所创建的对象的父类，或是它们共同的接口  
- 具体产品角色：抽象工厂模式所创建的任何对象都是某一个具体产品类的实例，这是客户端最终需要的东西，其内部充满了商业逻辑  

*参考地址*：  
https://www.aliyun.com/jiaocheng/291141.html
https://www.cnblogs.com/LUA123/p/7798488.html

在Spring中，抽象工厂的例子是org.springframework.beans.factory.BeanFactory。
通过它的实现，我们可以从Spring的容器访问bean。
根据采用的策略，getBean方法可以返回已创建的对象（共享实例，单例作用域）或初始化新的对象（原型作用域）。
在BeanFactory的实现中，我们可以区分：ClassPathXmlApplicationContext，XmlWebApplicationContext，StaticWebApplicationContext，StaticPortletApplicationContext，GenericApplicationContext，StaticApplicationContext