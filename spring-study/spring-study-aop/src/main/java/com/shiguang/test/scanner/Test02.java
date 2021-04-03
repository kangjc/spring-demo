package com.shiguang.test.scanner;

public class Test02 {
    public static void main(String[] args) {
        /*
         * 1x1=1
         * 1x2=2 2x2=4
         * 1x3=3 2x3=6 3x3=9
         * 1x4=4
         * 1x5=5
         * 1x6=6
         * 1x7=7
         * 1x8=8
         * 1x9=9
         * */

        for (int j = 1; j <= 9; j++) {

            for (int i = 1; i <= j; i++) {
                System.out.print(j + "x" + i + "=" + 1 * i + "\t");

            }

            System.out.println();

        }


    }
}
