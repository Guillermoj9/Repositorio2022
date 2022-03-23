package Tema2;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		int factorial=1;
		int  n=0;		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero n > 1");
		n=sc.nextInt();
		sc.close();
		


		
		  
		//Calcular factorial
		for (int i=1; i<=n; i++) {
			factorial=factorial*i;
		}
		System.out.println("Factorial de: " + n+ "es:    "+factorial);
	}

}
