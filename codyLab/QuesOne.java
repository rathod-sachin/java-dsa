package codyLab;
import java.util.Scanner;

public class QuesOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = in.nextLine();

        str = str + " ";
        String word = "";
        StringBuilder maxWord = new StringBuilder();
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = Character.toLowerCase(str.charAt(i));

            if (ch == 'a' ||
                    ch == 'e' ||
                    ch == 'i' ||
                    ch == 'o' ||
                    ch == 'u') {
                count++;
            }

            if (ch == ' ') {
                if (count > maxCount) {
                    maxCount = count;
                   word = maxWord.toString();
                }
                maxWord = new StringBuilder();
                count = 0;
            }
            else {
                maxWord.append(ch);
            }
        }
        System.out.println(word);
    }
}
