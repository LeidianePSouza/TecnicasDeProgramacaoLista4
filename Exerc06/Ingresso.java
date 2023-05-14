package Exerc06;

public class Ingresso {

	protected float Valor;
	
	public Ingresso(float valor) {
		super();
		this.Valor = valor;
	}
	
	public String toString(float valor) {	
		return "Valor do ingresso: " + this.Valor;
	}
	
}
