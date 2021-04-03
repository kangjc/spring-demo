package com.shiguang.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *动态代理处理程序 反射机制
 *
 */
public class MyInvocationHandler implements InvocationHandler {

    //给租房业务提供代理
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    public Object getProxy(){

        return Proxy.newProxyInstance
                (this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);

    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(rent, args);
        seeHouse();
        System.out.println(method.getName());
        TimeUnit.SECONDS.sleep(2);
        fare();
        return result;
    }

    public void seeHouse(){

        System.out.println(System.currentTimeMillis()+"[info] "+"中介带客户看房");
    }
    public void fare(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        Date date = new Date();
        System.out.println(simpleDateFormat.format(date)+"[info] "+"中介收取中介费");
    }

}
