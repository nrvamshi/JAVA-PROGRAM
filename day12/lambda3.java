public class lambda3 {
    public static void main(String[] args) {
        adder a1 = (a, b) -> {
            return "Sum: " + (a + b);
        };
        System.out.println(a1.call(10, 20));
        multi a2 = (a, b) -> {
            return "Multiplication: " + (a * b);
        };
        System.out.println(a2.mul(100, 2));
    }
}