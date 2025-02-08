import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        var baseYear = 2025;

        System.out.print("Informe o seu nome: ");
        String name = readData.nextLine();

        System.out.print("Informe sua data de nascimento: ");
        int dateBorn = readData.nextInt();

        int age = baseYear - dateBorn;

        System.out.printf("Olá %s! Você tem %d anos", name, age);
    }
}
