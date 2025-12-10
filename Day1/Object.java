package Day1;

class Movie{
    String  name;
    int year;
    String lang;

    public Movie(String name, int year, String lang ){
        this.name=name;
        this.year=year;
        this.lang=lang;
    }

    public void display(){
        System.out.println("Movie Details:");
        System.out.println("Name: "+name+"\nYear: "+year+"\nLanguage: "+lang+"\n");
    }
}
public class Object{
    public static void main(String[] args) {
        Movie m1 = new Movie("Inception", 2010, "English");
        Movie m2 = new Movie("Bahubali", 2015, "Telugu");

        m1.display();
        m2.display();
    }
}