import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileClass {

    public void manipulerFichier() {
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            br = new BufferedReader(new FileReader("test.txt"));
            bw = new BufferedWriter(new FileWriter("hello.txt"));
            String line = br.readLine();

            System.err.println(line);

            bw.write(inverseString(line));

            br.close();
            bw.close();

        } catch (Exception e) {
            System.err.println("Erreur");
        }
    }

    public static String inverseString(String word) {
        String inverse = "";

        for (int i = 0; i < word.length(); i++)
            inverse = word.charAt(i) + inverse;

        return inverse;
    }

    public static void main(String[] args) {
        FileClass emp = new FileClass();
        emp.manipulerFichier();
    }
}