import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Locale;
import java.util.StringTokenizer;

public class TextFileAnalylis {

    int totalLine = 0;
    int totalWord = 0;
    int totalSen = 0;
    int totalVowel = 0;

    String fileReader(String path){
        String fileText = "";
        String tempLine = "";
        try{
            FileReader fR = new FileReader(path);
            BufferedReader bR = new BufferedReader(fR);
            while((tempLine = bR.readLine()) != null){
                totalLine++;
                fileText += tempLine;
                fileText += "\n";
                StringTokenizer st = new StringTokenizer(tempLine);
                while (st.hasMoreTokens()){ //read every word of a line/string
                    totalWord++;
                    String tempWord = st.nextToken(); //saves the string word into tempword
                    tempWord = tempWord.toLowerCase(Locale.ROOT);
                    for (int i = 0; i < tempWord.length(); i++){
                        if(tempWord.charAt(i) == '.'){
                            totalSen++;
                        } else if(tempWord.charAt(i) == 'a' ||
                                tempWord.charAt(i) == 'e' ||
                                tempWord.charAt(i) == 'i' ||
                                tempWord.charAt(i) == 'o' ||
                                tempWord.charAt(i) == 'u') {
                            totalVowel++;
                        }
                    }
                }
            }
        } catch (Exception e){
            System.out.println("Error: "+e);
        }
        return fileText;
    }

    public static void main(String[] args) {
        String fileText = "";
        TextFileAnalylis tA = new TextFileAnalylis();

        fileText = tA.fileReader("text.txt");
        System.out.println(fileText);
        System.out.println("Total Line: " +tA.totalLine);
        System.out.println("Total Sentence: " +tA.totalSen);
        System.out.println("Total Word: " +tA.totalWord);
        System.out.println("Total Vowel: " +tA.totalVowel);
        }
}