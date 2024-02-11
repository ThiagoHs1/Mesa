import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os nomes separados por vírgula:");
        String input = scanner.nextLine();

        String[] nomes = input.split(",");

        // Convertendo para lista para facilitar a ordenação
        List<String> listaNomes = new ArrayList<>(Arrays.asList(nomes));

        // Ordenando a lista
        Collections.sort(listaNomes);

        // Imprimindo os nomes ordenados
        System.out.println("Nomes ordenados:");
        for (String nome : listaNomes) {
            System.out.println(nome.trim());
        }

        scanner.close();
    }
}
