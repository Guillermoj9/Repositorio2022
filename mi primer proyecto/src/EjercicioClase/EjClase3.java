package EjercicioClase;

public class EjClase3 {
//Dados dos n�meros h y k, muestra todos los n�meros m�ltiplos de 5 que hay entre ellos
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h=3; 
		int k=15; 
		
		for (int i=h; i<=k; i++) {
			
			if (i%5==0)
				System.out.println(i);
			
		}
	}

}
