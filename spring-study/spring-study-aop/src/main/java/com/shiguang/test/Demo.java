package com.shiguang.test;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {
        //创建一个数组
        int[] nums = {9, 7, 17, 15, 2};
        System.out.println("原始数组:"+ Arrays.toString(nums));
        //创建临时变量
        int temp;
        //外层for循环控制比价的轮数
        for (int i = 0; i <= nums.length - 1; i++) {
            //内层for循环控制比较的次数
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    //将较大的数存入temp
                    temp = nums[j];
                    //再将较小的数位置前移
                    nums[j] = nums[j + 1];
                    //较大的数位置后移，完成位置交换
                    nums[j + 1] = temp;
                }
            }
        }
        //打印冒泡排序后的数组
        System.out.println("-----------------------------------");
        System.out.println("冒泡排序完成："+ Arrays.toString(nums));
    }


}
