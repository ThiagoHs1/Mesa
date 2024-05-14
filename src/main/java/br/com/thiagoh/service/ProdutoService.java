/**
 * 
 */
package br.com.thiagoh.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.thiagoh.dao.IProdutoDAO;
import br.com.thiagoh.domain.Produto;
import br.comthiagoh.services.generic.GenericService;

/**
 * @author rodrigo.pires
 *
 */
@Stateless
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {
	
	private IProdutoDAO produtoDao;

	@Inject
	public ProdutoService(IProdutoDAO produtoDao) {
		super(produtoDao);
		this.produtoDao = produtoDao;
	}

	@Override
	public List<Produto> filtrarProdutos(String query) {
		return produtoDao.filtrarProdutos(query);
	}

}
