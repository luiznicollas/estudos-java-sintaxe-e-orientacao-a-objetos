package estrutura_condicional;
import java.util.Scanner;
public class NumeroNegativo 
{

	public static void main(String[] args) 
	{
	  int numero;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("digite um numero inteiro");
	 numero = sc.nextInt();
	 
	 if (numero < 0)
	 {
		 System.out.println("NUMERO NEGATIVO");
	 }
	 else
	 {
		 System.out.println("NUMERO NAO NEGATIVO");
	 }
           sc.close();
	}
   
}
