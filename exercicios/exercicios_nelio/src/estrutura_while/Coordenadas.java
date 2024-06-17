
package estrutura_while;
import java.util.Scanner;
public class Coordenadas {

	public static void main(String[] args) {
		int x;
		int y;
		
	     Scanner sc = new Scanner(System.in);
	     
	     System.out.println("digite  valor pra x");
	     x = sc.nextInt();
	     System.out.println("digite valor pra y ");
	     y = sc.nextInt();
	     
	    while (x != 0 && y != 0) {
	     
	     if(x > 0 && y > 0) {
	    	 System.out.println("primeiro");
	     }
	     else if (x < 0 && y > 0) {
	    	 System.out.println("segundo");
	    	 
	     }
	     else if (x < 0 && y < 0) {
	    	 System.out.println("terceiro");
	     }
	     
	     else if (x >0 && y < 0 ){
	    	 System.out.println("quarto");
	    	 
	    	
	     }
      System.out.println("digite valor para x ");
	     
	     x = sc.nextInt();
	     
	     System.out.println("digite valor para y ");
	     
	     y = sc.nextInt();
	     
	     
	   }
	   
	sc.close(); 
	}

}
