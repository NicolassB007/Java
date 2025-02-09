package Java_Fundamentos;
import java.util.Scanner;

public class Aula09 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);
        var name = "";
        /*while (!name.equalsIgnoreCase("exit")) {
            System.out.print("Informe um nome: ");
            name = readData.nextLine();

            System.out.println(name);
        }*/

        /*while (true) {
            System.out.print("Informe um nome: ");
            name = readData.nextLine();

            System.out.println(name);
            if (name.equalsIgnoreCase("exit")) break;
        }*/

        do {
            System.out.print("Informe um nome: ");
            name = readData.nextLine();

            System.out.println(name);
        } while (!name.equalsIgnoreCase("exit"));
    }
}
