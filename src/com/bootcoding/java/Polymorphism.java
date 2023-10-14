package src.com.bootcoding.java;

public class Polymorphism {
    public static void main(String[] args) {
        Polymorphism a = new Polymorphism();


        System.out.println(a.Addition(12,2));
        System.out.println( a.Addition(233.2, 23.2));

    }

    final int Addition(int a, int b){
        return a+b;
    }

    final double Addition(double a, double b){
        return a+b;
    }


}
