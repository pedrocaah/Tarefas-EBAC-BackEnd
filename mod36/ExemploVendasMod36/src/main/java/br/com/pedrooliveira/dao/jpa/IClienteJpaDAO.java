
package br.com.pedrooliveira.dao.jpa;

import br.com.pedrooliveira.dao.generic.jpa.IGenericJapDAO;
import br.com.pedrooliveira.domain.jpa.Persistente;


public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long> {

}
