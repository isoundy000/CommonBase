package com.yujian.algorithemLearn;

import java.util.Arrays;

/**
 * @author yujianjian
 * @CreateTime 2017-06-20 上午8:06 选择排序demo
 */
public class SelectionSortDemo {
    public static void main(String[] args) {
        int[] arrary = {1,3,5,4,2,4,2,1,3,8,6,3};
        System.out.println("排序前:");
       for(int i=0;i<arrary.length;i++){
           System.out.print(arrary[i]+",");
       }
        System.out.println();
        arrary = selectionSort(arrary);
        System.out.println("排序后：");
        for(int i=0;i<arrary.length;i++){
            System.out.print(arrary[i]+",");
        }
        System.out.println();
    }

    //简单的选择排序
    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int n = i; //最小数的索引
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {  //找出最小的数
                    min = array[j];
                    n = j;
                }
            }
            array[n] = array[i];
            array[i] = min;
        }
        return array;
    }

}
