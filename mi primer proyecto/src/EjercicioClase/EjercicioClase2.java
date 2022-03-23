package EjercicioClase;

public class EjercicioClase2 {
	
//Suma los números impares que hay entre el 1 y el 1000
	
	
	public static void main(String[] args) {
		int i;
		int contador=0;
		for (i=0; i<=1000; i++)
			
			if (!(i%2==0))
				
			contador=contador+i;
			System.out.println(contador);
		

	}

}
