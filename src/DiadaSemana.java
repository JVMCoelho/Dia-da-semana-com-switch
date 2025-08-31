import java.util.Scanner;

public class DiadaSemana {
    public  static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Escolha o dia da semana de 1 a 7 ");
        int dia = leitor.nextInt();

        String resposta = getDia(dia);
        System.out.println("Hoje é: " + resposta);

        leitor.close();
    }
    public static String getDia(int dia ){
        switch (dia){
            case 1:
                return "Domingo";
            case 2:
                return "Segunda";
            case 3:
                return "Terça";
            case 4:
                return "Quarta";
            case 5:
                return "Quinta";
            case 6:
                return "Sexta";
            case 7:
                return "Sábado";

            default:
                return "Dia inválido";


        }
    }

}

