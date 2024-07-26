/**
 *
 */
package br.com.pedrooliveira.generic.jpa;


import br.com.pedrooliveira.dao.jpa.Persistente;

import java.io.Serializable;
import java.util.Collection;


public interface IGenericJapDAO<T extends Persistente, E extends Serializable> {

    public T cadastrar(T entity);

    public void excluir(T entity);

    public T alterar(T entity);

    T consultar(E id);

    public Collection<T> buscarTodos();
}
