import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração de variáveis para armazenar as notas e a média
        double nota1, nota2, nota3, nota4, media;

        // Leitura das quatro notas
        System.out.println("Digite a primeira nota:");
        nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota:");
        nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota:");
        nota3 = scanner.nextDouble();

        System.out.println("Digite a quarta nota:");
        nota4 = scanner.nextDouble();

        // Cálculo da média
        media = (nota1 + nota2 + nota3 + nota4) / 4;

        // Condições para verificar o status do aluno
        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5) {
            System.out.println("Em recuperação");
        } else {
            System.out.println("Reprovado");
        }

        // Fechamento do scanner
        scanner.close();
    }
}
