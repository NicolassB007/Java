package Java_Fundamentos;
import java.util.Scanner;

public class Aula06 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        var name = readData.nextLine();

        System.out.print("Informe sua idade: ");
        var age = readData.nextInt();

        System.out.print("Você é emancipado? (s/n): ");
        readData.nextLine();
        var isEmancipated = readData.nextLine().equalsIgnoreCase("s");

        var canDrive = (age >= 18) || (age >= 16 && isEmancipated);
        var message = canDrive ? name + ", você pode dirigir": name + ", você não pode dirigir";
        System.out.println(message);
        /*if (canDrive) {
            System.out.printf("Bem-vindo, %s\n", name);
            System.out.printf("%s, você pode dirigir\n", name);
        }

        /*else if (age >= 16 && isEmancipated) {
            System.out.printf("%s, apesar de você ter %d anos, você é emancipado e pode dirigir.\n", name, age);
        }*/

        /*else {
            System.out.printf("Você não pode dirigir, %s", name);
        }*/
    }
}
