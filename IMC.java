import java.util.Scanner;

public class IMC {
    public static void main(String args[]) {
        String name;
        double t, m, imc;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nom :");
        name = sc.nextLine();

        System.out.println("Votre taille :");
        t = sc.nextDouble();

        System.out.println("Votre masse :");
        m = sc.nextDouble();

        imc = (m*10) / t*t;

        System.out.println(name + ", votre imc est: " + imc);
    }
}


