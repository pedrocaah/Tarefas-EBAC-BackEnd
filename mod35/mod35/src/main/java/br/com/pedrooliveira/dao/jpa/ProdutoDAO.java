package br.com.pedrooliveira.dao.jpa;

import br.com.pedrooliveira.dao.jpa.generic.GenericDAO;
import br.com.pedrooliveira.domain.Produto;

public class ProdutoDAO extends GenericDAO<Produto, Long> implements IProdutoDAO{
    public ProdutoDAO() {
        super(Produto.class);
    }
}
