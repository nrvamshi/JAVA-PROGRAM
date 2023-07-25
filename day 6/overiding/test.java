class test
{
    public static void main(String[] args){
        SBI s=new SBI();
        AXIS a=new AXIS();
        ICICI i=new ICICI();
        System.out.println("SBI Rate of Intrest: "+s.getrateofInterest_FD());
        System.out.println("AXIS Rate of Intrest: "+a.getrateofInterest_FD());
        System.out.println("ICICI Rate of Intrest: "+i.getrateofInterest_FD());

    }
}