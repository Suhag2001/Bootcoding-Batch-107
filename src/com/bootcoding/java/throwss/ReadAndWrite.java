package src.com.bootcoding.java.throwss;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadAndWrite {
    public void readFile() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("d:/temp.text");
    }
    public  void  saveFile() throws FileNotFoundException {
        String s= "This is demo";
        FileOutputStream fis = new FileOutputStream("d:/temp.text");
    }
}
