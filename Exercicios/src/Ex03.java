import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        System.out.print("Informe a base do retângulo: ");
        var rectangleBase = readData.nextDouble();

        System.out.print("Informe a altura do retângulo: ");
        var rectangleHeight = readData.nextDouble();

        var rectangleArea = rectangleBase * rectangleHeight;

        System.out.printf("Área do retângulo: %s metros²", rectangleArea);

        readData.close();
    }
}
