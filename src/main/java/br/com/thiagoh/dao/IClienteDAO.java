/**
 * 
 */
package br.com.thiagoh.dao;

import java.util.List;

import br.com.thiagoh.dao.generic.IGenericDAO;
import br.com.thiagoh.domain.Cliente;

/**
 * @author rodrigo.pires
 *
 */
public interface IClienteDAO extends IGenericDAO<Cliente, Long>{

	List<Cliente> filtrarClientes(String query);

}
