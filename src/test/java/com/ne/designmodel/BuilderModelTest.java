package com.ne.designmodel;

import com.ne.designmodel.buildermodel.Programmer;
import org.junit.Test;

import java.util.ArrayList;


/**
 * Created with IDEA
 * Author: wymiracle
 * Description: 建设者模式测试
 * Time:Create on 2018/12/10 22:10
 */
public class BuilderModelTest {

    @Test
    public void testBuilderModel() {
        Programmer programmer = new Programmer.ProgrammerBuilder()
                .setFirstName("tom")
                .setLastName("ne")
                .setTelphone("13125111268")
                .setAddress("shangahi")
                .setLanguages(new ArrayList<String>() {{
                    add("English");
                    add("Chinese");
                }})
                .setProjects(new ArrayList<String>() {{
                    add("vehilce system");
                    add("education system");
                }})
                .build();
        System.out.println(programmer.toString());
    }
}
