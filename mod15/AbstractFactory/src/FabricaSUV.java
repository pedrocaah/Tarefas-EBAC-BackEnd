public class FabricaSUV implements Fabrica {
    public Carro criarCarro() {
        return new CarroSUV();
    }
}
