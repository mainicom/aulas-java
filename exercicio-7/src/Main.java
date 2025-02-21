import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double quantc;
        double t,m,h;
        System.out.println("informe a o peso o tempo e a altura respectvamentes");
        m= scanner.nextDouble();
        t = scanner.nextDouble();
        h = scanner.nextDouble();
        quantc =  (m*h/t)/745.6999;
        System.out.println(quantc);
    }
}