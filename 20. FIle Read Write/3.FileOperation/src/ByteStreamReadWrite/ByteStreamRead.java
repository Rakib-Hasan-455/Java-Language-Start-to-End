package ByteStreamReadWrite;

import java.io.FileInputStream;

public class ByteStreamRead {
    public static void main(String[] args) {
        try {
            FileInputStream fIn = new FileInputStream("test1.txt");
            int i = 0;
            while ((i = fIn.read()) != -1) {
                System.out.print((char)i);
            }
            fIn.close();
        } catch(Exception e) {
                System.out.println("Error: " + e);
            }
        }
    }
