package src.com.bootcoding.java.throww;

// RuntimeException class for unchecked exception and Exception class for checked exception
public class YoungerAgeException extends  RuntimeException{
    YoungerAgeException(String message){
        super(message);
    }

}
