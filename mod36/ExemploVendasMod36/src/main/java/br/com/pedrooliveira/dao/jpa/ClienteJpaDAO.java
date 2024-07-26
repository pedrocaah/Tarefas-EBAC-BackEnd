
package br.com.pedrooliveira.dao.jpa;

import br.com.pedrooliveira.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.pedrooliveira.domain.jpa.ClienteJpa;


public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

    public ClienteJpaDAO() {
        super(ClienteJpa.class);
    }

}
