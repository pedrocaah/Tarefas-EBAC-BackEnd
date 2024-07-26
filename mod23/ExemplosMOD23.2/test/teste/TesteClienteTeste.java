package teste;

import org.junit.Assert;
import org.junit.Test;

public class TesteClienteTeste {

    @Test
    public void testeClasseCliente() {
        TesteCliente cli = new TesteCliente();
        cli.adicionarNome("Pedro");
        cli.adicionarNome1("Pedro");

        Assert.assertEquals("Pedro", cli.getNome());
    }
}
