
package film;

public class LongFilm extends Film{
public String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LongFilm() {
        super();
        this.location = "Default location";
    }

    public LongFilm(String location) {
        this.location = location;
    }

    public LongFilm(String location, String titel, String huvudroll, String typ, int lenght) {
        super(titel, huvudroll, typ, lenght);
        this.location = location;
    }



@Override
public void skrivUt(){
        super.skrivUt();
        System.out.println("Location: " + location);
        System.out.println(" ");
    }

}
