package exercicios_nelio;
import java.util.Locale;
import java.util.Scanner;
public class Triangulos {

	public static void main(String[] args) {
		
		 double ax,bx,cx,ay,by,cy;
		 double areax,areay,px,py;
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
		
		 
		 System.out.println("Enter  the measures of Triangle X");
		
		 ax = sc.nextDouble();
		 bx = sc.nextDouble();
		 cx = sc.nextDouble();
		 
		 
		 System.out.println("Enter  the measures of Triangle y");
         
		 ay = sc.nextDouble();
		 by = sc.nextDouble();
		 cy = sc.nextDouble();
		 
		 sc.close();
		 // formula para o calculo da area 
		 
		 px = (ax  + bx + cx) /2;
		 
		 py = (ay+by+cy) /2;
		 
		 areax = Math.sqrt(px*(px-ax)*(px-bx)*(px-cx));
		 areay = Math.sqrt(py*(py-ay)*(py-by)*(py-cy));
		 
		 System.out.printf("Larger Area: %.4f\n " , areax);
		 System.out.printf("Larger Area: %.4f\n " , areay);
		 
		 if (areax > areay) {
			 System.out.println("x");
		 }
		 else {
			 System.out.println( "y");
		 }
	}

}
