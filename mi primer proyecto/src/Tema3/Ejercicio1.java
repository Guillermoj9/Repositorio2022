package Tema3;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Llena una matriz de 4x6 de int aleatorios (1-100)
		
		int matriz[][]= new int [4][6];
		System.out.println("Filas"+matriz.length);
		System.out.println("Columnas"+matriz[0].length);
		
		//Cada fila
		for (int i=0; i<matriz.length;i++) {
			System.out.print("  Fila  "+i);
			
			//Cada columna
			for ( int j=0; j<matriz[0].length; j++) {
				System.out.print("  Col  "+ j);
				
				matriz[i][j]= (int) (Math.random()*100)+1;
			}
			
			System.out.println();
		}

		//Pintamos matriz
		for (int i=0; i< matriz.length; i++) {
			
		
		
			
			//Cada columna
			for (int j=0; j<matriz[0].length; j++) {
				System.out.print(matriz[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
