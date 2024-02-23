import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>();
        carros.add(new CarroConcreto("Fusca", 1966));
        carros.add(new CarroConcreto("Camaro", 2020));

        for (Carro carro : carros) {
            carro.exibirDados();
        }
    }
}
