import java.util.Scanner;
import java.util.Locale;

public class ProdutoTestar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Produto produto =new Produto();
		
		System.out.println("Enter product data: ");
		
		System.out.println("Name: ");
		
		String nome = sc.nextLine();
		
		produto.setNome(nome);
		
		System.out.println("Price: ");
		
		double preco = sc.nextDouble();
		produto.setPreco(preco);
		
		System.out.println("Quantity in stock: ");
		
		int quantidades;
		 quantidades =  produto.getQuantidade();
		
		sc.close();
	   System.out.println(quantidades);
	   System.out.println(produto.getNome());
	   
	   

	}

}
