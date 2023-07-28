import java.util.*;

public class mapex2 {

    public static void main(String[] args) {
        Map<Integer, cap> map = new HashMap<Integer, cap>();
        cap c1 = new cap("India", "New Delhi");
        cap c2 = new cap("USA", "Washington DC");
        cap c3 = new cap("UK", "London");
        map.put(1, c1);
        map.put(2, c2);
        map.put(3, c3);
        for (Map.Entry<Integer, cap> entry : map.entrySet()) {
            int key = entry.getKey();
            cap c = entry.getValue();
            System.out.println(key + " Details: ");
            System.out.println(c.country + " " + c.capital);
        }
    }
}