package src.com.bootcoding.java.exception;

public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("Exception handling");
        try {
            int a = 10, b =0, c ;
            System.out.println("1");
            c= a/b; // ArithmeticException
            System.out.println(c);
//            String n = null;
//        System.out.println(n.length());  // NullPointerException

        }catch (Exception e) {
//            System.out.println(e.toString());
            e.printStackTrace();

        }finally {
            System.out.println("i am from finally block");
        }
//
//        try {
//            Class.forName("org.postgresql.Driver");
//        }catch (Throwable e){
//            System.out.println(e);
//        }

        System.out.println(20+10);
    }
}
