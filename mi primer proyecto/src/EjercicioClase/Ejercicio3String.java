package EjercicioClase;

public class Ejercicio3String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cad1 = "Esta tarde no voy ";
		String cad2 = "esta tarde no VOY";
		
		String minC1 = cad1.toLowerCase();
		String minC2 = cad2.toLowerCase();
		
		if (minC1.equals(minC2)) {
			System.out.println("Son iguales");
			
		}else {
			System.out.println("Diferentes");
		}
	}

}
