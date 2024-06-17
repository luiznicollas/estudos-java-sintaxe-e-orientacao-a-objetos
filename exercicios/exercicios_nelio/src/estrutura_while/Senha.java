
package estrutura_while;

import java.util.Scanner;
public class Senha {

	
	public static void main(String args[]) {
		String senha;
		
	
		Scanner sc = new Scanner(System.in);
		System.out.println("digite a senha");
		 senha = sc.next();
		 
		  while (senha != "lalala") {
			System.out.println("senha incorreta tente novamente");
			 senha = sc.next();
			 
		}
		
		sc.close();
		
		System.out.println("Acesso permitido");
		
		
	}
	
	
	
}
