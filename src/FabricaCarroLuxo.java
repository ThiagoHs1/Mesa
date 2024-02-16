public class FabricaCarroLuxo implements IFabricaDeCarro {
  @Override
  public ICarroSedan criarCarroSedan() {
    return new SedanLuxo();
  }

  @Override
  public ICarroSUV criarCarroSUV() {
    return new SUVLuxo();
  }
}