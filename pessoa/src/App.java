public class App {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica("João Silva", "Rua Exemplo, 123", "123.456.789-00", "01/01/1990");
        PessoaJuridica pj = new PessoaJuridica("Empresa Exemplo", "Avenida Exemplo, 1000", "00.123.456/0001-99",
                "Empresa Exemplo LTDA");

        System.out.println("Pessoa Física: " + pf.getNome() + " - CPF: " + pf.getCpf());
        System.out.println("Pessoa Jurídica: " + pj.getNome() + " - CNPJ: " + pj.getCnpj());
    }
}
