interface sayaable {
    void say(String msg);
    default void show(){
        System.out.println("Show method");
    }
    static void hello(){
        System.out.println("Hello");
    }
}