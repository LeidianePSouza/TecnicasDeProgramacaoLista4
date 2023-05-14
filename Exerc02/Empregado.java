package Exer02;

public class Empregado {
	private String Nome;
	private String Sobrenome;
	private float SalarioMensal;
	
	public Empregado(String nome, String sobrenome, float salarioMensal) {
		super();
		Nome = nome;
		Sobrenome = sobrenome;
		SalarioMensal = salarioMensal;
	}

	public String getNome() {
		return this.Nome;
	}
	
	public String getSobrenome() {
		return this.Sobrenome;
	}
	
	public float getSalarioMensal() {
		return this.SalarioMensal;
	}
	
	public void setNome(String nome) {
		this.Nome = nome;
	}

	public void setSobrenome(String sobrenome) {
		this.Sobrenome = sobrenome;
	}	
	
	public void setSalarioMensal(float salarioMensal) {
		if (salarioMensal < 0) {
			this.SalarioMensal = 0;
		}
	}
}
