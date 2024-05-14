/**
 * 
 */
package br.com.thiagoh.dao;

import java.util.List;

import br.com.thiagoh.dao.generic.IGenericDAO;
import br.com.thiagoh.domain.Produto;

/**
 * @author rodrigo.pires
 *
 */
public interface IProdutoDAO extends IGenericDAO<Produto, String>{

	List<Produto> filtrarProdutos(String query);

}
