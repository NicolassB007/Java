package Java_Fundamentos;
import java.util.Scanner;

// Using Arithmetics Operators

public class Aula04 {
    public static void main(String[] args){
        Scanner lerDados = new Scanner(System.in);

        /*System.out.print("Informe o primeiro número: ");
        int firstValue = lerDados.nextInt();

        System.out.print("Informe o segundo número: ");
        int secondValue = lerDados.nextInt();*/

        // System.out.println(firstValue + " + " + secondValue + " = " + (firstValue + secondValue));
        /*System.out.printf("%d + %d = %d \n", firstValue, secondValue, firstValue + secondValue);
        System.out.printf("%d - %d = %d \n", firstValue, secondValue, firstValue - secondValue);
        System.out.printf("%d * %d = %d \n", firstValue, secondValue, firstValue * secondValue);
        System.out.printf("%d / %d = %d \n", firstValue, secondValue, firstValue / secondValue);
        System.out.printf("%d %d = %d \n", firstValue, secondValue, firstValue % secondValue);*/

        //var value = (5 + 9) * (10 - 5) / 2;
        /*var value = 5;
        value = value + 12;
        value += 1;
        System.out.printf("%s", value);*/

        /*System.out.print("Informe o segundo número: ");
        int value = lerDados.nextInt();
        System.out.printf("Raiz Quadrada de %s = %s\n", value, Math.sqrt(value));
        System.out.printf("Potencia %s ao quadrado = %s\n", value, Math.pow(value, 2));*/

        var value = 50;
        /*System.out.println(++value);
        System.out.println(value);*/

        System.out.println(value++);
        System.out.println(value);
    }
}
