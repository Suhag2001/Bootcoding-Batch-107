package src.com.bootcoding.java.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashSetOfSet {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(2);
        hashSet.add(8);
        hashSet.add(78);
        hashSet.add(100);
        hashSet.add(19);
        System.out.println(hashSet);
        HashSet<Integer> hashSet2 = new HashSet<>(hashSet);
        System.out.println(hashSet2);

        System.out.println(  hashSet.add(20));
        System.out.println( hashSet.add(20));

        System.out.println(hashSet.add(null));;
        System.out.println( hashSet.add(null));;

        hashSet.remove(20);

        System.out.println(hashSet.contains(2));

        System.out.println(hashSet);

        int count = 1;
      for(Integer i : hashSet){
          if(count==3){
              System.out.println("value of 3rd index :" +i);
          }
          count++;
      }


     Object[] a = hashSet.toArray();
        System.out.println("arrays :" +a[2]);


        System.out.println( hashSet.isEmpty());

         hashSet.clear();

        System.out.println(hashSet);
    }

}
