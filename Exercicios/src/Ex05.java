import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        var readData = new Scanner(System.in);

        for (var i = 0; i < 5; i++) {
            System.out.print("=-=-=");
        }

        System.out.print("\nInforme um número: ");
        var number = readData.nextInt();

        for (var i = 0; i < 11; i++) {
            var multiplication = number * i;
            System.out.printf("%d x %d = %d\n", number, i, multiplication);
        }

        readData.close();
    }
}
