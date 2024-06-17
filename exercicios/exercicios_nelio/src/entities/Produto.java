package entities;

public class Produto {

	public String nome;
	public double preco;
	public int quantidade;
	
 public double valorTotalEstoque(){
	 
		double valorTotal = preco*quantidade;
		 return valorTotal;
	}
	
 public void adicionarProduto(int quantidades) {
	    quantidade +=  quantidades;
	    
	    
 }
	
 public void removerProduto(int quantidades) {
	   quantidade -= quantidades;
 }
}
