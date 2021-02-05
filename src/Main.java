import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** Metodo principal*/
public class Main {
    /** Metodo principal*/
    public static void main (String[] args)
    {
        CalculadoraGeneral calcu = new Calculadora();
        try {
            File obj = new File("datos.txt");
            Scanner myReader = new Scanner(obj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(calcu.Calculo(data));
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
            e.printStackTrace();
        }
    }
}
