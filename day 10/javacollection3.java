import java.util.Iterator;
import java.util.Vector;

public class javacollection3 {
    public static void main(String[] args) {
        Vector<String> a1 = new Vector<String>();
        a1.add(0, "Ravi");
        a1.add(1, "Vijay");
        a1.add(2, "Gaurav");
        a1.add(3, "Ajay");
        a1.addElement("Rohith");
        System.out.println(a1.capacity());
        String s1 = a1.firstElement();
        System.out.println(s1);
        String s2 = a1.lastElement();
        System.out.println(s2);
        Iterator<String> itr = a1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
