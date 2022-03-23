package Arrays;

public class Ejemplo2 {

	public static void pintarVector(char letra[]) {
		System.out.print("[");
		for (int i=0; i<letra.length; i++)
			System.out.print(letra[i]+",");
		
		System.out.println("]");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char abecedario[]= new char[26];
		char car='A';
		
		for (int i=0; i<abecedario.length; i++) {
			abecedario[i]=car;
			car++;
		}
		pintarVector(abecedario);
	}

}
