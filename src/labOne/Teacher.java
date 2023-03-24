package labOne;

public class Teacher {
   private String name;
    private String role;
    private String email;

     Teacher(){}

    Teacher(String name, String role, String email){
        this.name = name;
        this.role = role;
        this.email = email;
    }

    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getRole(){
        return role;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public void setRole(String newRole){
        this.role = newRole;
    }
    public void setEmail (String newEmail){
        this.email = newEmail;
    }

}
