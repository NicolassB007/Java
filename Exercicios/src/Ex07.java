import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        var readData = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        var firstNumber = readData.nextInt();

        System.out.print("Informe o segundo número (Maior que o primeiro informado): ");
        var secondNumber = readData.nextInt();

        if (firstNumber > secondNumber) {
            System.out.print("O segundo número é menor que o primeiro valor\n");
            System.out.print("Tente novamente!");
        }

        System.out.print("Você quer PAR ou ÍMPAR? ");
        var choice = readData.next();

        if (choice.equalsIgnoreCase("par")) {
            System.out.printf("Primeiro valor: %d\nSegundo valor: %d\n", firstNumber, secondNumber);
            System.out.print("VALORES EM ORDEM DECRESCENTE E PAR\n");
            for (var i = secondNumber; i >= firstNumber; i--) {
                if (i % 2 == 0) {
                    System.out.printf("%d\n", i);
                }
            }
            choice = "";
        }
        else if (choice.equalsIgnoreCase("impar")) {
            System.out.printf("Primeiro valor: %d\nSegundo valor: %d\n", firstNumber, secondNumber);
            System.out.print("VALORES EM ORDEM DECRESCENTE E IMPARES\n");
            for (var i = secondNumber; i >= firstNumber; i--) {
                if (i % 2 == 1) {
                    System.out.printf("%d\n", i);
                }
            }
            choice = "";
        }
        readData.close();
    }
}
