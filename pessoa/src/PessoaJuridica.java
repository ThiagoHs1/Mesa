public class PessoaJuridica extends Pessoa {
  private String cnpj;
  private String razaoSocial;

  public PessoaJuridica(String nome, String endereco, String cnpj, String razaoSocial) {
    super(nome, endereco);
    this.cnpj = cnpj;
    this.razaoSocial = razaoSocial;
  }

  // Métodos getters e setters
  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public String getRazaoSocial() {
    return razaoSocial;
  }

  public void setRazaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
  }
}
