import java.util.Scanner;

public class Aluno {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        int nota1, nota2, nota3, nota4;


        System.out.println("Entre com a primeira nota");
        nota1 = in.nextInt();

        System.out.println("Entre com a segunda nota");
        nota2 = in.nextInt();

        System.out.println("Entre com a terceira nota");
        nota3 = in.nextInt();

        System.out.println("Entre com a quarta nota");
        nota4 = in.nextInt();

       int media = (nota1+nota2+nota3+nota4)/4;
       if (media < 7) {
           System.out.println("O aluno foi reprovado");

           } else if (media >= 7) {
               System.out.println("O aluno foi aprovado");
           }
       }

}
