package Exerc07;

public class Empregado implements Comissao{

	protected String Nome;
	protected float Salario;
	
	public Empregado(String nome, float salario){
		super();
		this.Nome = nome;
		this.Salario = salario;
	}
	
	public String getNome(){
		return this.Nome;
	}
	
	public float getSalario(){
		return this.Salario;
	}
	
	public void setNome(String nome){
		this.Nome = nome;
	}
	
	public void setSalario(float salario){
		this.Salario = salario;
	}
	
	public String toString(String nome, float salario){
		return "Nome: " + this.Nome + "Salário: " + this.Salario;
	}

	@Override
	public float Comissao() {
		// TODO Auto-generated method stub
		return 0;
	}
}
