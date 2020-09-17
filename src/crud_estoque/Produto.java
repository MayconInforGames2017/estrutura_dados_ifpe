package crud_estoque;

public class Produto {

	private int id;
	private String descricao;
	private String marca;
	private double preco;
	private int quantidade;

	public Produto() {
	}

	public Produto(int id, String descricao, String marca, double preco, int quantidade) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.marca = marca;
		this.preco = preco;
		this.setQuantidade(quantidade);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
