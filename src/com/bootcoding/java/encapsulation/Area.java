package src.com.bootcoding.java.encapsulation;

public class Area {
    private int length;
    private int breadth;


    public void setArea(int length , int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public int getArea(){
       int area = length* breadth;
       return area;
    }


}
