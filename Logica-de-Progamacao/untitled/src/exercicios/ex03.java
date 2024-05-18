package exercicios;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double celsius, Fahrenheit, kelvin, Reaumur, rankine, Rankine2 ;


        System.out.println("Entre com atemperatura atual");
        celsius = sc.nextDouble();
        Fahrenheit = celsius * 1.8 + 32;
        kelvin = celsius + 273.15;
        Reaumur = celsius / 1.25;
        rankine = celsius * 1.8 + 491.67;
        Rankine2 = (celsius + 273.15) * 9/5;

        System.out.printf("A temperatura %.1f em Fahrenheit: %.1f%n", celsius, Fahrenheit);
        System.out.printf("A temperatura %.1f em kelvin: %.1f\n" , celsius, kelvin);
        System.out.printf("A temperatura %.1f em Réaumur: %.1f\n", celsius, Reaumur);
        System.out.printf("A temperatura %.1f em Rankine: %.1f%n", celsius, rankine);
        System.out.printf("A temperatura %.1f em Rankine (2´ fórmula): %.1f", celsius, Rankine2);



    }

}
