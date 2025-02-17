import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    ///declarando variavel
    double nota1 , nota2 , media ;
    int rm;
    String nome;
    /// entrada de dados
    Scanner scanner = new Scanner(System.in);
    System.out.println("informe o rm do aluno");
    rm = scanner.nextInt();
    System.out.println("informe o nome do aluno");
    nome = scanner.next();
    System.out.println("informe a nota 1");
    nota1 = scanner.nextDouble();
    System.out.println("informe a nota 2");
    nota2 = scanner.nextDouble();
    media =  (nota1 + nota2) / 2;
    /// saida
    System.out.println(nota1);
    System.out.println(nota2);
    System.out.println(media);

    }
}