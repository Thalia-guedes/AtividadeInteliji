import java.util.Scanner;
public class maioridade {
    public  static void main (String []args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Digite a idade do usuario");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("O usuario e maior de idade");

        } else {
            System.out.println(" O usuario e menor de idade");
        }
    }
}
