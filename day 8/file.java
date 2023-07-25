import java.io.IOException;
import java.io.File;

public class file {
    public static void main(String args[])
    {
        try{
            File myObj = new File("D:/java program 0054/day8/file.txt");
            if(myObj.createNewFile())
            {
                System.out.println("File created : " +myObj.getName());
            }
            else
            {
                System.out.println("File already exists");
            }
        }
        catch(IOException e)
        {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }

    
}
