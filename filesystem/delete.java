import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class delete {
    public static void main(String[] args) {
         File file = new File("example.txt");
         if (file.delete()) {
             System.out.println("Deleted the file: " + file.getName());
         } else {
             System.out.println("Failed to delete the file.");
         }
     }
 }
