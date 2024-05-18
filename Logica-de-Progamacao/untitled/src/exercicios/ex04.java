package exercicios;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        final double aluguelCobrado, KMCobrado;
        double diasComOcarro, KMRodados, aluguelAPagar;

        aluguelCobrado = 86.75;
        KMCobrado = 1.23;

        System.out.print("Digite quantos dias voce ficou com o carro: ");
        diasComOcarro = sc.nextDouble();

        System.out.print("Digite quantos KM voce andou com o carro: ");
        KMRodados = sc.nextDouble();

        aluguelAPagar = (diasComOcarro * aluguelCobrado) + (KMRodados * KMCobrado);

        System.out.printf("Você irá pagar para a empresa R$%.2f pelo aluguel do carro", aluguelAPagar);



    }

}







