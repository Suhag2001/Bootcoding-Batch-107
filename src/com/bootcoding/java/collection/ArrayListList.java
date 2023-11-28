package src.com.bootcoding.java.collection;

import java.util.ArrayList;

public class ArrayListList {
    public static void main(String[] args) {


        //The angle brackets (<>) in Java are typically referred to as "diamond operators."

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(2);


//        System.out.println( arrayList.isEmpty());  //true
//        System.out.println(arrayList);
//        1.add()
        arrayList.add(12);
        arrayList.add(5);
        System.out.println(arrayList);
        for(int i = 1; i< 23; i++){
            arrayList.add(i);
        }

        arrayList.addFirst(20);
        System.out.println(arrayList);

        arrayList.toString();
        System.out.println(arrayList);

        System.out.println(arrayList.get(3));

//        for (int i =0; i<arrayList.size();i++){
//            System.out.println(arrayList.get(i));
//        }

//        2.remove()
        arrayList.remove(0);
//        3.set()
        System.out.println(arrayList);
        arrayList.set(1,24);

        System.out.println(arrayList);

//        4.contains()
        System.out.println(arrayList.contains(55));

//       5.clear()
        arrayList.clear();
        System.out.println(arrayList);

//        6.isEmpty()
        System.out.println(  arrayList.isEmpty());



        ArrayList<Student>  students = new ArrayList<>();

        students.add(new Student("aman" ,30));
        students.add(new Student("lucky",29));

        System.out.println(students);



    }

}
