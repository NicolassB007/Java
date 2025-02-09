package Java_Fundamentos;
public class Aula05 {
    public static void main(String[] args) {
        int value = 12;
        var binary = Integer.toBinaryString(value);
        System.out.printf("Primeiro número da operação %s (Representação binária %s)\n", value, binary);

        int value2 = 2;
        System.out.printf("Segundo número da operação %s \n", value2);
        //var result = value | value2;
        //var result = value & value2;
        //var result = value << value2;
        var result = value >>> value2;
        var binaryResult = Integer.toBinaryString(result);

        System.out.printf("%s << %s = %s (Representação binária %s) ", value, value2, result, binaryResult);

        /*var result = ~value;
        var binaryResult  = Integer.toBinaryString(result);
        System.out.printf("~%s = %s (Representação binária %s)\n", value, result, binaryResult);*/
    }
}
