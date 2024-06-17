package application;

import java.util.Locale;
import java.util.Scanner;
import entities.ClasseTriangulo;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double areax,areay;
        
        ClasseTriangulo x,y;
        x = new ClasseTriangulo();
        y = new ClasseTriangulo();
        
        System.out.println("Enter the measures the triangle X: ");
        x.a = sc.nextDouble();
        x.b =sc.nextDouble();
        x.c = sc.nextDouble();
        
        System.out.println("Enter the measures the triangle Y: ");
        y.a = sc.nextDouble();
        y.b =sc.nextDouble();
        y.c = sc.nextDouble();
        
        sc.close();
        
        
       areax = x.calcularArea();
       System.out.println(areax);
       areay = y.calcularArea();
       System.out.println(areay);
       
		
        
	}

	

}
