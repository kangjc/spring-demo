package com.shiguang.controller;


import java.lang.reflect.Constructor;


public class Reflection {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("com.shiguang.controller.User");
        Constructor constructor = c.getConstructor(String.class, int.class);
        User user = (User)constructor.newInstance("时光", 21);
        //User user = (User)c.newInstance();
        //一个类被加载后 类的整个结构信息都会被封装在该类的Class对象中
        System.out.println(user.getAge());
        System.out.println(c.getClasses().toString());
        System.out.println(c.getClasses().toString().lastIndexOf("."));
        System.out.println(new User().getClass().getName().substring(c.getName().lastIndexOf(".")+1));
    }
}

class User{
    private String name;
    private  int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
