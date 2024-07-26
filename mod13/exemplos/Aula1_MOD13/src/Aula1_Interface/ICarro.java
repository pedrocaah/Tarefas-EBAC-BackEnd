package Aula1_Interface;

public interface ICarro {

    default void parar() {
        System.out.println("Carro está parando");
    }

    public void andar();
}
