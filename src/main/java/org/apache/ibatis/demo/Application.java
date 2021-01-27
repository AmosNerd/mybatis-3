package org.apache.ibatis.demo;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;

public class Application {
  SubClassA<Long> aa= new SubClassA<>();
  public static void main(String[] args) {
    Field field= null;
    try {
      field = ClassA.class.getDeclaredField("map");
      field.setAccessible(true);
    } catch (NoSuchFieldException e) {
      e.printStackTrace();
    }
    System.out.println(field.getGenericType());
    System.out.println(field.getGenericType() instanceof ParameterizedType);


  }
}
