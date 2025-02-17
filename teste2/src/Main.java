import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    double base, altura,area;
    Scanner scanner = new Scanner(System.in);
    System.out.println("informe a basse do triangolo");
    base=scanner.nextDouble();
    System.out.println("informe a altura do triangolo");
    altura = scanner.nextDouble();
    area = (base * altura) / 2;
    System.out.println( area);
    }
}