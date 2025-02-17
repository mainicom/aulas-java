import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double C,RE,K,RA,F;
        Scanner scanner = new Scanner(System.in);
        System.out.println("informe a temperatura em celsios");
        C = scanner.nextDouble();
        RE = C * 0.8;
        F = C * 1.8 +32;
        K = C + 273.15;
        RA = C * 1.8 + 32 + 459.67;
        System.out.println("Réaumur:"+RE+" Rankine:"+RA+" Fahrenheit:"+F+" kelvin:"+K);
    }
}