package labOne;
public class CourseWithStudentsAndTeachers {
    public static void main(String[] args) {
        Course IK162 = new Course("OOP and Data Structure", "1IK162");
        String [] students = {"John", "Anita", "Britney", "Denis", "Gresa"};
        String [] teachers = {"Fisnik", "Zenun"};
        for (int i = 0; i < students.length; i++) {
            IK162.addStudents(students[i]);
        }
        for (int i = 0; i < teachers.length; i++){
            IK162.addTeachers(teachers[i]);
        }

        String [] currentStudents = IK162.showRegisteredStudents();
        System.out.println("List of students registered in the course " +IK162.getCourseName() +" " + IK162.getCourseCode() +": ");
        for (int i = 0; i < students.length; i++){
            System.out.println(i+1 + ". "+ currentStudents[i]);
        }

        String [] currentTeachers = IK162.showRegisteredTeachers();
        System.out.println("List of teachers involved in the course " + IK162.getCourseName() +" " + IK162.getCourseCode()+": ");
        for (int i = 0; i < currentTeachers.length; i++){
            System.out.println(i + 1 + ". " + currentTeachers[i]);
        }
        IK162.removeStudents();
        System.out.println("list of remaining students in the course " + IK162.getCourseName() + " " + IK162.getCourseCode()+ ": ");
        String [] removeStudents = IK162.showRegisteredStudents();
        for(int i = 0; i < removeStudents.length; i++){
            System.out.println(i + 1 + ". " + removeStudents[i]);
        }
    }
    }

