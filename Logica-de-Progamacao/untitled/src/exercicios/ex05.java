package exercicios;

import java.time.LocalDate;
import java.util.Scanner;

public class ex05 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        LocalDate data = LocalDate.now();

      int anoNascimento, anoAtual, idade;

        System.out.print("Digite o ano que você nasceu: ");
        anoNascimento = sc.nextInt();

        anoAtual = LocalDate.now().getYear();

        idade = anoAtual - anoNascimento;

        System.out.printf("Com a data atual %s você tem %d anos",data, idade);






    }


    }



