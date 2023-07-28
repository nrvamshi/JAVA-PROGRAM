import java.util.*;

class cfg1 {
    public static void main(String[] args) {
        Hashtable<String, Integer> ht = new Hashtable<>();
        ht.put("Vishal", 10);
        ht.put("Sachin", 20);
        ht.put("vaibhav", 30);
        System.out.println("size of map is:- " + ht.size());
        System.out.println(ht);
        if (ht.containsKey("vishal")) {
            Integer a = ht.get("vishal");
            System.out.println("value for key" + "\"vishal\"is:- " + a);
        }
    }
}