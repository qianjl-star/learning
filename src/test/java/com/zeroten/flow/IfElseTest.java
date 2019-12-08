package com.zeroten.flow;

import org.testng.annotations.Test;

import java.util.Scanner;

public class IfElseTest {

    @Test
    public void testIfElse() {
//        System.out.println(1);
    }

    int[] n = new int[4];
    @Test
    public void splitNum(int num) {
        //输入
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        this.num = num;

        //各位数字
        n[0] = num/1000;
        n[1] = num%1000/100;
        n[2] = num%100/10;
        n[3] = num%10;
    }

    @Test
    public void combination() {
        int num = 1260;
        splitNum(num);
        //选定两个数放置在前面，作为十分位
        int n1;
        int n2;
        int temp;

        for(int i=0; i<4; i++) {
            temp = n[0];
            n[0] = n[i];
            n[i] = temp;
            for (int j=0; j<3; j++) {
                if (i == j) {
                    continue;
                }
                temp = n[1];
                n[1] = n[j];
                n[j] = temp;
                /*
                字符串修改后再次循环会按照修改后的字符串来使用
                 */
                n1 = n[0]*10 + n[2];
                n2 = n[1]*10 + n[3];
                if (num == n1*n2) {
//                    System.out.println(n1 + "+" + n2);
                    System.out.println("success");
                }
                n1 = n[0]+n[3];
                n2 = n[1]+n[2];
                if (num == n1*n2) {
//                    System.out.println(n1 + "+" + n2);
                    System.out.println("success");
                }
                for(int k=0; k<4; k++) {
                    System.out.print(n[k] + " ");
                }
            }
        }
    }

    @Test
    public void equalTest() {
        int n1 = 4096;
        int n2 = 4096;
        System.out.println(n1 == n2);
    }
}
