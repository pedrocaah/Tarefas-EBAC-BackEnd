package testes;

import org.junit.Assert;
import org.junit.Test;

public class PrimeiroTests {
    @Test
    public void test() {
        String nome = "Pedro";
        Assert.assertEquals("Pedro", nome);
    }
    public void testNotEquals() {
        String nome = "Pedro";
        Assert.assertNotEquals("Pedro1", nome);
    }
}