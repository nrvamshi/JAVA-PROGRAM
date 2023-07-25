import java.util.Scanner;
import java.io.IOException;
import java.io.File;
public class delete {
    public static void main(String[] args) {
        String filepath;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the directory path for deleting a directory");
        filepath = sc.nextLine();
        sc.close();
        File file = new File(filepath);
        try{
            deleteDirectory(file);
            file.delete();
            System.out.println("Your directory is deleted successfully");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void deleteDirectory(File file){
        for(File subfile : file.listFiles()){
            if(subfile.isDirectory()){
                deleteDirectory(subfile);
            }
            subfile.delete();
        }
    }
}
