package com.zeroten.flow;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Scanner;

public class IfElseTest {

    @Test
    public void testIfElse() {
//        System.out.println(1);
    }

    int[] n = new int[4];
    @Test
    public void splitNumTest(int num) {
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

    @Test(description = "不完善，依然会有重复的情况出现，可继续优化")
    public void combinationTest() {
        int num = 1260;
        splitNumTest(num);
        //选定两个数放置在前面，作为十分位
        int n1;
        int n2;
        int temp;

        for(int i=0; i<4; i++) {
            int[] arr = Arrays.copyOf(n, 4);
            temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            for (int j=0; j<4; j++) {
                if (i == j) {
                    continue;
                }
                System.out.println(i + " " + j);
                temp = arr[1];
                arr[1] = arr[j];
                arr[j] = temp;
                /*
                字符串修改后再次循环会按照修改后的字符串来使用
                 */
                n1 = arr[0]*10 + arr[2];
                n2 = arr[1]*10 + arr[3];
                System.out.println(Arrays.toString(arr));
                if (num == n1*n2) {
//                    System.out.println(Arrays.toString(arr));
//                    System.out.println(n1 + "*" + n2);
                    System.out.println("success1");
                    System.out.println();
                }
                n1 = arr[0]*10 + arr[3];
                n2 = arr[1]*10 + arr[2];
//                System.out.println(Arrays.toString(arr));
//                System.out.println(n1 + "*" + n2);
                if (num == n1*n2) {
//                    System.out.println(Arrays.toString(arr));
//                    System.out.println(n1 + "*" + n2);
                    System.out.println("success2");
                    System.out.println();
                }

            }
        }
    }

    @Test
    public void equalTest() {
        int[] arr = Arrays.copyOf(n, 4);

        arr[0] = 100;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(n));
    }
}
