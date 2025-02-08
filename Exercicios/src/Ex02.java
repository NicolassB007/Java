import java.util.Scanner;
import java.lang.Math;

public class Ex02 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        System.out.print("Qual o tamanho do lado do quadrado? ");
        var squareValue = readData.nextInt();

        var squareArea = Math.pow(squareValue, 2);

        System.out.printf("Área do quadrado: %s", squareArea);
    }
}
