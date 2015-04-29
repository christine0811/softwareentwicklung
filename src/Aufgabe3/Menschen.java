
package Aufgabe3;


public class Menschen 
{
    String Vorname;
    String Nachname;
    int Alter;

    public Menschen(String Vorname, String Nachname, int Alter) {
        this.Vorname = Vorname;
        this.Nachname = Nachname;
        this.Alter = Alter;
    }
    public void Status ()
    {
        System.out.println("Es handelt sich um einen Menschen: " + Vorname + " " + Nachname + ", " + Alter);
        
    }
    
    
}
