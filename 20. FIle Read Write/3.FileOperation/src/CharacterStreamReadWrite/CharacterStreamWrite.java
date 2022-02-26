package CharacterStreamReadWrite;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharacterStreamWrite {
    public static void main(String[] args) {

        try {
            FileWriter fW = new FileWriter("test2.txt");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            fW.write(s);
            fW.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
