package src.com.bootcoding.java.Test;

import java.io.FileInputStream;

public class ExceptionHandling {
    public static void main(String[] args) {

        //unchecked exception
//        System.out.println(123/0);  //ArithmeticExcription
//        String str = null;
//        System.out.println(str.length());// NUllPointerException


         try {
             //checked exception
             FileInputStream fileInputStream = new FileInputStream("d:/abc.text"); //FileNotFoundException
             Class.forName("org.postgresql.Driver");  //ClassNotFoundException

         }catch (Exception e) {
             System.out.println(e);
             System.out.println("give the proper file address");
         }




    }
}
