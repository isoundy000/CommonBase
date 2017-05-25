package com.yujian.util.base;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author yujianjian
 * @CreateTime 2017-04-14 上午8:18
 * @Description ArrayUtils.java
 * 解决1:Arrays.asList所生成的list长度不可变的问题
 * 解决2:ToArray()方法返回的是一个Object数组
 */
public class ArrayUtils<T> {

  //把agiel变长参数转变为列表，并且长度可变
  public static <T> List<T> asList(T...t){
    List<T> list = new ArrayList<>();
    Collections.addAll(list,t);
    return list;
  }

  /**
   *通过反射类Array声明了一个T类型的数组
   */
  public static <T> T[] toArray(List<T> list,Class<T> tClass){
    T[] t = (T[])Array.newInstance(tClass, list.size());
    int n = list.size();
    for(int i =0;i<n;i++){
      t[i] = list.get(i);
    }
    return t;
  }
}
