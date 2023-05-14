package Exer03;

public class Fatura {

	protected int Numero;
	protected String Descricao;
	protected int QuantidadeComprada;
	protected float PrecoUnitario;
	protected float PrecoTotal;
	
	public Fatura(int numero, String descricao, int quantidade, float preco, float precoTotal) {
		super();
		Numero = numero;
		Descricao = descricao;
		QuantidadeComprada = quantidade;
		PrecoUnitario = preco;
		PrecoTotal = precoTotal;
	}
	
	public void QuantidadeComprada(float quantidadeComprada) {
		if (quantidadeComprada < 0) {
			this.QuantidadeComprada = 0;
		}
	}
	
	public void PrecoUnitario(float precoUnitario) {
		if (precoUnitario < 0) {
			this.PrecoTotal = 0;
		}
	}
	
	public float getPrecoUnitario() {
		return this.PrecoUnitario;
	}
	
	public void setPrecoUnitario(float precoUnitario) {
		this.PrecoUnitario = precoUnitario;
	}
	
	public double getValorFatura() {
		return QuantidadeComprada*PrecoUnitario;
	}
	
}
