package com.shiguang.test.apply;

public class Demo {

    public static void main(String[] args) {

        for (int i = 1; i <= 11; i++) {

            if (i <= 6) {
                //当i <=6时打印上三角形
                //模块 1
                for (int j = 6; j >= i; j--) {
                    System.out.print("#");
                }
                //模块 2
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                //模块 3[同一排中模块3的"*"个数总比模块2少1个，所以这里j <i-1作为循环条件即可]
                for (int j = 0; j < i - 1; j++) {
                    System.out.print("*");
                }
                //模块 4
                for (int j = 6; j >= i; j--) {
                    System.out.print("#");
                }
                //换行
                System.out.println();
            } else {
                //当i >6时打印下三角形
                //模块 5
                for (int j = 7; j <= i + 1; j++) {
                    System.out.print("#");
                }
                //模块 6
                for (int j = 11; j >= i; j--) {
                    System.out.print("*");
                }
                //模块 7
                for (int j = 11; j >= i + 1; j--) {
                    System.out.print("*");
                }
                //模块 8
                for (int j = 7; j <= i + 1; j++) {
                    System.out.print("#");
                }

                //换行
                System.out.println();
            }
        }
    }
}
