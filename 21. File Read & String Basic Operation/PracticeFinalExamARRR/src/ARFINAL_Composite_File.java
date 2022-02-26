//Name: Md. Rakibul Hasan
//ID  : 2020000000144

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ARFINAL_Composite_File {
   public static boolean compositeCheck(int n){
      for(int i = 2; i < n/2; i++){
         if(n % i == 0){
            return true;
         }
      }
      return false;
   }

   public static void main(String[] args) throws IOException {
      FileReader fR = new FileReader("finalTest1.txt");
      BufferedReader bR = new BufferedReader(fR);
      String str = "";
      String tempLine = "";
      int sum = 0;
      while ((tempLine = bR.readLine()) != null){
         str = str + tempLine;
      }
       str = String.join("",str.split(" "));
      int arr1[] = Arrays.stream(str.split(",")).mapToInt(Integer::parseInt).toArray();
      for(int i = 0; i < arr1.length; i++){
         if(compositeCheck(arr1[i])) {
            sum = sum + arr1[i];
         }
      }
      System.out.println(sum);
   }
}