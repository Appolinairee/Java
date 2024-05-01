public class Personne {
    protected String name;    
    protected int age;    

    public Personne(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails(){
        System.out.println("Name: " +  this.name + "\nAge:" + age + "");
    }
}