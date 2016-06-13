
package film;

public class TypAvVideo extends KortFilm{
public String genre;

    public String getGenre() {
        return genre;
    }

    public TypAvVideo() {
        super();
        this.genre = "Default genre";
    }
    
    public TypAvVideo(String genre, String sort) {
        super(sort);
        this.genre = genre;
    }

    public TypAvVideo(String genre) {
        this.genre = genre;
    }

    public TypAvVideo(String genre, String sort, String titel, String huvudroll, String typ, int lenght) {
        super(sort, titel, huvudroll, typ, lenght);
        this.genre = genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
@Override
public void skrivUt(){
        super.skrivUt();
        System.out.println("Genre: " + genre);
        System.out.println(" ");
    }
}
