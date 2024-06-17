package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class TesteProduto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Produto product =new Produto();
		
		System.out.println("Enter product data: ");
		
		System.out.println("Name: ");
		
		product.nome= sc.next();
		System.out.println("Price: ");
		
		product.preco = sc.nextDouble();
		
		System.out.println("Quantity in stock: ");
		
		product.quantidade = sc.nextInt();
		
		sc.close();
		
		System.out.println(product.nome+ product.preco+product.quantidade);
		double resultado = product.valorTotalEstoque();
		System.out.printf("Total: %.2f ",resultado);
		

	}

}
