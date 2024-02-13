public class PessoaFisica extends Pessoa {
  private String cpf;
  private String dataDeNascimento;

  public PessoaFisica(String nome, String endereco, String cpf, String dataDeNascimento) {
    super(nome, endereco);
    this.cpf = cpf;
    this.dataDeNascimento = dataDeNascimento;
  }

  // Métodos getters e setters
  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getDataDeNascimento() {
    return dataDeNascimento;
  }

  public void setDataDeNascimento(String dataDeNascimento) {
    this.dataDeNascimento = dataDeNascimento;
  }
}
