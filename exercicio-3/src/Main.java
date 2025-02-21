import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int num;
        double total;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ola bem vindo ao CONTA AVES 3000® por favor informe o numero de aves ");
        num=scanner.nextInt();
        total = (num * 0.30)/15+10;
        System.out.println("o preço de se criar essas aves é de "+total+" reais");
    }
}