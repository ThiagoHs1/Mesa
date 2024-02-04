public class ConversaoTipo {
    public static void main(String[] args) {
        // Declarando a variável primitiva
        int valorNumerico;

        // Lendo o valor numérico do usuário
        System.out.println("Digite um valor numérico: ");
        valorNumerico = Integer.parseInt(System.console().readLine());

        // Convertendo o valor primitivo para o tipo wrapper
        Integer valorWrapper = Integer.valueOf(valorNumerico);

        // Imprimindo o valor wrapper no console
        System.out.println("Valor wrapper: " + valorWrapper);
    }
}
