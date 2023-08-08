package Entidade;

public class Produto {

public String nome;
public double preco;
public int quantidade;



public double  totalEstoque() {

	return preco*quantidade;

 }
 
  public void addProduto(int quantidade) {
	   this.quantidade +=quantidade;
  }

  
  public void removeProduto(int quantidade) {
	this.quantidade -= quantidade;
}

 public String toString() {
	 
	 return nome 
			 +" R$ "
			 +String.format("%.2f", preco)
			 +"\nQuantidade em Estoque: " + quantidade
			 +"\nTotal no Estoque: $"
			 +String.format("%.2f", totalEstoque());
			 
 }

}
