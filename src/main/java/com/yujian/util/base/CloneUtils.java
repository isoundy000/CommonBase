package com.yujian.util.base;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author yujianjian
 * @CreateTime 2017-04-10 上午9:29
 * @Description CloneUtils.java
 * 被拷贝的对象必须实现Serializable接口
 */
public class CloneUtils {
  //clone a object
  public static <T extends Serializable> T clone(T obj){
    //clone object of produce
    T cloneObj = null;
    try {
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      ObjectOutputStream oos = new ObjectOutputStream(baos);
      oos.close();
      //分配内存空间,写入原始对象,生成新对象
      ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
      ObjectInputStream ois = new ObjectInputStream(bais);
      //返回新对象,并做类型转换
      cloneObj = (T)ois.readObject();
      ois.close();
    }catch (Exception e){
      e.printStackTrace();
    }
    return cloneObj;
  }
}
