package introducao;

import java.io.PrintStream;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double conta = 79.30;
        int minutos;

        System.out.print("Digite quantos minutos você utilizou: ");
        minutos = sc.nextInt();

        if (minutos > 100) {
            conta += (minutos - 100) * 2.30;
        }

         System.out.printf("TOTAL DA CONTA: R$%.2f", conta);


        sc.close();
    }
}
