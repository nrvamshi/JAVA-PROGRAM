import java.util.*;
public class indexof {
    public static void main(String[] args) {
        List<Integer> numbers2 = new ArrayList<Integer>();
        numbers2.add(1);
        numbers2.add(2);
        numbers2.add(3);
        numbers2.add(4);
        numbers2.add(5);
        numbers2.add(2);
        System.out.println(numbers2);
       int lastIndex = numbers2.lastIndexOf(2);
       System.out.println("The last occurance of 2 is at index " + lastIndex); 
    }
}
