import java.util.UUID;

public class Book {
    private String id;
    private String title;
    private String description;
    private String author;
    private int examplaryNumber;

    public Book(String title,  String description, String author, int examplaryNumber) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.description = description;
        this.author = author;
        
        if(examplaryNumber > 0)
            this.examplaryNumber = examplaryNumber;
        else
            this.examplaryNumber = 1;
    }

    
    public String id(){
        return this.id;
    }

    public String title(){
        return this.title;
    }

    public String description(){
        return this.description;
    }
    public String author(){
        return this.author;
    }
    public int examplaryNumber(){
        return this.examplaryNumber;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setDescription(String description){
        this.description = description;
    }
    public void setAuthor(String description){
        this.author = description;
    }

    public void setExemplaryNumber(int number){
        this.examplaryNumber = number;
    }
}