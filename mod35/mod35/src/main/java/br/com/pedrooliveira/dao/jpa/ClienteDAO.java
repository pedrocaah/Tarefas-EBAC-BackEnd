package br.com.pedrooliveira.dao.jpa;

import br.com.pedrooliveira.dao.jpa.generic.GenericDAO;
import br.com.pedrooliveira.domain.Cliente;

public class ClienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO {

    public ClienteDAO() {
        super(Cliente.class);
    }

}