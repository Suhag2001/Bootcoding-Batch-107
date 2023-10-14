package src.com.bootcoding.java.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListOfList {
    public static void main(String[] args) {
        ArrayList<Integer>  arrayList = new ArrayList<>();


        System.out.println(  arrayList.isEmpty());
        System.out.println(arrayList);
//        1.add()
        arrayList.add(12);
        arrayList.add(5);
        for(int i = 1; i< 23; i++){
            arrayList.add(i);
        }

        arrayList.addFirst(20);
        System.out.println(arrayList);

        System.out.println(arrayList.get(3));

//        for (int i =0; i<arrayList.size();i++){
//            System.out.println(arrayList.get(i));
//        }
        arrayList.remove(0);
        System.out.println(arrayList);

        System.out.println(arrayList.contains(12));

        System.out.println(  arrayList.isEmpty());

    }

}
