import java.util.Scanner;

public class VerificaNumeros {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int a = input.nextInt();

        System.out.println("Digite o valor de B: ");
        int b = input.nextInt();

        System.out.println("Digite o valor de C: ");
        int c = input.nextInt();

        System.out.println("Digite o valor de D: ");
        int d = input.nextInt();

        System.out.println("Digite o valor de E: ");
        int e = input.nextInt();

        System.out.println("Digite o valor de F: ");
        int f = input.nextInt();


        if(a == b) {
            System.out.println("A é igual a B");
        } else {
            System.out.println("A não é igual a B");
        }


        if(c != d) {
            System.out.println("C é diferente de D");
        } else {
            System.out.println("C é igual a D");
        }


        if(e > f) {
            System.out.println("E é maior que F");
        } else {
            System.out.println("E não é maior que F");
        }
    }
}