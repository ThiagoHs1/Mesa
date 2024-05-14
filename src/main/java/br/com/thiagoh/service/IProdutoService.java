/**
 * 
 */
package br.com.thiagoh.service;

import java.util.List;

import br.com.thiagoh.domain.Produto;
import br.comthiagoh.services.generic.IGenericService;

/**
 * @author rodrigo.pires
 *
 */
public interface IProdutoService extends IGenericService<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}
