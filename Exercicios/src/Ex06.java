import java.util.Scanner;
import java.lang.Math;

 class Ex06 {
    public static void main(String[] args) {
        var readData = new Scanner(System.in);

        System.out.print("Informe seu peso: ");
        var weightString = readData.nextLine().replace(",", ".");

        System.out.print("Informe sua altura: ");
        var heightString = readData.nextLine().replace(",", ".");

        var height = Double.parseDouble(heightString);
        var weight = Double.parseDouble(weightString);

        var imcResult = weight / (Math.pow(height, 2));

        if (imcResult <= 18.5) {
            System.out.printf("IMC -> %.2f\n", imcResult);
            System.out.print("Abaixo do peso\n");
        }

        else if (imcResult <= 24.9) {
            System.out.printf("IMC -> %.2f\n", imcResult);
            System.out.print("Peso ideal\n");
        }

        else if (imcResult <= 29.9) {
            System.out.printf("IMC -> %.2f\n", imcResult);
            System.out.print("Levemente acima do peso\n");
        }

        else if (imcResult <= 34.9) {
            System.out.printf("IMC -> %.2f\n", imcResult);
            System.out.print("Obesidade Grau I\n");
        }

        else if (imcResult <= 39.9) {
            System.out.printf("IMC -> %.2f\n", imcResult);
            System.out.print("Obesidade Grau II\n");
        }

        else {
            System.out.printf("IMC -> %.2f\n", imcResult);
            System.out.print("OBESIDADE III\n");
        }

        readData.close();
    }
}
