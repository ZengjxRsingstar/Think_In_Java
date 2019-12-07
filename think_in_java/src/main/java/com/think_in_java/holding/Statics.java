package com.think_in_java.holding;


import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author zengjx
 * @Company zengjx
 * @Date 2019/12/7  14:24
 * @Version V1.0

 * Connected to the target VM, address: '127.0.0.1:58796', transport: 'socket'
 * key 0 value  514
 * key 1 value  486
 * key 2 value  465
 * key 3 value  534
 * key 4 value  479
 * key 5 value  479
 * key 6 value  517
 * key 7 value  503
 * key 8 value  485
 * key 9 value  553
 * key 10 value  518
 * key 11 value  523
 * key 12 value  513
 * key 13 value  500
 * key 14 value  519
 * key 15 value  473
 * key 16 value  468
 * key 17 value  488
 * key 18 value  482
 * key 19 value  501
 */
public class Statics {
     //统计  Random 的出现次数
       public static void main(String[] args) {
           Random   random  =new Random();
           Map<Integer,Integer>  map  =new HashMap<>();
           for (int i = 0; i <10000 ; i++) {

               int key = random.nextInt(20);
               Integer times = map.get(key);

               map.put(key,times==null ? 1:times+1);
           }
           Set<Integer> keySet = map.keySet();
           for (Integer integer : keySet) {
               System.out.println("key "+integer+" value  "+map.get(integer));
           }
       }
}
