import java.util.*;

public class mapex {
    public static void main(String[] args) {
        Map<Integer, Book> map = new HashMap<Integer, Book>();
        Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2 = new Book(102, "Data Communication and networking", "Forouzan", "Mc Graw Hill", 8);
        Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
        map.put(1, b1);
        map.put(2, b2);
        map.put(3, b3);
        for (Map.Entry<Integer, Book> entry : map.entrySet()) {
            int key = entry.getKey();
            Book b = entry.getValue();
            System.out.println(key + " Details: ");
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }
}