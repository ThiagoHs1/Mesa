import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Listas para armazenar os nomes
        List<String> masculinos = new ArrayList<>();
        List<String> femininos = new ArrayList<>();

        // Variáveis para armazenar as entradas
        String nome, sexo;

        // Loop para leitura de dados
        String continuar = "s";
        while (continuar.equalsIgnoreCase("s")) {
            System.out.print("Digite o nome: ");
            nome = scanner.nextLine();

            System.out.print("Digite o sexo (M/F): ");
            sexo = scanner.nextLine();

            // Condicional para separar por sexo
            if (sexo.equalsIgnoreCase("M")) {
                masculinos.add(nome);
            } else if (sexo.equalsIgnoreCase("F")) {
                femininos.add(nome);
            } else {
                System.out.println("Sexo inválido.");
            }

            System.out.print("Deseja continuar? (S/N): ");
            continuar = scanner.nextLine();
        }

        // Exibição dos grupos
        System.out.println("\nGrupo Masculino:");
        for (String m : masculinos) {
            System.out.println(m);
        }

        System.out.println("\nGrupo Feminino:");
        for (String f : femininos) {
            System.out.println(f);
        }

        scanner.close();
    }
}
