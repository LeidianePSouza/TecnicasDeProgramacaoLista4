package Exer04;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> listaProdutosComprados = new ArrayList<String>();
		listaProdutosComprados.add("Prod1");
		listaProdutosComprados.add("Prod2");

		ArrayList<Integer> quantidadeProdutosComprados = new ArrayList<Integer>();
		quantidadeProdutosComprados.add(2);
		quantidadeProdutosComprados.add(5);
		
		//float pagamento = precoPagar();

		
		System.out.println("Nome: " + listaProdutosComprados + " / Qtd: "
		+ quantidadeProdutosComprados + " / Preço total: " );
		
	}

}
