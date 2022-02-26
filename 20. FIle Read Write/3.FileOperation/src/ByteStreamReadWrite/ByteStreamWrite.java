package ByteStreamReadWrite;

import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ByteStreamWrite {
    public static void main(String[] args) {
        try {
            FileOutputStream fOut = new FileOutputStream("test1.txt");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            byte b[] = s.getBytes();
            fOut.write(b);
            fOut.close();

        } catch (Exception e){
            System.out.println("Error: "+e);
        }
    }
}
