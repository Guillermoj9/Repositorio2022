package Arrays;

public class Ejercicio11 {

	public static void pintarVector(int numeros[]) {
		System.out.print("[");
		for (int i=0; i<numeros.length; i++)
			System.out.print(numeros[i]+",");
		
		System.out.println("]");
	}
	public static void pintarVector1(int numeros[]) {
		System.out.print("[");
		for (int i=0; i<numeros.length; i++)
			System.out.print(numeros[i]+",");
		
		System.out.println("]");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros [][]= new int [5][5];
		if (numeros[1][1]==1) {
			
		}
		pintarVector1(numeros);
		pintarVector(numeros);
	}

}
