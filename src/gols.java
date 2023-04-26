import java.util.Scanner;
public class gols {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        System.out.print("DIGITE O NOME DO PRIMEIRO TIME");
        String time1 = input.nextLine();

        System.out.print("DIGITE A QUANTIDADE DE GOLS MARCADOS PELO PRIMEIRO TIME");
        int gols1 = input.nextInt();

        System.out.print("DIGITE O NOME DO SEGUNDO TIME");
        input.nextLine();
        String time2 = input.nextLine();

        System.out.print("DIGITE A QUANTIDADE DE GOLS MARCADOS PELO SEGUNDO TIME");
        int gols2 = input.nextInt();

        if (gols1 > gols2){
            System.out.println("O time" + time1 + "venceu o time"+ time2 + "por" + gols1 + "a" + gols2 +"!");
        } else if (gols2 > gols1) {
            System.out.println("O time " +time2 + "venceu o time" + time1 + "por" + gols2 + "a" + gols1 +"!");

        }
        else {
            System.out.println("O jogo entre " + time1 + "e" + time2 + "terminou empatado em " + gols1 + "a" + gols2 + "!");

            input.close();
        }
    }
}
