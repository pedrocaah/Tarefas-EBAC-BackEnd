
package br.com.pedrooliveira.dao.jpa;

import br.com.pedrooliveira.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.pedrooliveira.domain.jpa.ProdutoJpa;


public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

    public ProdutoJpaDAO() {
        super(ProdutoJpa.class);
    }

}
