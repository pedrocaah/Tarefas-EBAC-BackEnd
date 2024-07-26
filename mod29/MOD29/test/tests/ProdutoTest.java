package tests;

import dao.IProdutoDAO;
import dao.ProdutoDAO;
import domain.Produto;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ProdutoTest {

    private IProdutoDAO produtoDAO;

    @Test
    public void cadastrarTest() throws Exception {
        produtoDAO = new ProdutoDAO();

        Produto produto = new Produto();
        produto.setCodigo("10");
        produto.setNome("TV");
        produto.setValor(50.00);
        Integer countCad = produtoDAO.cadastrar(produto);
        assertTrue(countCad == 1);
        //cria o objeto cliente e verifica se o count agora é 1, se sim teste passou.

        Produto produtoBD = produtoDAO.buscar("10");//busca o codigo no DB
        assertNotNull(produtoBD); //verifica se o objeto é null
        assertEquals(produto.getCodigo(), produtoBD.getCodigo());//compara se o código do cliente é o mesmo do DB
        //

        Integer countDel = produtoDAO.excluir(produtoBD); //exclui o objeto após o teste
        assertTrue(countDel == 1);//verifica se excluiu, se tiver 2 exclusoes teste nao passara
    }
}
