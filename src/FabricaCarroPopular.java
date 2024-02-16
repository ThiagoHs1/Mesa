public class FabricaCarroPopular implements IFabricaDeCarro {
  @Override
  public ICarroSedan criarCarroSedan() {
    return new SedanPopular();
  }

  @Override
  public ICarroSUV criarCarroSUV() {
    return new SUVPopular();
  }
}