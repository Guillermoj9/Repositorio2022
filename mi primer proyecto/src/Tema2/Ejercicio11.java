package Tema2;

public class Ejercicio11 {

	static int cuentaD(int num) {
		int contador=0;
		int division=0;
		
		do {
			division=(int)num/10;   //Divido entre 10 para quitar un dígito.
			num=division;	 		//Num pasa a ser lo que queda dividido.
			contador++;				//Incremento el contador de dígitos.
		}while(division>0);
		
		return contador;
	}
	
	public static void main(String[] args) {
	
		
		System.out.println(cuentaD(123456789));
	}

}
