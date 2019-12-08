package com.zeroten.flow;

import org.testng.annotations.Test;

import java.util.Arrays;

public class PalindromeTest {
    @Test
    public void T乘方() {
        double temp = Math.pow(10, 5);
        System.out.println(temp);
    }

    @Test
    public void check位数() {
        boolean flag = true;
        int i = 0;
        int num = 4096;
        while(flag) {
            /*
            注意(int)添加的位置，如果是(int)num/Math.pow(10, i)则不生效
            num本身就是int类型
            应该为(int)(num/Math.pow(10, i))
            也就是(int)的有效范围
             */
//            double temp = num/Math.pow(10, i);
//            double j = num/temp;
            if (num/(int)Math.pow(10, i) <= 0) {
                flag = false;
            }else {
                i++;
            }
        }
        System.out.println(i);
    }

    @Test
    public void IsOrNot() {
        /*
        先把数字拆分了
        保存到数组中
         */
        int[] arr = {1,2,3,4,5};
        /*
        数组长度为奇数，则中间的数不需要考虑
        数组长度为偶数，则直接对比是否对称即可
         */
//        System.out.println(arr[-1]);
        for (int i=0; i<arr.length/2-1; i++) {
            /*
            此处应为不等于
            当不等于时，跳出代码块
             */
            if(arr[i] != arr[arr.length-i-1]) {
                System.out.println(0);
                return;
            }
        }
        return;
    }
}
