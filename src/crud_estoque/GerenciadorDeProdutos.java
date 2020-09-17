package crud_estoque;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeProdutos {

	private List<Produto> produtos = new ArrayList<>();

	public GerenciadorDeProdutos(List<Produto> produtos) {
		super();
		this.produtos = produtos;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public boolean adicionarProdutos(int id, String marca, String descricao, double preco, int quantidade) {
		int idProduto = this.produtos.size() + 1;

		Produto produto = new Produto(id, descricao, marca, preco, quantidade);

		return produtos.add(produto);
	}

	public boolean atualizarProduto(int idProd, String marca) {
		
		if (idProd <= this.produtos.size()) {
			Produto produto = this.produtos.get(idProd - 1);
			return true;
		} else {
			return false;
		}
	}
	
	public void excluirProduto(String marca) {
		produtos.remove(marca);
	}
	
}
