package estrutura_condicional;
import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		int numero1,numero2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite dois numeros inteiros");
		
		numero1 = sc.nextInt();
		numero2 = sc.nextInt();
		
		
		if (numero1%numero2 == 0 ||  numero2%numero1 == 0)
		{
			System.out.println("são multiplos");
		}
		else
		 {
			System.out.println("não sao multiplos");
		 }
		
		
		
     sc.close();
	}

}
