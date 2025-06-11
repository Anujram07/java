import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class createfile {
    public static void main(String[] args) {
        try {
            File file = new File("new.txt");
            if(file.createNewFile()){
                System.out.println("File Created" + file.getName());
            } else {
                System.out.println("File already Exist.");
            }
            
            
        } catch (IOException e) {
            System.out.println("An Error occurred");
            e.printStackTrace();
        }
    }
}
