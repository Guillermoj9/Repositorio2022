package Arrays;

public class EjemploArray1 {
	
	
	public static void pintarVector(int numeros[]) {
		System.out.print("[");
		for (int i=0; i<numeros.length; i++)
			System.out.print(numeros[i]+",");
		
		System.out.println("]");
	}
	
	public static int sumarImpar(int numeros[]) {
		int suma=0;
		
		for (int i=0; i<numeros.length; i+=2) {
			suma=suma+numeros[i];
		}
		return suma;
	}
	
	public static boolean esPrimo(int numero) {
		boolean esPrimo=true;
		
		for (int i=2; i<=numero-1; i++) {
			if (numero%i==0) {
				esPrimo= false;
				break;
			}
		}
		return esPrimo;
	}
	
	public static int SumaPrimo(int numeros[]) {
		int suma=0;
		for (int i=0; i<numeros.length; i++) {
			if (esPrimo(numeros[i])) {
				suma=suma+numeros[i];
			}
			
		}
		return suma;
	}
	
	
	public static void main(String[] args) {
		int numeros[]= new int [20];
		for (int i=0; i<numeros.length; i++)
		numeros[i]= (int)(Math.random()*100+1);
		
		
		pintarVector(numeros);
		System.out.println(sumarImpar(numeros));
		System.out.println(SumaPrimo(numeros));

	}

}
