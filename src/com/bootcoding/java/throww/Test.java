package src.com.bootcoding.java.throww;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age : " );
        int age = sc.nextInt();
        if (age < 18){
            try {
                throw  new YoungerAgeException("You are Not Eligible for vote !");
            }catch (YoungerAgeException e ){
//                e.printStackTrace();
                System.out.println(e);
            }
        }else {
            System.out.println("You are Eligible for vote");
        }

        System.out.println("suhag");
    }
}
