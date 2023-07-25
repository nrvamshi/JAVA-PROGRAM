ipackage interface_ex;

interface printable{
    void print();
}

package interface_ex;

public class A6 implements printable{
    public void print(){
        System.out.println("helloo");
    }
}


package interface_ex;

public class Test {
    public static void main(String[] args) {
        A6 obj=new A6();
        obj.print();//u can use the main in a separate class also
    }
}
