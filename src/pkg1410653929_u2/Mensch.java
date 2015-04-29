
package pkg1410653929_u2;


public class Mensch extends Saeugetiere
{

    public Mensch(String Name, int Alter, String Geschlecht) {
        super(Name, Alter, Geschlecht);
    }

    @Override
    public String printAll() {
        return Name + "#" + Alter + "#" + Geschlecht;
    }
    


    
    public static void main(String[] args) 
    {
        Mensch Julia = new Mensch ("Brigitte", 21, "weiblich");
        
        System.out.println(Julia.printAll());
        
        
        
    }

}
