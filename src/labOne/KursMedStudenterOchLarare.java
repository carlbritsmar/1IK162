package labOne;

public class KursMedStudenterOchLarare {

    public static void main(String[] args) {

        Courseassig4 IK164 = new Courseassig4("Introduction to Machine learning", "1IK164", 30, 5);
        Student [] studenter = new Student[5];
        Teacher [] larare = new Teacher[2];
        studenter[0] = new Student("John", 122, "jd222vd@student.lnu.se");
        studenter[1]= new Student("Anita", 123, "am222vd@student.lnu.se");
        studenter[2]= new Student("Britney", 124, "bp223tr@student.lnu.se");
        studenter[3] = new Student("Denis", 125, "df222vp@student.lnu.se");
        studenter[4] = new Student("Gresa", 126, "gj225qx@student.lnu.se");
        larare[0] = new Teacher("Zenun Kastrati", "Course responsible", "zenun.kastrati@lnu.se");
        larare[1] = new Teacher("Fisnik Dalipi", "Examiner", "fisnik.dalipi@lnu.se");
        for (int i = 0; i < studenter.length; i++){
            IK164.adderaStudent(studenter[i]);
        }
        for (int i = 0; i < larare.length; i++){
            IK164.adderaLarare(larare[i]);
        }

        Student [] aktuellaStudenter = IK164.visaRegistreradeStudenter();
        System.out.println("Lista av studenter involverade i kursen " + IK164.getKursnamn() + " " + IK164.getKursKod() + ": ");
        System.out.println("Nr"+ "\t" +"ID"+ "\t\t"+ "Namn"+ "\t\t\t" + "E-mail" );
        for (int i = 0; i < aktuellaStudenter.length; i++) {
            System.out.println(i+1 + "\t" + aktuellaStudenter[i].getStudentID()+"\t\t" + aktuellaStudenter[i].getName()+ "\t\t\t" + aktuellaStudenter[i].getEmail());
        }
        Teacher [] aktuellaLarare = IK164.visaRegistreradeLarare();
        System.out.println("Lista av lärare involverade i kursen " + IK164.getKursnamn() + " " + IK164.getKursKod() + ": ");
        System.out.println("Nr  " + " " +"Namn          "+""+ "       Roll       "+ "            " + "E-mail" );

        for (int i = 0; i < aktuellaLarare.length; i++) {
            System.out.println(i + 1 +"    "+aktuellaLarare[i].getName()+"       "+ aktuellaLarare[i].getRole()+  "      "+ aktuellaLarare[i].getEmail());
        }
    }
}