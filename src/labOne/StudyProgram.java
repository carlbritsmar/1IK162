package labOne;
import java.util.Scanner;

public class StudyProgram {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        Course[] courses= new Course[5];            
        int courseCount = 0;                         

        while (true){
            System.out.println("1. Display courses and students");
            System.out.println("2. Create a course ");
            System.out.println("3. Exit ");
            System.out.print("Enter value: ");
            int n = input.nextInt();

            if (n == 1){                                        //Exception
                if (Course[0] == null) {
                    System.out.println("No course is established yet");
                }else {
                    //Printing code,cname and copying array
                    for (int i = 0; i < courseCount ; i++) {
                        System.out.println("  Course code: " + courses[i].getcCode());
                        System.out.println("  Course name: " + courses[i].getcName());
                        Student[] s = courses[i].visaRegistreradeStudenter();
                        //Printing names, id and emails
                        for (int j = 0; j < s.length; j++) {
                            System.out.println("    " + (j + 1) + "." + " " + s[j].getName() + " " + s[j].getId() + s[j].getEmail());
                        }
                        System.out.println();
                    }
                }
            }



            if (x == 2){
                Course currentCourse = new Course();        //Create new course
                kurser[courseCount] = currentCourse;          //Assign the new course to kurser at the count
                courseCount++;                                //Increment the count after
                System.out.print("Course code: ");
                currentCourse.setcCode(input.next());
                System.out.print("Course name: ");
                currentCourse.setcName(input.next());
                System.out.print("Num of students to be enrolled: ");
                int antalStudenter = input.nextInt();


                System.out.print("Do you want to add students to the course? (Y/N) ");
                String addStudent = input.next();
                if (addStudent.equals("n")){
                    break;
                }else {
                    for (int j = 0; j < antalStudenter; j++) {
                        System.out.println("Add student, type stop to quit");
                        Student student = new Student();                    //Create new student

                        System.out.print("Name: ");
                        String nameStop = input.next();             //Needed for stop

                        if (nameStop.equalsIgnoreCase("stop")){             //Exception
                            break;
                        }else {
                            System.out.print("ID: ");
                            student.setId(input.nextInt());
                            System.out.print("Email: ");
                            student.setEmail(input.next());
                            student.setName(nameStop);
                            currentCourse.addStudent(student);          //At current course, add the student created
                        }
                    }
                }
            }
            if (x == 3){
                System.out.println("Exiting the program..");
                break;
            }
        }
    }
}