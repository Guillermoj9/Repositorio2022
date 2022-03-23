import java.util.Scanner;

public class refactor {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("Pon un numero");
		numero=sc.nextInt();
		
		System.out.println(   );
		
		System.out.println("El cuadrado es " +numero);
		
	}

	private static int extracted(int numero) {
		return numero*numero;
	}
}
