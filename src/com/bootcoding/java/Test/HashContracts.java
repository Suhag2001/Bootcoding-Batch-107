package src.com.bootcoding.java.Test;

import java.util.ArrayList;
import java.util.HashMap;

public class HashContracts {
    public static void main(String[] args) {
//        Student student = new Student();
//        HashMap<Integer, String> student = new HashMap<>();

//        var its available from java 10 ;

//        byte a = 10;
//        float f = a;
//        double d = f;
//        double d2 = a;
//        int f2 = (int) d;
//        char c =(char) a;
//        System.out.println(c);
//        System.out.println(a+'A');
//        System.out.println("implicit"+d+'a');
//        System.out.println(d2);
//        System.out.println(d);
//        System.out.println(f);
//double ff = 92233.7205555555555f;
//        System.out.println(ff);
//  var age = "20";
//  var list = new ArrayList<>();
// var num = 30 ;
//        System.out.println(num);
//  String number = "30";
////        number = 40;
//        number  = "suhag";
//        System.out.println(age);
//        System.out.println(number);
//        System.out.println(d +'A');

        short  age= 1; //range -128 to 127
        System.out.println(age);
        
        for(int i = 0 ; i< 500; i++){
            System.out.println(age++);
        }
    }
}
