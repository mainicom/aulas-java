import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sminimio , satual , sla ;
        System.out.println("digite aqui o salario minimo");
        sminimio = scanner.nextDouble();
        System.out.println("digiti aqui o salario atual");
        satual = scanner.nextDouble();
        sla= satual/sminimio;
        System.out.println("o seu salario atual é de "+sla+" salarios minimos");
    }
}