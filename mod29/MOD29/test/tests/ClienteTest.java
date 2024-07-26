package tests;

import dao.ClienteDAO;
import dao.IClienteDAO;
import domain.Cliente;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ClienteTest {

    private IClienteDAO clienteDAO;

    @Test
    public void cadastrarTest() throws Exception{
        clienteDAO = new ClienteDAO();

        Cliente cliente = new Cliente();
        cliente.setCodigo("10");
        cliente.setNome("Pedro");
        Integer countCad =  clienteDAO.cadastrar(cliente);
        assertTrue(countCad == 1);
        //cria o objeto cliente e verifica se o count agora é 1, se sim teste passou.

        Cliente clienteBD = clienteDAO.buscar("10");//busca o codigo no DB
        assertNotNull(clienteBD); //verifica se o objeto é null
        assertEquals(cliente.getCodigo(), clienteBD.getCodigo());//compara se o código do cliente é o mesmo do DB
        //

        Integer countDel = clienteDAO.excluir(clienteBD); //exclui o objeto após o teste
        assertTrue(countDel == 1);//verifica se excluiu, se tiver 2 exclusoes teste nao passara
    }

    @Test
    public void buscarTodosTest() throws Exception{
        clienteDAO = new ClienteDAO();

        Cliente cliente = new Cliente();
        cliente.setCodigo("10");
        cliente.setNome("Pedro");
        Integer countCad = clienteDAO.cadastrar(cliente);
        assertTrue(countCad == 1);
        //cria um objeto cliente e verifica se só foi criado 1 pelo count

        Cliente cliente2 = new Cliente();
        cliente2.setCodigo("20");
        cliente2.setNome("Henrique");
        Integer countCad2 = clienteDAO.cadastrar(cliente2);
        assertTrue(countCad2 == 1);
        //cria um objeto cliente e verifica se só foi criado 1 pelo count

        List<Cliente> list = clienteDAO.buscarTodos();
        assertNotNull(list);
        assertEquals(2, list.size());
        //cria uma lista recebendo todos os objetos cliente, verifica se a lista é != null e se o tamanho é == a 2
        //por ter criado 2 objetos cliente.

        int countDel = 0;
        for (Cliente cli : list){
            clienteDAO.excluir(cli);
            countDel++;
        }
        assertEquals(list.size(), countDel);
        //

        list = clienteDAO.buscarTodos();
        assertEquals(list.size(), 0);
    }

    @Test
    public void atualizarTest() throws Exception{
        clienteDAO = new ClienteDAO();

        Cliente cliente = new Cliente();
        cliente.setCodigo("10");
        cliente.setNome("Pedro");
        Integer countCad = clienteDAO.cadastrar(cliente);
        assertTrue(countCad == 1);

        Cliente clienteBD = clienteDAO.buscar("10");
        assertNotNull(clienteBD);
        assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
        assertEquals(cliente.getNome(), clienteBD.getNome());

        cliente.setCodigo("20");
        cliente.setNome("Henrique");
        Integer countUpdate = clienteDAO.atualizar(clienteBD);
        assertTrue(countUpdate == 1);

        Cliente clienteBD1 = clienteDAO.buscar("10");
        assertNotNull(clienteBD1);

        Cliente clienteBD2 = clienteDAO.buscar("10");
        assertNotNull(clienteBD2);
        assertEquals(clienteBD.getId(), clienteBD2.getId());
        assertEquals(clienteBD.getCodigo(), clienteBD2.getCodigo());
        assertEquals(clienteBD.getNome(), clienteBD2.getNome());

        List<Cliente> list = clienteDAO.buscarTodos();
        for (Cliente cli : list){
            clienteDAO.excluir(cli);
        }
    }

}