import java.util.*;
class test{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        list.add(18);
        list.add(19);
        list.add(20);
        list.add(21);
        list.add(21);
        list.add(21);
        list.add(21);
        list.add(21);
        list.add(21);
        list.add(21);
        list.add(21);
        list.add(21);
        list.add(21);
        list.add(21);
        //list.add(32); //compile time error
        Integer s = list.get(19);//type casting is not required
        System.out.println("element is: "+s );
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    list.ensureCapacity(20);
    System.out.println("Size: "+list.size());
    }
}