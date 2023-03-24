package labOne;
class Course {
    private String courseName;
    private String courseCode;
    private int maxNumOfStudents = 30;
    private int maxNumOfTeachers = 5;
    private int numOfRegisteredStudents = 0;
    private int numOfRegisteredTeachers = 0;
    private  String [] listOfStudents = new String[30];
    private  String [] listOfTeachers = new String[5];

    public Course() {
    }
    Course(String courseName, String courseCode){
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public void addStudents(String newStudent) {
        if (numOfRegisteredStudents != maxNumOfStudents) {
                listOfStudents[numOfRegisteredStudents] = newStudent;
            numOfRegisteredStudents++;
        }
        }

    public void addTeachers(String newTeacher) {
        if (numOfRegisteredTeachers != maxNumOfTeachers) {
            listOfTeachers[numOfRegisteredTeachers] = newTeacher;
            numOfRegisteredTeachers++;
        }
    }
    
    public void removeStudents() {
        String [] removeStudentArr = new String [numOfRegisteredStudents];
        int position = 3;
        if (numOfRegisteredStudents != 0) {
            for (int i = 0, k = 0; i < numOfRegisteredStudents; i++) {
                if (i == position) {
                    continue;
                } else
                    removeStudentArr[k] = listOfStudents[i];
                k++;
                }}
        numOfRegisteredStudents--;
        listOfStudents = removeStudentArr;
            }

    public void removeTeachers(String removeTeachers) {
        if (numOfRegisteredTeachers != 0) {
            listOfTeachers[numOfRegisteredTeachers] = removeTeachers;
            numOfRegisteredTeachers--;
        }}

    public String[] showRegisteredStudents(){
        String [] list = new String[numOfRegisteredStudents];
        for (int i = 0; i < numOfRegisteredStudents; i++){
            list[i] = listOfStudents[i];
        }
        return list;
    }

    public String[] showRegisteredTeachers(){
        String [] list = new String[numOfRegisteredTeachers];
        for (int i = 0; i < numOfRegisteredTeachers; i++) {
            list[i] = listOfTeachers[i];
        }
        return list;
    }

    public String getCourseCode() {
        return courseCode;
    }
    public void setCourseCode(String newCourseCode){
        this.courseCode = newCourseCode;
    }
    public String getCourseName(){
        return courseName;
    }
    public void setCourseName(String newCourseName){
        this.courseName = newCourseName;
    }
    public int getMaxNumOfStudents(){
        return maxNumOfStudents;
    }
    public void setMaxNumOfStudents(int newMaxnumOfStudents){
        this.maxNumOfStudents = newMaxnumOfStudents;
    }

}
