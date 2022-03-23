package Tema2;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		
		
		double opcion=0; 
		Scanner sc= new Scanner(System.in);
		
		double a=0; 
		double b=0; 
		
		do {
	
			System.out.println("CALCULADORA" +" " +"Elige opcion" );
			System.out.println("1 Sumar");
			System.out.println("2 Restar");
			System.out.println("3 Multiplicar");
			System.out.println("4 Dividir");
			System.out.println("5 Salir");
				
			opcion = sc.nextInt();
			switch ((int)opcion) {
				case 1: 
					System.out.println("Escribe el primer numero");
					
					 a=sc.nextDouble();
					System.out.println("Escribe el segundo numero");
					 b=sc.nextDouble();
					System.out.println("LA SUMA es:"+(a+b));break;
					 
				case 2: 
					System.out.println("Escribe el primer numero");  
					 a=sc.nextDouble();
					System.out.println("Escribe el segundo numero");
					 b=sc.nextDouble();
					
					
					System.out.println("2 RESTAR"+"    "+(a-b));break;
				case 3:
					System.out.println("Escribe el primer numero");  
					 a=sc.nextDouble();
					System.out.println("Escribe el segundo numero");
					 b=sc.nextDouble();
					
					System.out.println("3 MULTIPLICAR" +"     "+(a*b));break;
				
				case 4:
					System.out.println("Escribe el primer numero");  
					 a=sc.nextDouble();
					System.out.println("Escribe el segundo numero");
					 b=sc.nextDouble();
						
					System.out.println("4 DIVIDIR"+"      "+(a/b));break;
				
				case 5 :System.out.println("5 SALIR");break;
				default : System.out.println("Numero invalido");break;
			}	
			
		} while (opcion!=5);
	
		
		
			
		
		
		
		
		
		
		
	}

}
