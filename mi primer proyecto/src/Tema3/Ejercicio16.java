package Tema3;

public class Ejercicio16 {
	
	public static boolean estaRepetido(int numero, int [][]matriz) {
		
		boolean encontrado=false ;
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				if (numero== matriz[i][j]) {
					encontrado=true;
					break;
				}
			}
		}
		
		
		return encontrado;
	}
	
	
	public static void pintarMatriz(int numeros[][]) {
		for (int i=0; i<numeros.length; i++) {
			for (int j=0; j<numeros[i].length; j++) {
				
			
				System.out.print(numeros[i][j]+"|");
			}
			System.out.println("|");
		}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz[][]=new int [3][6];
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				boolean condicion; int numero;
				do {
					numero=(int) (Math.random()*100+1);
					 condicion= estaRepetido(numero,matriz);
					
				} while(condicion);
				
				matriz[i][j]=numero;
			}
			pintarMatriz(matriz);
		}
	}

}
