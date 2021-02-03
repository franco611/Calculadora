import java.util.Scanner;
public class Main {
    public static void main (String[] args)
    {
        Scanner s= new Scanner(System.in);

        CalculadoraGeneral calcu = new Calculadora();
        String res = "";
        res = s.nextLine();
        System.out.println(calcu.Calculo(res));
    }
}
