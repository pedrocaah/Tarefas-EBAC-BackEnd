package annotation;

@PrimeiraAnotacao(value = "Pedro", bairros = "Helipa", numeroCasa = 10)
public class ClasseComAnotacao {

    @PrimeiraAnotacao(value = "Oliveira", bairros = {"Helipa", "Fongaro"}, numeroCasa = 734, valores = 100d)
    private String nome;

    @PrimeiraAnotacao(value = "Pedro", bairros = "Helipa", numeroCasa = 10)
    public ClasseComAnotacao() {

    }
}
