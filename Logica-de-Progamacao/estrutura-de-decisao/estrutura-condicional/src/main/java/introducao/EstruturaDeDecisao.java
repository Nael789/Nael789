package introducao;

import java.io.PrintStream;

public class EstruturaDeDecisao {

    public static void main(String[] args) {

        double n1, n2, n3, media;

        n1 = 8.5;
        n2 = 6;
        n3 = 2.4;

        media = (n1 + n2 + n3) / 3.0;


        if (media > 7.0) {

        }
        System.out.printf("Sua média foi %.1f e voê foi APROVADO%n", media);{

        } if (media > 5.0 && media < 7.0){
            System.out.printf("Sua média foi %.1f e você está de RECUPERAÇÃO%n", media);
        } else
            System.out.printf("Sua média foi %.1f e você foi REPROVADO\n", media);{
        }
        System.out.println("Muito obrigado por tirar a média conosco!");


    }
}

