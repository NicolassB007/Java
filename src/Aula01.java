import java.util.Scanner; // Import a lib
/*
* Lib - Place where have many tools for use, many commands
* */

public class Aula01 {
    public static void main(String[] args) {
        Scanner lerDados = new Scanner(System.in);
        System.out.print("Olá, informe o seu nome: ");
        String name = lerDados.next();

        System.out.print("Informe sua idade: ");
        int age = lerDados.nextInt();

        // System.out.print("Olá " + name + " sua idade é " + age);
        System.out.printf("Ola %s sua idade é %d anos \n", name, age);

        // My commentary
        /*
        * My first commentary
        * of
        * multiples lines
        * */
    }
}
