package com.ne.designmodel.buildermodel;

import java.util.List;

/**
 * Created with IDEA
 * Author: wymiracle
 * Description: 建设者模式（创建对象模式三剑客之一）
 * Time:Create on 2018/12/10 9:44
 */
public class Programmer {

    private String fristName;

    private String lastName;

    private String address;

    private String telphone;

    private List<String> languages;

    private List<String> projects;

    /**
     * 显式带参的私有化构造，tips：仅当类没有提供任何构造器的时候，系统才会提供一个默认的构造器
     * @param fristName
     * @param lastName
     * @param address
     * @param telphone
     * @param languages
     * @param projects
     */
    private Programmer(String fristName, String lastName, String address, String telphone, List<String> languages, List<String> projects) {
        this.fristName = fristName;
        this.lastName = lastName;
        this.address = address;
        this.telphone = telphone;
        this.languages = languages;
        this.projects = projects;
    }

    public static class ProgrammerBuilder {
        private String firstName;

        private String lastName;

        private String address;

        private String telphone;

        private List<String> languages;

        private List<String> projects;

        public ProgrammerBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public ProgrammerBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public ProgrammerBuilder setAddress(String address) {
            this.address = address;
            return this;
        }
        public ProgrammerBuilder setTelphone(String telphone) {
            this.telphone = telphone;
            return this;
        }
        public ProgrammerBuilder setLanguages(List<String> languages) {
            this.languages = languages;
            return this;
        }
        public ProgrammerBuilder setProjects(List<String> projects) {
            this.projects = projects;
            return this;
        }

        public Programmer build() {
            return new Programmer(firstName, lastName, address,telphone,languages, projects);
        }

    }

    @Override
    public String toString() {
        return "Programmer{" +
                "fristName='" + fristName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
