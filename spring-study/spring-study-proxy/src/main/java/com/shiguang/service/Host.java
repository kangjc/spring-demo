package com.shiguang.service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *房东找中介挂房出租
 *
 */
public class Host implements Rent{
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
    Date date = new Date();
    @Override
    public void rent() {
        System.out.println(simpleDateFormat.format(date)+"[info] "+"房东要出租房子ing");
    }
}
