
package Aufgabe3;


public class Student extends Menschen {
    String Matrikelnummer;
    String Studiengang;

    public Student(String Vorname, String Nachname, int Alter, String Matrikelnummer, String Studiengang) {
        
        super (Vorname, Nachname, Alter);
        this.Matrikelnummer = Matrikelnummer;
        this.Studiengang = Studiengang;
    }

    @Override
    public void Status() {
        System.out.println("Es handelt sich um einen Studenten " + Vorname +" " + Nachname + ", " + Alter +", " + Matrikelnummer + ", " + Studiengang);
    }
    
    public static void main (String [] args)
    {
        Menschen Brigitte = new Menschen ("Brigitte", "Schuler", 21);
        Brigitte.Status();
        Student Biggi = new Student ("Brigitte", "Schuler", 21, "140398751", "Web");
        Biggi.Status();
    }
    
}
