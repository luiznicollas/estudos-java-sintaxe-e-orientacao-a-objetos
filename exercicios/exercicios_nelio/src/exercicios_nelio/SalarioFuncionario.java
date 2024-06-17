package exercicios_nelio;
import java.util.Locale;
import java.util.Scanner;

public class SalarioFuncionario 
{
       
	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("digite o numero");
		int number = sc.nextInt(); 
		
		System.out.println("digite as horas trabalhadas");
		double horasTrabalhadas = sc.nextDouble(); 
		
		System.out.println("digite o valor por hora");
		double valorPorHora = sc.nextDouble();
		
		sc.close();
		
	    double salario  = valorPorHora * horasTrabalhadas;
	    
	   System.out.println("NUMBER = " + number);
	   
	   System.out.printf("SALARY =%.2f%n",salario);
	   
	   
	   
	   
	    
	    
		
		
		
		
		
	
		
		
		
		
		

	}

}
