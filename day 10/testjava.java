import java.util.*;
public class testjava{
    public static void main(String[] args){
        LinkedList<String> a1 = new LinkedList<String>();
        a1.add("Ravi");
        a1.add("Vijay");
        a1.add("Ravi");
        a1.add("Ajay");
        Iterator<String> itr = a1.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        LinkedList<String> a2 = new LinkedList<String>();
        a2.addAll(a1);
        System.out.println(a1);
    }
}