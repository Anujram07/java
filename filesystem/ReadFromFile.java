import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

// public class createfile {
//     public static void main(String[] args) {
//         try {
//             File file = new File("new.txt");
//             if(file.createNewFile()){
//                 System.out.println("File Created" + file.getName());
//             } else {
//                 System.out.println("File already Exist.");
//             }
            
            
//         } catch (IOException e) {
//             System.out.println("An Error occurred");
//             e.printStackTrace();
//         }
//     }
// }


// public class writefile{
//     public static void main(String[] args) {
//         try {
//             FileWriter writer = new FileWriter("new.txt");
//             writer.write("Hello! Welcome to my youtube channel");
//             writer.close();
//             System.out.println("Succusfully Written!");
//         } catch (IOException e) {
//             System.out.println("An error occured.");
//             e.printStackTrace();
//         }
//     }
// }


 public class ReadFromFile {
    public static void main(String[] args) {
         try {
             File file = new File("example.txt");
             Scanner scanner = new Scanner(file);
             while (scanner.hasNextLine()) {
                 String data = scanner.nextLine();
                 System.out.println(data);
             }
             scanner.close(); 
         } catch (FileNotFoundException e) {
             System.out.println("An error occurred.");
             e.printStackTrace();
         }
     }
 }


 
 

//  public class DeleteFile {
//     public static void main(String[] args) {
//          File file = new File("example.txt");
//          if (file.delete()) {
//              System.out.println("Deleted the file: " + file.getName());
//          } else {
//              System.out.println("Failed to delete the file.");
//          }
//      }
//  }
