public class App {
    public static void main(String[] args) {
        Fabrica fabricaHatch = new FabricaHatch();
        Carro hatch = fabricaHatch.criarCarro();
        hatch.montar();

        Fabrica fabricaSUV = new FabricaSUV();
        Carro suv = fabricaSUV.criarCarro();
        suv.montar();
    }
}
