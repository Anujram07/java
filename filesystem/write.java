import java.io.FileWriter;
import java.io.IOException;

public class write {
    public class writefile{
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("new.txt");
            writer.write("Hello! Welcome to my youtube channel");
            writer.close();
            System.out.println("Succusfully Written!");
        } catch (IOException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}

}
