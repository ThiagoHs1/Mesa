public class App {
    public static void main(String[] args) {
        // Cria uma instância da classe Mesa.
        Mesa minhaMesa = new Mesa("Madeira", "Marrom", 75, 120);

        minhaMesa.imprimirInformacoes();

        minhaMesa.setCor("Branco");
        minhaMesa.setAltura(80);

        // Imprime as informações atualizadas da mesa.
        System.out.println("Após atualizações:");
        minhaMesa.imprimirInformacoes();
    }

}
