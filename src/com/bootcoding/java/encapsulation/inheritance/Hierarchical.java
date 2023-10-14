package src.com.bootcoding.java.encapsulation.inheritance;


class Parent{
     public void Print1(){
         System.out.println("Parent class");
        }
}

class Child1 extends   Parent{
    public void Print2() {
       super.Print1();
        System.out.println("Child1 class");
    }
}


class  Child2 extends Parent{
    public void Print3() {
        super.Print1();
        System.out.println("Child2 class");

    }
}


public class Hierarchical {
    public static void main(String[] args) {

        Child1 p = new Child1();
        p.Print1();
        p.Print2();


        Child2 c2 = new Child2();
        c2.Print3();
        c2.Print1();

    }
}
