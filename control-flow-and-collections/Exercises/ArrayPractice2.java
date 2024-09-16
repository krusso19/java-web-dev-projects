import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {
        String foxString = "I would not, could not, in a box.";
        String[] foxWords = foxString.split(" ");
        System.out.println(Arrays.toString(foxWords));
        }
}