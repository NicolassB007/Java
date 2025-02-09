import java.util.Scanner;

public class Aula08 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                System.out.println("Pulando o 3");
                continue;
            }
            System.out.println(i);
            System.out.println("Fim da execução");
        }
    }
}
