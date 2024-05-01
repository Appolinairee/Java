import java.util.UUID;

public class User {
    private String id;
    private String name;
    private String password;

    public User(String name){
        this.id = UUID.randomUUID().toString();
        this.name = name;
    }

    public String id(){
        return this.id;
    }

    public String password(){
        return this.password;
    }

    public String name(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}