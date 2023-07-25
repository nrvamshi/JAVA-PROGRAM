class vec {
    void run(){
        System.out.println("Vehicle is running");
    }
}
class bike extends vec{
    void run(){
        System.out.println("Bike is running safely");
    }
}
class MethodOveriding{ 
    public static void main(String[] args) {
        bike o = new bike();
        o.run();
    }
}