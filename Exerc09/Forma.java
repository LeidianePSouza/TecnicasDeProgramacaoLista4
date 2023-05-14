package Exerc09;

public abstract class Forma implements CalcularArea, ImprimirNome{
	
	protected int lado;
	protected int altura;
	
	public abstract int CalcularArea();
	
	public abstract String ImprimirNome();
}
