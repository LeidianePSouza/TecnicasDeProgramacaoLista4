package Exerc05;

public class Contato implements validarTelefone, validarCodigo{
	
	protected int Codigo;
	protected String Nome;
	protected String Endereco;
	private String Email;
	protected String Telefone;
	protected String Observacao;
	
	public Contato(int codigo){
		super();
		Codigo = codigo;
	}
	
	public Contato(int codigo, String nome){
		super();
		Codigo = codigo;
		Nome = nome;
	}
	
	public Contato(int codigo, String nome, String email) {
		super();
		Codigo = codigo;
		Nome = nome;
		Email = email;
	}
	
	public Contato(String telefone){
		super();
		Telefone = telefone;
	}
	
	
	
	public Contato(int codigo, String nome, String endereco, String email, String telefone, String observacao) {
		super();
		Codigo = codigo;
		Nome = nome;
		Endereco = endereco;
		Email = email;
		Telefone = telefone;
		Observacao = observacao;
	}

	public String getEmail(){
		return this.Email;
	}

	@Override
	public boolean validarCodigo() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validarTelefone() {
		// TODO Auto-generated method stub
		return false;
	}
	

}
