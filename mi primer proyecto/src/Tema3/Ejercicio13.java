package Tema3;

import java.util.Scanner;

public class Ejercicio13 {

	public static void pintarMatriz(int numeros[][]) {
		for (int i=0; i<numeros.length; i++) {
			for (int j=0; j<numeros[i].length; j++)
			System.out.print(numeros[i][j]+"|");
			System.out.println("|");
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int matriz[][]=new int [3][4];
		
		//Lo rellenamos
		for (int i=0; i<matriz.length; i++) {
			System.out.println("Fila"+i);
			
			for (int j=0; j<matriz[i].length; j++) {
				System.out.println("Introduce el valor "+j+":");
				matriz[i][j]= Integer.parseInt(sc.nextLine());
			}
			System.out.println();
		}
		//Pintamos la matriz
		pintarMatriz(matriz);
		
		//Sumamos la fila
		
		for (int i=0; i<matriz.length; i++) { 
			//Cada fila empieza a sumar desde cero
			int suma=0;
			for (int j=0; j<matriz[i].length; j++) {
				suma+=matriz[i][j];
			}
			System.out.println("La suma de la fila " + i + " es "+ suma);
		}
		//Sumamos las columnas 
		for (int j=0; j<matriz[0].length; j++) {
			int sumaC=0;
			for (int i=0; i<matriz.length; i++){
				sumaC+=matriz[i][j];
				
			}
			System.out.println("La suma de la columna "+j+":"+sumaC);
			
		}
	}

}
