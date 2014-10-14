package JARFILES;


public class Book {
    private String author, name, result;
    public Book(String n, String a){
        name = n;
        author = a;
    }
    public String getTitle(){
        return name;
    }
    public String toString(){
        String result="Title"+name;
        result += ", :"+ author;
        return result;
    }
}
