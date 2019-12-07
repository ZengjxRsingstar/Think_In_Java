package com.think_in_java.anotation;//: annotations/UseCaseTracker.java
import org.junit.Test;

import java.lang.reflect.*;
import java.util.*;

/***
 * 通过getDeclaredMethods获取  PasswordUtils  的方法
 */

public class UseCaseTracker {
  public static void
  trackUseCases(List<Integer> useCases, Class<?> cl) {
    for(Method m : cl.getDeclaredMethods()) {
      UseCase uc = m.getAnnotation(UseCase.class);//获取方法上的注解
      if(uc != null) {
        System.out.println("Found Use Case:" + uc.id() +
          " " + uc.description());
        useCases.remove(new Integer(uc.id()));
      }
    }
    for(int i : useCases) {
      System.out.println("Warning: Missing use case-" + i);
    }
  }
  public static void main(String[] args) {
    List<Integer> useCases = new ArrayList<Integer>();
    Collections.addAll(useCases, 47, 48, 49, 50);
    trackUseCases(useCases, PasswordUtils.class);
  }

@Test
  public   void   getAnottion(){

   Class     powwordClass=PasswordUtils.class;
    Method[] declaredMethods = powwordClass.getDeclaredMethods();

    for (int i = 0; i <declaredMethods.length ; i++) {

      System.out.println(declaredMethods[i].getName());
      System.out.println(declaredMethods[i].getAnnotations());

      UseCase annotation = declaredMethods[i].getAnnotation(UseCase.class);
      System.out.println("id"+annotation.id());
      System.out.println("description"+annotation.description());

    }

  }


} /* Output:
Found Use Case:47 Passwords must contain at least one numeric
Found Use Case:48 no description
Found Use Case:49 New passwords can't equal previously used ones
Warning: Missing use case-50
*///:~
