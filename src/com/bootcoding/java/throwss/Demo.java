package src.com.bootcoding.java.throwss;

import java.io.FileNotFoundException;

public class Demo {
    public static void main(String[] args){
        ReadAndWrite readAndWrite = new ReadAndWrite();
      try {
//          readAndWrite.readFile();
          Class.forName("org.postgresql.Driver");
      }catch (ClassNotFoundException c){
          c.printStackTrace();
      }catch (Exception e){
          e.printStackTrace();
      }

        System.out.println("Hey I'm Suhag");
    }
}
