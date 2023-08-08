package aplicacao;

import java.util.Scanner;

import Entidade.Produto;

public class Programa {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	
	
	Produto produto = new Produto();
	
      System.out.println( "Informe os daods do produto");
      System.out.print("Nome: ");
      produto.nome = sc.nextLine();
       
      System.out.print("Preço: ");
      produto.preco = sc.nextDouble();

      System.out.print("Quantidade: ");
	  produto.quantidade = sc.nextInt();
	  System.out.println("\nDados do produto\n" +produto);
	  System.out.println("");
	  
	  System.out.println("\nDigite o número de Produtos a serem adicionados no estoque");
	  int quantidade = sc.nextInt();
	  produto.addProduto(quantidade);	
	  
	  System.out.println("Dados do produtos Atualizados");
	  System.out.println("");	
	  
	  System.out.println("Digite o numero de Produtos a serem removidos");
	  quantidade = sc.nextInt();
	  produto.removeProduto(quantidade);
	  
	  sc.close();
	}

}
