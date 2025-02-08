import java.util.Scanner;
// Working with operators

public class Aula03 {
    public static void main(String[] args) {
        Scanner lerDados = new Scanner(System.in);

        System.out.println("Quanto é 2 + 2? ");
        int result = lerDados.nextInt();
        boolean isRight = result == 4;
        System.out.printf("O resultado é 4, você acertou? %s", isRight);
    }
}
