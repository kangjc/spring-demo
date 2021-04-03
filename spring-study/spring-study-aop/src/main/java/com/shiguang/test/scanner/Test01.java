package com.shiguang.test.scanner;

import java.util.Scanner;

/**
 * 字符转数组转化为整数数组
 */
public class Test01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要比较的整数,用\",\"隔开：");
        if (scanner.hasNext()) {
            String next = scanner.next();
            String[] split = next.split(",");
            int[] ints = new int[split.length];
            for (int i = 0; i < split.length; i++) {
                System.out.println(split[i]);
                int i1 = Integer.parseInt(split[i]);
                ints[i] = i1;
                if (i == split.length - 1) {
                    getMax(ints);
                }
            }
        }
        scanner.close();
    }

    public static void getMax(int[] args) {
        //定义一个接受最大值的变量 传入的每一个需要比较的元素都有可能成为最大值
        //所以我们可以给这个接受最大值的变量赋一个初始值
        int maxNum = args[0];

        for (int i = 0; i < args.length; i++) {
            if (args[i] > args[0]) {
                maxNum = args[i];
            }
        }
        System.out.println("其中最大的整数是：" + maxNum);
    }
}
