package com.yujian.algorithemLearn;

import sun.misc.BASE64Encoder;
import sun.security.provider.MD5;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author yujianjian
 * @CreateTime 2017-06-16 上午8:46 二分查找算法
 */
public class BinarySearchDemo {
    public static void main(String[] args) throws Exception{
        int[] array = {1, 2, 3, 4, 5, 6};
        int item = 4;
        int search = binarySearch(array, item);
        System.out.println("search=" + search);
    }

    /**
     * 利用二分查找算法查找数组中指定元素的索引位置，找不到就返回-1
     */
    public static int binarySearch(int[] array, int item) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = array[mid];
            if (guess == item) {
                return mid;
            } else if (guess > item) {
                high = mid - 1;
            } else if (guess < item) {
                low = mid + 1;
            }
        }

        return -1;
    }

}
