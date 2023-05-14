package Exerc07;

public class Vendedor extends Empregado{

	public Vendedor(String nome, float salario, float percentual) {
		super(nome, salario);
		
	}
	
	public float Comissao(float percentual){
		float aumento = this.Salario*percentual;
		return aumento; 
	}
	
	public float calcularSalario(float aumento){
		return this.Salario + aumento;
	}
	
	public String toString(String nome, float salario, float percentual){
		return "Nome: " + nome + "Salário sem comissão: " + this.Salario + "Salário com comissão: "
	+ this.calcularSalario(percentual) + "Percentual: " + percentual;
	} 

}
