package labOne;
class Student {
    private String name;
    private int studentID;
    private String email;
    //TODO fix variableNames;
    //TODO clean code
    public Student(){}

    Student(String Name, int StudentID, String Email){
        name = Name;
        studentID = StudentID;
        email = Email;
    }

    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public int getStudentID(){
        return studentID;
    }
    public void setStudentID(int newStudentId){
        this.studentID = newStudentId;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String newEmail){
        this.email = newEmail;
    }
}
