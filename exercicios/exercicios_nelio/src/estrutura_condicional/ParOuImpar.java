package estrutura_condicional;
import java.util.Scanner;
public class ParOuImpar 
{

	public static void main(String[] args) 
	{
		int numeroInserido;
		Scanner sc =  new Scanner(System.in);
		System.out.println("digite um numero inteiro");
		numeroInserido = sc.nextInt();
		
		if(numeroInserido % 2 == 0 ) 
		{
			System.out.println("PAR");
		}
		else
		{
			System.out.println("IMPAR");
		}
       sc.close();
	}

}
