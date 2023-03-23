package labTwo;
import java.util.*;

public class Assignment3{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an sentence: ");
        String sentence = input.nextLine();

        String[] words = sentence.split(" ");

        Queue<String> readWords = new PriorityQueue<>(String::compareToIgnoreCase);
        for (String word : words) {
            readWords.add(word);
        }
        System.out.print(readWords);

    }
}