package lista;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;


public class test {
    @Test
    public void testando2() {
        List<Pessoa> listaFeminino = new Pessoa().listaFeminino();
        for (Pessoa feminino : listaFeminino) {
            Assert.assertEquals("Feminino", feminino.getGenero());
            Assert.assertNotEquals("Masculino", feminino.getGenero());
        }
    }
}
