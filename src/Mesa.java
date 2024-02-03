// Classe representando uma mesa.
public class Mesa {
  // Propriedades da mesa.
  private String material;
  private String cor;
  private double altura; // em centímetros
  private double largura; // em centímetros

  // Construtor da classe Mesa.
  public Mesa(String material, String cor, double altura, double largura) {
    this.material = material;
    this.cor = cor;
    this.altura = altura;
    this.largura = largura;
  }

  // Método para obter o material da mesa.
  public String getMaterial() {
    return material;
  }

  // Método para definir o material da mesa.
  public void setMaterial(String material) {
    this.material = material;
  }

  // Método para obter a cor da mesa.
  public String getCor() {
    return cor;
  }

  // Método para definir a cor da mesa.
  public void setCor(String cor) {
    this.cor = cor;
  }

  // Método para obter a altura da mesa.
  public double getAltura() {
    return altura;
  }

  // Método para definir a altura da mesa.
  public void setAltura(double altura) {
    this.altura = altura;
  }

  // Método para obter a largura da mesa.
  public double getLargura() {
    return largura;
  }

  // Método para definir a largura da mesa.
  public void setLargura(double largura) {
    this.largura = largura;
  }

  // Método para imprimir informações sobre a mesa.
  public void imprimirInformacoes() {
    System.out.println(
        "Mesa de " + material + ", cor " + cor + ", com " + altura + "cm de altura e " + largura + "cm de largura.");
  }
}
