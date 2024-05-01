// public interface InnerEmployee {
//     void afficherSalaire();
//     static void main();
// }

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Employee extends Personne {
    private String salary;

    public Employee(String name, int age, String salary) {
        super(name, age);
        this.salary = salary;
    }

    public void afficherSalaire() {
        try {
            File fl = new File("test");
            BufferedReader br = null;
            br = new BufferedReader(new FileReader(fl));

            String line = "";

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            System.err.println(fl.getName());

            br.close();
        } catch (Exception e) {
            System.err.println("Erreur");
        }

        // System.err.println(this.salary + super.age + super.name);

        try {
            int c = 5 / 0;
        } catch (ArithmeticException e) {
            // System.out.println("Une erreur" + e.getMessage());
        }

        // System.err.println(this.salary + super.age + super.name);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Tony", 13, "Mon salaire");
        emp.afficherSalaire();
    }
}