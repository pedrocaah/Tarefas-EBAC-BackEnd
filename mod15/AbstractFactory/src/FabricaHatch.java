public class FabricaHatch implements Fabrica {
    public Carro criarCarro() {
        return new CarroHatch();
    }
}
