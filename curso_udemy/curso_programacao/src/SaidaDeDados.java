import java.util.Locale;

public class SaidaDeDados {

	public static void main(String[] args) {
 		  System.out.print("bom dia!"); //sem quebra de linha
 		 System.out.println("boa tarde!"); 
 		 
 		 int y = 32;
 		 System.out.println(y);
 		 
 		 
 		 double x = 32.456;
 		 System.out.printf("%.2f%n", x);
 		 Locale.setDefault(Locale.US);
 		 System.out.printf("%.2f%n", x);
 		 
 		System.out.printf("o seu resultado é: " + x + " metros e ");
 		
 		String nome = "maria";
 		int idade = 32;
 		double renda = 4000.0;
 		System.out.printf("%s tem %d anos e ganha  R$ %.2f reais",nome,idade,renda);
 		
 		 
	}

}
