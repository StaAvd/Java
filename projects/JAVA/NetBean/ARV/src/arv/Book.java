/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arv;

/**
 *
 * @author Elev8
 */
public class Book {
    
    public String ISBN;

    public String titel;

    public String author;

    public int price;

    public Book(){
        setISBN("000000");
    
        setTitel("20000 leagues under the sea");
    
        setAuthor("Jules Verne");
    
        setPrice(0);
    }

    public Book(String ISBNnr, String titeln, String författare, int price){

        setISBN(ISBNnr);

        setTitel(titeln);

        setAuthor(författare);

        setPrice(price);

    }

    // Setters
    public void setPrice(int inprice){
        price=inprice;
    }

    public void setISBN(String inISBN){
        ISBN=inISBN;
    }

    public void setTitel(String inTitel){
        titel=inTitel;
    }

    public void setAuthor(String inAuthor){
        author=inAuthor;
    }

    public String getISBN(){
        return ISBN;
    }

    public String getTitel(){
        return titel;
    }

    public String getAuthor(){
        return author;
    }

    public int getprice(){
        return price;
    }

    public void skrivUt(){
        System.out.printf ("Book.titel=%s%n", titel);
        System.out.printf ("Book.author=%s%n", author);
        System.out.printf ("Book.ISBN=%s%n", ISBN);
        System.out.printf ("Book.price=%d%n", price);
        
        
    }
    
}
