import java.util.ArrayList;
import java.util.Scanner;

public class printWords {
    public static void main (String[] args){
        ArrayList <String> words = new ArrayList<>();
        words.add("Potato");
        words.add("Soup");
        words.add("Bread");
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int length = input.nextInt();
        for (String s : words){
            if (s.length() == length){
                System.out.println(s);
            }
        }
    }
}
