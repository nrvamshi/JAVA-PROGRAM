import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class readfile{
    public static void main(String[] args){
        try{
            File myObj = new File("f.txt");
            Scanner myreader = new Scanner(myObj);
            while (myreader.hasNextLine()){
                String data = myreader.nextLine();
                System.out.println(data);
            }
            myreader.close();
        }
        catch (FileNotFoundException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}