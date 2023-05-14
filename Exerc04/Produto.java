package Exer04;

public class Produto {

	protected String Nome;
	protected float Preco;
	protected int Quantidade;
	
	public Produto (String nome, float preco, int quantidade) {
		super();
		this.Nome = nome;
		this.Preco = preco;
		this.Quantidade = quantidade;
	}
	
	public float getPreco() {
		
		float preco = this.Preco;
		
		return preco;
	}
	
	public void precoPagar(float quantidadeProdutosComprados, float preco) {
		
		System.out.println(quantidadeProdutosComprados*preco);
	}
	
}
