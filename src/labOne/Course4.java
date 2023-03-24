package labOne;

public class Course4
{
    private String Kurskod;
    private String Kursnamn;
    private Student [] listaAvStudenter = new Student[30];
    private Teacher [] listAvLarare = new Teacher[5];
    private int maxNumAvStudenter;
    private int maxNumAvLarare;
    private int numAvRegStudenter = 0;
    private int NumAvRegLarare = 0;

    public Course4(){}

    Course4(String Kursnamn, String Kurskod, int maxNumAvStudenter,int maxNumAvLarare){
        this.Kursnamn = Kursnamn;
        this.Kurskod = Kurskod;
        this.maxNumAvStudenter = maxNumAvStudenter;
        this.maxNumAvLarare = maxNumAvLarare;
    }

    public String getKursKod() {
        return Kurskod;
    }
    public void setCourseCode(String nyKurskod){
        this.Kurskod = nyKurskod;
    }
    public String getKursnamn(){
        return Kursnamn;
    }
    public void setKursnamn(String nyKursNamn){
        this.Kursnamn = nyKursNamn;
    }
    public Teacher[] visaRegistreradeLarare(){
        Teacher [] lista = new Teacher[NumAvRegLarare];
        for (int i = 0; i < NumAvRegLarare; i++){
            lista[i] = listAvLarare[i];
        }
        return lista;
    }

    public Student[] visaRegistreradeStudenter(){
        Student [] lista = new Student[numAvRegStudenter];
        for (int i = 0; i < numAvRegStudenter; i++) {
             lista[i] = listaAvStudenter[i];
        }
        return lista;
    }
    public void adderaStudent(Student nyStudent){
        if (numAvRegStudenter != maxNumAvStudenter){
            listaAvStudenter [numAvRegStudenter++] = nyStudent;
        }
    }
    public void adderaLarare(Teacher larare){
        if (NumAvRegLarare != maxNumAvLarare){
            listAvLarare [NumAvRegLarare++] = larare;
        }
    }

}
