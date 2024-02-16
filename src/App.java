public class App {
    public static void main(String[] args) {
        IFabricaDeCarro fabrica = new FabricaCarroLuxo();
        ICarroSedan sedan = fabrica.criarCarroSedan();
        ICarroSUV suv = fabrica.criarCarroSUV();

        sedan.exibirInfoSedan();
        suv.exibirInfoSUV();

        fabrica = new FabricaCarroPopular();
        sedan = fabrica.criarCarroSedan();
        suv = fabrica.criarCarroSUV();

        sedan.exibirInfoSedan();
        suv.exibirInfoSUV();
    }
}
