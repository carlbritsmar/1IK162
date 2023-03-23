package labTwo;

import java.util.*;
import java.util.Scanner;
import java.util.Stack;

    public class Assignment2 {

        static void pushNumbers(Stack<Integer> readNumbers) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter 10 numbers: ");

            for (int i = 0; i < 10; i++){
                int duplicates = input.nextInt();
                if(readNumbers.isEmpty() || duplicates != readNumbers.peek()) {
                    readNumbers.push(duplicates);
                }
            }
            System.out.println(readNumbers);
        }
        static void iterateNumbers(Stack<Integer> readNumbers){
            while(!readNumbers.isEmpty()){

                System.out.print(readNumbers.pop()+ " ");
            }


        }

        public static void main(String[] args) {

            Stack<Integer> readNumbers = new Stack<>();
            pushNumbers(readNumbers);
            iterateNumbers(readNumbers);


        }
    }




