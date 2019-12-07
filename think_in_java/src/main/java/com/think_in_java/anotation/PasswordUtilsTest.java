package com.think_in_java.anotation;

import org.junit.Test;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author zengjx
 * @Company zengjx
 * @Date 2019/12/7  11:06
 * @Version V1.0
 */

public class PasswordUtilsTest {
   @Check(value = "hi")
    private   static     int a;

    public static void main(String[] args) {
        PasswordUtils   passwordUtils  =new PasswordUtils();
        boolean b = passwordUtils.validatePassword("");
        System.out.println("a="+a);
    }

    @Deprecated// 方法过时
    public void say(){
        System.out.println("Noting has to say!");
    }
    public   void   test(){

        say();
    }



}
