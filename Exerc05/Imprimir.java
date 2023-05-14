package Exerc05;

public class Imprimir extends Contato{

	public Imprimir(int codigo, String nome, String endereco, String email, String telefone, String observacao) {
		super(codigo, nome, endereco, email, telefone, observacao);
	}
	
	public void imprimirDados(){
		System.out.println(this.Codigo + this.Nome + this.Endereco + this.getEmail() + this.Telefone);
	}

	
	

}
