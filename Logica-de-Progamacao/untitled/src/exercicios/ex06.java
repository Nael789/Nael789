package exercicios;
import java.lang.classfile.attribute.SourceFileAttribute;
import java.util.Random;
import java.util.Scanner;

public class ex06 {

    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        String nome;
        String curso;
        String RA;

        byte idade;
        char genero;
        System.out.print("Digite o seu nome para cadastro: ");
        nome = sc.nextLine();

        System.out.println("Digigte sua idade: ");
        idade = sc.nextByte();
        sc.nextLine();

        System.out.println("Digite seu genero: ");
        String texto = sc.nextLine();
        genero = texto.charAt(0);

        System.out.println("Digite o seu curso: ");
        curso = sc.nextLine();

        RA = nome.charAt(0) + String.valueOf(rd.nextInt(100));
        System.out.println(RA);

        System.out.printf("Eu nome é %s e ele possui %s letras, sua idade é %d");


        sc.close();





    }
}

