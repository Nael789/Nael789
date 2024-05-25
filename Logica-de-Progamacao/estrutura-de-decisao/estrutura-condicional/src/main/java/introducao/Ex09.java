package introducao;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
//       Cria o objeto scanner para ler a enntrada do usuario
        Scanner sc = new Scanner(System.in);

//        Solicitando para o usuario inserir um numero para o dia da semana
        System.out.print("Informe o número de (1 a 7) para o dia da semana");
        String diaNumero = sc.nextLine();

        String diaSemana;

        int dianumero;



        switch (diaNumero) {

            case 1:
                diaSemana = "domingo";
            break;
            case 2:
                diaSemana = "Segunda-feira";
                break;
            case 3:
                diaSemana = "Terça-feira";
                break;
            case 4:
                diaSemana = "Quarta-feira";
                break;
            case 5:
                diaSemana = "Quinta-feira";
                break;
            case 6:
                diaSemana = "Sexta-feira";
                break;
            case 7:
                diaSemana = "Sábado";
                break;
            default:
                diaSemana = "Número invalido";




        }

        System.out.printf("hoje é %s BOA SEMANA :)%n ", diaSemana);
        System.out.println("UFFA ESTAMOS NO FIMM");
    sc.close();
    }
}


