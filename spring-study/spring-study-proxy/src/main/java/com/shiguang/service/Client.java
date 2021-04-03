package com.shiguang.service;

public class Client {

    public static void main(String[] args) {
        //真实角色
        Host host = new Host();

        //代理
        MyInvocationHandler autoProxy = new MyInvocationHandler();
        autoProxy.setRent(host);
        Rent proxy = (Rent) autoProxy.getProxy();
        proxy.rent();


    }
}
