
public class media {
    public static void main(String[] args) {
        double nota1, nota2, nota3, nota4, media;

        // Leitura das notas
        System.out.println("digite a primeira nota: ");
        nota1 = Double.parseDouble(System.console().readLine());

        System.out.println("digite a segunda nota: ");
        nota2 = Double.parseDouble(System.console().readLine());

        System.out.println("digite a terceira nota: ");
        nota3 = Double.parseDouble(System.console().readLine());

        System.out.println("digite a quarta nota: ");
        nota4 = Double.parseDouble(System.console().readLine());

        // Calculo da media

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        // Impressao da media
        System.out.println("A media do aluno é: " + media);

    }
}
