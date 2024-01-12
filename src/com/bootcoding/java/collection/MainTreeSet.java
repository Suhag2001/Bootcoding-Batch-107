package src.com.bootcoding.java.collection;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.TreeSet;
//what is TreeSet?
// TreeSet is a class that implements the Set interface, which uses a tree for storage.
// It inherits AbstractSet class and implements the NavigableSet interface.
// The objects of the TreeSet class are stored in ascending order.
// TreeSet doesn't allow null elements.
// TreeSet is not thread-safe.
// TreeSet is fail-fast in nature.
// TreeSet is the best choice for storing a large amount of sorted information.
// TreeSet is basically implementation of a self-balancing binary search tree like Red-Black Tree.
// Therefore operations like add, remove and search take O(Log n) time.
// And operations like printing n elements in sorted order takes O(n) time.
// TreeSet is great for sorted data and storing unique values.
// TreeSet internally uses TreeMap to store objects.

//O(Log n) and O(n) which is fast?
//O(Log n) is faster than O(n).
//O(Log n) is faster than O(n) because as the input size increases, the time taken by O(Log n) increases slowly as compared to O(n).

public class MainTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1000);
        ts.add(20);
        ts.add(30999);
        ts.add(405);
        ts.add(60);
        ts.add(50);
        ts.add(90);
        ts.add(80124);
        ts.add(70);
        ts.add(100);
        System.out.println(ts+ "Arranged in ascending order");
        System.out.println(ts.ceiling(45)+" Ceiling value of 45 which is present in Tree Set");//use of ceiling() method
        //ceiling() method
        //The ceiling() method of TreeSet class in Java is used to return the least element in this set greater than or equal to the given element, or null if there is no such element.

        System.out.println(ts.ceiling(59));
        System.out.println(ts.ceiling(70));
        System.out.println(ts.ceiling(80));
        System.out.println(ts.ceiling(90));
        System.out.println(ts.ceiling(100));
        System.out.println(ts.ceiling(110));
        System.out.println(ts.ceiling(120));
        System.out.println(ts.ceiling(130));
        System.out.println(ts.ceiling(140));

        System.out.println(ts.floor(50));//use of floor() method
        //floor() method
        //The floor() method of TreeSet class in Java is used to return the greatest element in this set less than or equal to the given element, or null if there is no such element.

        System.out.println(ts.contains(100) + " is the use of contains() method");//use of contains() method
        System.out.println(ts.descendingSet()+ " is the use of descendingSet() method");//use of descendingSet() method
        System.out.println(ts.first()+ " is the use of first() method");//use of first() method
        System.out.println(ts);
        System.out.println(ts.headSet(90)+ " is the use of headSet() method");//use of headSet() method
        System.out.println(ts);
        System.out.println(ts.higher(50)+ " is the use of higher() method");//use of higher() method
        System.out.println(ts.isEmpty()+ " is the use of isEmpty() method");//use of isEmpty() method
        System.out.println(ts.last()+ " is the use of last() method");//use of last() method
        System.out.println(ts.lower(50)+ " is the use of lower() method"+"\n");//use of lower() method
        System.out.println(ts.pollFirst()+ " is the use of pollFirst() method");//use of pollFirst() method
        System.out.println(ts);
        //After using pollFirst() method
        //10 is not present in TreeSet
        System.out.println(ts+ "\n");

        System.out.println(ts.pollLast()+ " is the use of pollLast() method");//use of pollLast() method
        //After using pollLast() method
        //100 is not present in TreeSet
        System.out.println(ts+ "\n");

        System.out.println(ts.remove(50)+ " is the use of remove() method");//use of remove() method
        //After using remove() method
        //50 is removed from TreeSet

        System.out.println(ts.size()+ " is the use of size() method");//use of size() method
        System.out.println(ts.subSet(10, 50)+ " is the use of subSet() method");//use of subSet() method
        System.out.println(ts.tailSet(50)+ " is the use of tailSet() method");//use of tailSet() method
        System.out.println(ts.toString()+ " is the use of toString() method");//use of toString() method
        System.out.println(ts.hashCode()+ " is the use of hashCode() method");//use of hashCode() method

        //how to get 3 index element from TreeSet?
        //System.out.println(ts.get(3)); // this is not possible in TreeSet

        System.out.println(ts);
        Object []obj = ts.toArray();
        for (Object o : obj) {
            System.out.println(o);
        }
        System.out.println(obj[3]+ " is the 3rd index element from TreeSet");
        ArrayList<Integer> c = new ArrayList<>();
        c.add(2);
        c.add(4);
        ts.addAll(c);
        System.out.println(ts);

        System.out.println("List of Numbers ");
        for(Integer i : ts){
           if (i>=40){
               System.out.println(i);
           }
        }

        Object arr[] = ts.toArray();
        int arrr[] ={1,2,3,4,5,6,7};

    }
}
