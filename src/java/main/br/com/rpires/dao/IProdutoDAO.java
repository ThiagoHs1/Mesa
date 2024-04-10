/**
 * 
 */
package br.com.rpires.dao;

import br.com.rpires.domain.Produto;

/**
 * @author rodrigo.pires
 *
 */
public interface IProdutoDAO {

	
	public Integer cadastrar(Produto cliente) throws Exception;

	public Produto consultar(String codigo) throws Exception;

	public Integer excluir(Produto clienteBD) throws Exception;
}
