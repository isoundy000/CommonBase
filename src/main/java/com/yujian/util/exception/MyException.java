package com.yujian.util.exception;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yujianjian
 * @CreateTime 2017-04-20 上午8:39
 * @Description MyException.java
 * 容纳所有的异常
 */
public class MyException extends Exception{
  private List<Throwable> causes = new ArrayList<>();

  //构造函数，传递一个异常列表
  public MyException(List<? extends Throwable> causes){
    this.causes.addAll(causes);
  }

  //读取所有的异常
  public List<Throwable> getExceptions(){
    return this.causes;
  }
}
