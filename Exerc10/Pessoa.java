package Exerc10;

public abstract class Pessoa {
	 
	 protected String Nome;
	 protected int CodigoSetor;
	 protected float SalarioBase;
	 protected float Imposto;

	 
	 public Pessoa(String nome, int codigoSetor, float salarioBase, float imposto){
		 super();
		 this.Nome = nome;
		 this.CodigoSetor = codigoSetor;
		 this.SalarioBase = salarioBase;
		 this.Imposto = imposto;
	 }

}
