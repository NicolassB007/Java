import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        System.out.print("Informe a primeira idade: ");
        var ageOne = readData.nextInt();

        System.out.print("Informe a segunda idade: ");
        var ageTwo = readData.nextInt();

        var ageDifference = ageOne - ageTwo;

        System.out.printf("A diferença entre %s e %s é de %s anos", ageOne, ageTwo, ageDifference);
    }
}
