package Exerc07;

public class Gerente extends Empregado{

	public Gerente(String nome, float salario) {
		super(nome, salario);
	}
	
	public String getNome(){
		return this.getNome();
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


	
}
