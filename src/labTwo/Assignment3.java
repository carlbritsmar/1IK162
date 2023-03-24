package labTwo;
import java.util.*;

public class Assignment3{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an sentence: ");
        String sentence = input.nextLine();
        String[] words = sentence.toLowerCase().split(" ");

        Queue<String> readWords = new LinkedList<>();
        Collections.addAll(readWords, words);

        List<String> arraylistofQueue = new ArrayList<>(readWords);
        Collections.sort(arraylistofQueue);

        for (String word : arraylistofQueue) {
            System.out.println(word);
        }


    }
}