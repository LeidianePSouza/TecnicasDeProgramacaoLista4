package Exerc10;

public class Empregado extends Pessoa{

	public Empregado(String nome, int codigoSetor, float salarioBase, float imposto) {
		super(nome, codigoSetor, salarioBase, imposto);
	}
	
	public float CalcularSalario(){
		return 0;
	}

}
