public class CarroConcreto extends Carro {
  public CarroConcreto(String modelo, int ano) {
    super(modelo, ano);
  }

  @Override
  public void exibirDados() {
    System.out.println("Modelo: " + getModelo() + ", Ano: " + getAno());
  }
}
