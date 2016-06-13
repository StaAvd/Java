package arv;

public class ChildrensBook extends Book{

private String age = "0";

//Konstruktor (constructor) Metod som körs när objektet skapas. Denna är tom.
public ChildrensBook(){
    super();
    this.age = age;
}

public ChildrensBook(String inAge){
    super();
    this.age = inAge;
}

public ChildrensBook (String ISBN, String titel, String author, int price, String age)
{
    super(ISBN, titel, author, price);

    this.age = age;

}
public void setAge (String Value){
    age = Value;
}

public String getAge (){
    return age;
}

@Override
public void skrivUt(){
    System.out.printf ("%n");
    super.skrivUt();
    System.out.printf("Book Age = %s", age);
    
}

}

 
