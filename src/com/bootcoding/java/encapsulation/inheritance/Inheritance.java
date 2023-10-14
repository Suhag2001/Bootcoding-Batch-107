package src.com.bootcoding.java.encapsulation.inheritance;




class A{
    public void Print1(){
        System.out.println("A parrent class");
    }
}

class  B extends A{
    public  void Print2(){
        System.out.println("B child class");
    }
}

class  C extends B{
    public void Print3(){
        System.out.println( "C as child class");
    }
}

public class Inheritance {
    public static void main(String[] args) {


      C c = new C();
      c.Print3();
      c.Print2();
      c.Print1();
    }
}
