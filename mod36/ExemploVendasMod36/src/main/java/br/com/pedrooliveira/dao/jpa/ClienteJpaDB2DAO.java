
package br.com.pedrooliveira.dao.jpa;

import br.com.pedrooliveira.dao.generic.jpa.GenericJpaDB2DAO;
import br.com.pedrooliveira.domain.jpa.ClienteJpa;


public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

    public ClienteJpaDB2DAO() {
        super(ClienteJpa.class);
    }

}
