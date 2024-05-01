public class Personn {
    public String name;
    private int age;

    public Personn (String name, int age){
        this.name = name;
        this.age = age;
    }

    public Personn (String name){
        this.name = name;
    }

    public void printName(){
        System.out.println(name);
    }

    public void printAge(){
        System.out.println(age);
    }
}