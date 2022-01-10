import java.util.Locale;
import java.util.Scanner;

public class HomeWork10FirstLetterUpCase {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter any text: ");
        String userInput = sc.nextLine();
        System.out.println(firstCharToTitleCase(userInput));
        System.out.println(firstCharToTitleCase1(userInput));
    }

    private static String firstCharToTitleCase1(String string) {
        string = string.toLowerCase(Locale.ROOT);
        char[] strChars = string.toCharArray();
        strChars[0] = Character.toUpperCase(strChars[0]);
        boolean firstUpperCase = false;
        for (int i = 0; i < strChars.length; i++) {
            if(!firstUpperCase && Character.isLetter(strChars[i])){
                strChars[i] = Character.toUpperCase(strChars[i]);
                firstUpperCase = true;
            } else if (Character.isWhitespace(strChars[i])) {
                firstUpperCase = false;
            }
        }
        string = String.valueOf(strChars);
        return string;
    }

    public static String firstCharToTitleCase(String string) {
    string = string.toLowerCase(Locale.ROOT);
    char[] strChars = string.toCharArray();
    strChars[0] = Character.toUpperCase(strChars[0]);
    for (int i = 0; i < strChars.length; i++) {
        if(strChars[i] == ' ' && Character.isLetter(strChars[i+1])){
            strChars[i+1] = Character.toUpperCase(strChars[i+1]);
        }
    }
    string = String.valueOf(strChars);
    return string;
    }
}
