import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> masculino = new ArrayList<>();
        List<String> feminino = new ArrayList<>();

        System.out.println("Digite o nome e o sexo separados por tracinho (ex: João - M), digite 'fim' para encerrar:");

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();

            if ("fim".equalsIgnoreCase(input)) {
                break;
            }

            String[] partes = input.split("-");
            if (partes.length == 2) {
                String nome = partes[0].trim();
                String sexo = partes[1].trim();

                if ("M".equalsIgnoreCase(sexo)) {
                    masculino.add(nome);
                } else if ("F".equalsIgnoreCase(sexo)) {
                    feminino.add(nome);
                }
            }
        }

        // Imprimindo os grupos
        System.out.println("Masculino:");
        masculino.forEach(System.out::println);

        System.out.println("Feminino:");
        feminino.forEach(System.out::println);

        scanner.close();
    }
}
