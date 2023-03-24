package labTwo;

import java.util.HashMap;
import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        String str1 = "Yes";
        String check;
        String CourseCode;

        HashMap<String, String> Courses = new HashMap<>();

        Courses.put("1IK161", "Fundamentals of programming");
        Courses.put("1IK162", "object oriented programming and Data structure");
        Courses.put("1IK172", "Introduction to Data Analytics");
        Courses.put("1IK163", "Development of Web Based Applications");
        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a course code: ");
            CourseCode = input.nextLine();

            if (Courses.containsKey(CourseCode)) {
                System.out.println("The course name for " + CourseCode + " is " + Courses.get(CourseCode));
            }
            else {
                System.out.println("Course not found");
            }
            System.out.print("Type yes to continue: ");
            check = input.nextLine();
        } while (check.equalsIgnoreCase(str1));


    }
}