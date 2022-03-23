package Arrays;

import java.util.Scanner;

public class Ejercicio8 {

	public static void pintarVector(int numeros[]) {
		System.out.print("[");
		for (int i=0; i<numeros.length; i++)
			System.out.print(numeros[i]+",");
		
		System.out.println("]");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros[]= new int [5]; 
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce 5 numeros");
		int posicion=0;
		
		while (posicion==0 || posicion<=5);
		pintarVector(numeros);
		
		
	}

}
