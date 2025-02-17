import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    double raio,area,raio2;
    Scanner scanner = new Scanner(System.in);
    System.out.println("informe o raio do circolo");
    raio = scanner.nextDouble();
    raio2 = Math.pow(raio,2);
    area =Math.PI * raio2;
    System.out.println(area);
    }
}