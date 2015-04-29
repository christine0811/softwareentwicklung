
package pkg1410653929_u2;


abstract class Saeugetiere { //Abstrakte Klasse Säugetiere implementieren
    String Name; // Attribute/Eigenschaften
    int Alter;
    String Geschlecht;

    public Saeugetiere(String Name, int Alter, String Geschlecht) { //Konstruktor
        this.Name = Name;
        this.Alter = Alter;
        this.Geschlecht = Geschlecht;
    }
    
    public abstract String printAll(); //abstrakte Methode mit String als return Wert, wird mit Semikolon geschlossen
   
    
    
}
