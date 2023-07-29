
public class lambda1 {
    public static void main(String[] args) {
        int width = 10;
        Drawable1 d1 = () -> {
            System.out.println("Drawing: " + width);
        };
        d1.draw1();
    }
}
