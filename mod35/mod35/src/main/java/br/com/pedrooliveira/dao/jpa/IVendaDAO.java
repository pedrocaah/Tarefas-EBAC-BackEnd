package br.com.pedrooliveira.dao.jpa;


import br.com.pedrooliveira.dao.jpa.generic.IGenericDAO;
import br.com.pedrooliveira.domain.Venda;

public interface IVendaDAO extends IGenericDAO<Venda, Long> {
    void finalizarVenda(Venda venda);

    void cancelarVenda(Venda venda);

    Venda consultarComCollection(Long id);
}
