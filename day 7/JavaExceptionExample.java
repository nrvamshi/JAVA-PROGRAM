package Project5;

public class JavaExceptionExample {
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
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("rest of code");
    }
}
