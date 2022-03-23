package Tema3;

public class Ejercicio1_1 {

	
	public static void pintarVector(int numero[]) {
		//Notas.legnth nos dice el tamaño del array.
		for (int i=0; i<numero.length; i++){
		System.out.print(numero[i]+",");
		System.out.println();
		}
	}
	public static void main(String[] args) {
		int numero[]=new int[10];
		for (int i=0; i<10; i++) {
			numero[i]= (int) (Math.random()*100+1);
		}
		pintarVector(numero);
	}

}
