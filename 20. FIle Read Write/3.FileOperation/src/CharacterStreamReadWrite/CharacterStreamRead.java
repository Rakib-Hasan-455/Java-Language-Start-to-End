package CharacterStreamReadWrite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class CharacterStreamRead {
    public static void main(String[] args) {
        try {
            FileReader fR = new FileReader("test2.txt");
          //  BufferedReader bufferedReader = new BufferedReader(fR);

            int i;
            while ((i = fR.read()) != -1){
                System.out.print((char) i);
            }
            fR.close();
        } catch ( Exception e ) {
            System.out.println("Error: " +e);
        }
    }
}
