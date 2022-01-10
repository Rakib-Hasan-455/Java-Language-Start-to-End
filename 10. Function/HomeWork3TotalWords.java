import java.util.Scanner;

public class HomeWork3TotalWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int tWord = getWordsAmount(text);
        System.out.println(tWord);
    }

    public static int getWordsAmount(String text) {
        int tWord = 1;
//        System.out.println(text.length());
        for (int i = 0; i < text.length(); i++){
        if(text.charAt(i) == ' '){
            tWord++;
        }
        }
        return tWord;
    }
}
