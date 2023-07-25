package package1;

public class javaapplication166 {
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        Student s1=new Student(1001,"Rohith");
        System.out.println(s1.getRollno());
        System.out.println(s1.getStu_name());
        s1.setRollno(1002);
        System.out.println("New Roll No "+s1.getRollno());
        s1.setStu_name("Rohith Manjunath");
        System.out.println("New Student Name "+s1.getStu_name());
    }
}
