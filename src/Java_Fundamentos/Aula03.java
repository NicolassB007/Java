package Java_Fundamentos;
import java.util.Scanner;
// Working with operators

public class Aula03 {
    public static void main(String[] args) {
        Scanner lerDados = new Scanner(System.in);

        /*System.out.print("Quanto é 2 + 2? ");
        int result = lerDados.nextInt();
        boolean isRight = result == 4;
        System.out.printf("O resultado é 4, você acertou? (%s)", isRight);*/

        /* System.out.print("Quantos anos você tem? ");
        int age = lerDados.nextInt();

        boolean majority = age >= 18;

        System.out.printf("Você é menor de idade? %s", !majority);*/

        /*
        * = - Assignment;
        * == - Compare two values;
        * != - Checking if the values are different;
        * < - Less Than;
        * <= - Less or equal than;
        * > - Greater than;
        * >= - Greater or equal than;
        * */

        /* System.out.print("Quantos anos você tem? ");
        int age = lerDados.nextInt();

        System.out.print("Você é emancipado? ");
        boolean isEmancipated = lerDados.nextBoolean();

        boolean canDrive = age >= 18 || (isEmancipated && age >= 16);

        System.out.printf("Você pode dirigir? %s", canDrive); */

        System.out.println("TABELA VERDADE");
        System.out.println("&& - E");
        System.out.println("true  && true = true");
        System.out.println("true  && false = false");
        System.out.println("false && true = false");
        System.out.println("false && false = false");

        System.out.println("TABELA VERDADE");
        System.out.println("|| - OU");
        System.out.println("true  || true = true");
        System.out.println("true  || false = true");
        System.out.println("false || true = true");
        System.out.println("false || false = false");

        System.out.println("! = Operador de negação");
        System.out.println("!true " + !true);
        System.out.println("!false " + !false);
    }
}
