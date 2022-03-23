package Tema2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int num=0; 
		
		Scanner sc= new Scanner(System.in); 
		System.out.println("Dime un numero");
		num=sc.nextInt();
		sc.close();
		
	if (num%2==0);{
		System.out.println("El numero es multiplo de 2:"+num);
	}	
	if (num%3==0) {
		System.out.println("El numero es multiplo de 3:"+num);
	}	 
	if (num%5==0) {
			 System.out.println("El numero es multiplo de 5:"+num);
	}
	if (num%7==0) {
		System.out.println("El numero es multiplo de 7:"+num);
			 
		 }
		
	}
}


