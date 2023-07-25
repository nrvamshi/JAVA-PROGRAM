package package1;

public class Student {
    private int rollno;
    private String Stu_name;
    public Student(int rollno, String stu_name) {
        this.rollno = rollno;
        Stu_name = stu_name;
    }
    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public String getStu_name() {
        return Stu_name;
    }
    public void setStu_name(String stu_name) {
        Stu_name = stu_name;
    }
}
