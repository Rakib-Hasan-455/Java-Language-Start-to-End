//Name: Md. Rakibul Hasan
//ID  : 2020000000144

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class AR_FInal_3_ID_Extract {
   public static void main(String[] args) throws IOException {
      FileReader fR = new FileReader("finalTest3.txt");
      BufferedReader bR = new BufferedReader(fR);
      String str = "";
      String tempLine = "";
      while ((tempLine = bR.readLine()) != null){
         str = str + tempLine;
         str = str + "\n";
      }
      str = String.join("",str.split(" "));
      str = str.replace(":"," ").replace(".", " ").replace(","," ").replace("\n", " ");
      StringTokenizer st = new StringTokenizer(str);
      String id = "";
      System.out.println(str);
      while (st.hasMoreTokens()){
         String word = st.nextToken();
         boolean isNumeric = word.chars().allMatch( Character::isDigit);
         if(word.length() == 13 &&  isNumeric){
            id = id + word;
            id = id + "\n";
         }
      }
      System.out.println(id);
   }
}