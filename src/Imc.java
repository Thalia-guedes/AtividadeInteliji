
import java.util.Scanner;
public class Imc {
    public static void main (String [] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe seu peso:");
        double peso = Double.parseDouble(entrada.nextLine ());

        System.out.print("Informe sua Altura:");
        double altura  = Double.parseDouble(entrada.nextLine ());

        double imc = peso / (altura * altura);
        System.out.println("Seu Imc e:" +imc);

        if ( imc < 16) {
            System.out.println("Sua classificacao e Magreza grave");
        }
        else if ((imc >= 16) && (imc < 17)) {
            System.out.println("Sua classificacao e Magreza Moderada");
        }
        else if ((imc >= 17) && (imc < 18.5)) {
            System.out.println("Sua classificacao e Magreza leve");
        }
        else if ((imc >= 18.5) && (imc < 25))  {
            System.out.println("Sua classificaoa e Saudavel");

        }
        else if ((imc >= 25 ) && (imc < 30)) {
            System.out.println ("Sua classificacao e sobre peso");

        }
        else if ((imc >= 30) && (imc < 35)) {
            System.out.println("Sua classificacao e Obsidade Grau 1");

        }
        else if ((imc >= 35) && (imc < 40)) {
            System.out.println("Sua classificacao e Obsidade Grau 2");

        }
        else {
            System.out.println("Sua classificacao e obsidade Grau 3 (Morbida)");
        }
        System.out.println("\n");

    }
}
