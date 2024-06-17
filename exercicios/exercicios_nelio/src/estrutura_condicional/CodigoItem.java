package estrutura_condicional;

import java.util.Scanner;

public class CodigoItem 
{

	public static void main(String[] args)
	{
		int codigoItem,quantidade;
		double precoTotal;
		Scanner sc = new Scanner(System.in);
		
		codigoItem = sc.nextInt();
		quantidade = sc.nextInt();
		
        if (codigoItem == 1 )
        {
        	precoTotal =  quantidade * 4;
        	System.out.println("TOTAL  =" + precoTotal);
        }
		
        else if (codigoItem == 2 )
        {
        	precoTotal = quantidade * 4.5;
        	System.out.println("TOTAL = " + precoTotal);
        }
        else if (codigoItem == 3)
        {
        	precoTotal = quantidade * 5.0;
        	System.out.println("TOTAL = " + precoTotal);
        }
        
        else if (codigoItem == 4 )
        {
        	precoTotal = quantidade * 2.0;
        	System.out.println("TOTAL = " + precoTotal);
        }
        else if (codigoItem == 5 )
        {
        	precoTotal = quantidade * 1.5;
        	System.out.println("TOTAL = " + precoTotal);
        }
        
        
		sc.close();
          
          
	}

}
