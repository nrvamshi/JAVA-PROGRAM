package Project6;

public class java {
    public static void main(String[] args) {
        try{
            int data = 100/10;
            System.out.println(data);
            String s = "asdf";
            System.out.println(s.length());
            String a = "123";
            int i = Integer.parseInt(a);
            System.out.println(i);
            int c[] = new int[5];
            c[6] = 2000;
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
