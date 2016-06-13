
package film;

public class KortFilm extends Film {
public String sort;

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public KortFilm(String sort) {
        this.sort = sort;
    }
    
    public KortFilm() {
        this.sort = "Default sort";
    }

    public KortFilm(String sort, String titel, String huvudroll, String typ, int lenght) {
        super(titel, huvudroll, typ, lenght);
        this.sort = sort;
    }
@Override
public void skrivUt(){
        super.skrivUt();
        System.out.println("Sort: " + sort);
        System.out.println(" ");
    }
}
