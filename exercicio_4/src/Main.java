import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double peso, altura,altura2,resunt;
        Scanner scanner = new Scanner(System.in);
        System.out.println("informe sua altura");
        altura = scanner.nextDouble();
        System.out.println("informe seu peso");
        peso = scanner.nextDouble();
        altura2 = Math.pow(altura,2);
        resunt = altura2/peso;
        System.out.println(resunt);
    }
}