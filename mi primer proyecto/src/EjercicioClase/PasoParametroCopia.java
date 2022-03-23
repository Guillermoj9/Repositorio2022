package EjercicioClase;

public class PasoParametroCopia {

	//Funciona con los tipos básicos, int, long, double, boolean...
	public static void modificar(int num) {
		num=50;
		System.out.println("Dentro del método"+num);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero =5; 
		//numero se copia a num, pero lo que haga dentro la función no se ve modificado.
		modificar(numero);
		System.out.println("en el main"+numero);
	}

}
