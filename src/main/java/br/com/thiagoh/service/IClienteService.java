/**
 * 
 */
package br.com.thiagoh.service;

import java.util.List;

import br.com.thiagoh.domain.Cliente;
import br.com.thiagoh.exceptions.DAOException;
import br.comthiagoh.services.generic.IGenericService;

/**
 * @author rodrigo.pires
 *
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

	List<Cliente> filtrarClientes(String query);

}
