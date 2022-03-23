package Arrays;

public class Euromillon {

	
	public static void pintarVector(int numeros[]) {
		System.out.print("[");
		for (int i=0; i<numeros.length; i++)
			System.out.print(numeros[i]+",");
		
		System.out.println("]");
	}
	
	//Generar numero que no este repetido
	public static boolean estaRepetido(int numero, int[]vector) {
		boolean estaRepetido=false;
		
		for (int i=0; i<vector.length; i++) {
			if (vector[i]==numero) {
				estaRepetido=true;
				break;
			}
		}
		return estaRepetido;
	}
	
	//Generar numeros aleatorios entre 1 y 49.
	public static int generarAleatorio() {
	int numero=0;
	numero= (int)(Math.random()*49+2);
	return numero;
	}
	
	
	public static void main(String[] args) {
		
		//Programa que genere una combinación de 6 numeros de lotería 
		//esos numeros van de 1 a 49.
		//No puede repetirse.
		
		int combinacion[]=new int[6];
		int numero=0;
		for (int i=0; i<combinacion.length; i++) {
			do {
				numero=generarAleatorio();
			}while (estaRepetido(numero,combinacion));
			
			combinacion[i]= numero;
		}
		
		//System.out.println(generarAleatorio());
		pintarVector(combinacion);
	}

}
