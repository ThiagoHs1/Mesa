/**
 * 
 */
package br.com.thiagoh.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.thiagoh.dao.IClienteDAO;
import br.com.thiagoh.domain.Cliente;
import br.com.thiagoh.exceptions.DAOException;
import br.com.thiagoh.exceptions.MaisDeUmRegistroException;
import br.com.thiagoh.exceptions.TableException;
import br.comthiagoh.services.generic.GenericService;

/**
 * @author rodrigo.pires
 *
 */
@Stateless
public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {
	
	private IClienteDAO clienteDAO;
	
	@Inject
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
		this.clienteDAO = clienteDAO;
	}

	@Override
	public Cliente buscarPorCPF(Long cpf) throws DAOException {
		try {
			return this.dao.consultar(cpf);
		} catch (MaisDeUmRegistroException | TableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Cliente> filtrarClientes(String query) {
		return clienteDAO.filtrarClientes(query);
	}

}
