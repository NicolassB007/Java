package Java_POO;
//import java.util.Scanner;

public class Aula10 {
    public static void main(String[] args) {
        //var readData = new Scanner(System.in);
        var male = new Person("João");
        var female = new Person("Maria");

        System.out.println("Male nome: " + male.getName() + " Age: " + male.getAge());
        System.out.print("Female nome: " + female.getName() + " Age: " + female.getAge());;
    }
}
