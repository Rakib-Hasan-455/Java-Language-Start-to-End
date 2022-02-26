//Name: Md. Rakibul Hasan
//ID  : 2020000000144

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fR = new FileReader("StudentInformation.csv");
        BufferedReader bR = new BufferedReader(fR);
        String str = "";
        String tempLine = "";
        while ((tempLine = bR.readLine()) != null){
            str = str + tempLine;
            str = str + "\n";
        }
        str = String.join("",str.split(" "));
        str = str.replace(","," ");
        StringTokenizer st = new StringTokenizer(str);
        String batch = "";
        while (st.hasMoreTokens()){
            String word = st.nextToken();
            boolean isNumeric = word.chars().allMatch( Character::isDigit);
            if(word.length() == 2 &&  isNumeric){
                batch = batch + word;
                batch = batch + " ";
            }
        }
        int arr[] = Arrays.stream(batch.split(" ")).mapToInt(Integer::parseInt).toArray();

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        int count = 0;
        for(Integer iterator: map.keySet()){
            System.out.println("Batch : "+iterator+" = Total Students: "+map.get(iterator));
            count += map.get(iterator);
        }
    }
}