package src.com.bootcoding.java.collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashSetOfSet {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(2);
        hashSet.add(8);
        hashSet.add(78);

        System.out.println(  hashSet.add(20));
        hashSet.add(20);
        System.out.println( hashSet.add(20));

        hashSet.add(null);
        hashSet.add(null);

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
