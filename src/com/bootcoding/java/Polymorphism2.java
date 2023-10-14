package src.com.bootcoding.java;



class Parent{

    static    int Mul(int a , int b){
        return a*b;
    }
}
class Child1 extends Parent{
    static     int Mul(int a , int b){
        return a*b;
    }
}
class Child2 extends Parent{
    static     int Mul(int a , int b){
        return a*b;
    }
}

public class Polymorphism2 {
    public static void main(String[] args) {
        Parent p;
        p = new Parent();
        System.out.println(p.Mul(21,22));
        p= new Child1();
        System.out.println(p.Mul(22,20));
        p= new Child2();
        System.out.println(p.Mul(10,10));

    }
}
