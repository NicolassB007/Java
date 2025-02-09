import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        var readData = new Scanner(System.in);

        System.out.print("Informe um número: ");
        var number = readData.nextInt();

        var keepVerify = true;

        while (keepVerify) {

            System.out.print("Informe um valor de verificação: ");
            var otherNumber = readData.nextInt();

            if (otherNumber < number) {
                System.out.println("Informe um valor maior que " + number);
                continue;
            }

            var result = otherNumber % number;
            keepVerify = result == 0;

            System.out.printf("%d %% %d == %d\n", otherNumber, number, result);
        }
    }
}
