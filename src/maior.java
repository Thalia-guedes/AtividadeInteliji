import javax.swing.*;
import java.util.Scanner;

public class maior {
    public static void main (String []args){
        Scanner input = new Scanner(System.in);
        int numeros;
        int maior = 0;

        System.out.println("INFORME OS NUMEROS PARA SABER QUAL E O MAIOR.");
        System.out.println("PARA ACABAR INFORME 0 ");
        System.out.println("INFORME O NUMERO");
        numeros = input.nextInt();

        do {
            if (maior<numeros){
                maior = numeros ;
            }
            System.out.print("Informe o numero:");
            numeros = input.nextInt();
        } while (numeros!=0);
        JOptionPane.showMessageDialog(null,"o maior numero foi" + maior);
    }
}
