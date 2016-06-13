
package film;

public class MainFilm {

    public static void main(String[] args) {
    LongFilm lf;
    KortFilm kf;
    TypAvVideo a;
    
    lf = new LongFilm();
    kf = new KortFilm();
    a = new TypAvVideo("Clip","SORT1","TITEL1","Angelina Goly","Action",200);
    lf.skrivUt();
    kf.skrivUt();
    a.skrivUt();
    }
    
}
