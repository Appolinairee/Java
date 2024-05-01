// public interface InnerEmployee {
//     void afficherSalaire();
//     static void ma
// }

public class Employee extends Personne {
    private String salary;

    public Employee(String name, int age, String salary) {
        super(name, age);
        this.salary = salary;
    }

    public void afficherSalaire() {
        System.err.println(this.salary + super.age + super.name);

        try {
            int c = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Une erreur" + e);
        }

        System.err.println(this.salary + super.age + super.name);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Tony", 13, "Mon salaire");
        emp.afficherSalaire();
    }
}