package Arrays;

import java.util.Scanner;

public class Ejemplo1 {
	//static int [] notas;
	//final static int N=10;
	public static void pintarVector(int notas[]) {
		//Notas.legnth nos dice el tamaño del array.
		for (int i=0; i<notas.length; i++){
		System.out.print(notas[i]+",");
		System.out.println();
		}
	}

	public static void main(String[] args) {
		
	int notas[]; // ARRAY DE NOTAS
	int numNotas=10; // Tamaño del array
	
	//Iniciar el ARRAY
	notas=new int [numNotas];
	
	//Scanner de teclado
	Scanner sc= new Scanner(System.in);

	
	for (int i=0; i<10; i++) {
		System.out.println("Dime una nota");
		int valor = sc.nextInt();
		
		//Meto el valor leído de teclado en el array
		notas[i]=valor;
	}
		//Cerrar teclado
		sc.close();
		pintarVector(notas);
		
		
		//Calcular nota media
		int total=0; //Donde guardo la suma
		for (int i=0; i<notas.length; i++) {
			total+=notas[i]; //Total= total + notas[i]
		}
		System.out.println("La nota media es:"+total/notas.length);
	}

}
