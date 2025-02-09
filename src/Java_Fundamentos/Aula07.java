package Java_Fundamentos;
import java.util.Scanner;

public class Aula07 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        System.out.print("Informe um número de 1 até 7: ");
        var number = readData.nextInt();

        var message = switch (number) {
            case 1, 7 -> {
                var day = number == 1 ? "Domingo" : "Sábado";
                yield String.format("Hoje é %s, fim de semana uhuuul", day);
            }
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            default -> "Número inválido!";
        };

        System.out.println(message);

        /*switch (number) {
            case 1:
            case 7:
                System.out.println("Fim de semana");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            default:
                System.out.println("Número inválido");
        }*/

    }
}
