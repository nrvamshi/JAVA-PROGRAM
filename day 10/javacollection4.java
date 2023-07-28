import java.util.Iterator;
import java.util.Stack;

public class javacollection4 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        System.out.println("Is stack empty: " + stack.empty());
        stack.push("Car");
        stack.push("Car1");
        stack.push("Car2");
        stack.push("Car3");
        stack.push("Car4");
        System.out.println("Data in stack: " + stack);
        System.out.println("Is stack empty: " + stack.empty());
        stack.pop();
        System.out.println(stack.peek());
        Iterator<String> itr = stack.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
