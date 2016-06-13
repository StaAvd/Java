package film;

public class Film {
    private String titel;
    private String huvudroll;
    private String typ;
    private int lenght;

    public Film() {
        this.titel = "Default titel";
        this.huvudroll = "Default huvudroll";
        this.typ = "Default typ";
        this.lenght = 0;
    }

    public Film(String titel, String huvudroll, String typ, int lenght) {
        this.titel = titel;
        this.huvudroll = huvudroll;
        this.typ = typ;
        this.lenght = lenght;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setHuvudroll(String huvudroll) {
        this.huvudroll = huvudroll;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public String getTitel() {
        return titel;
    }

    public String getHuvudroll() {
        return huvudroll;
    }

    public String getTyp() {
        return typ;
    }

    public int getLenght() {
        return lenght;
    }
    
    public void skrivUt(){
        System.out.println("Titel: " + titel);
        System.out.println("HuvudRoll: " + huvudroll);
        System.out.println("Type: " + typ);
        System.out.println("Lenght: " + lenght);
        System.out.println(" ");
    }
}
