package Examen;

public class Ejercicio5 {
	public static void pintarVector(int numero[]) {
		//Notas.legnth nos dice el tamaño del array.
		for (int i=0; i<numero.length; i++){
		System.out.print(numero[i]+" ");
		System.out.print("");
		}
	}
	public static void burbujaMejorada(int vector[]) {
		int aux=0;
		for(int i=vector.length; i>0; i--) {
			for(int j=0; j<i-1; j++) {
				if (vector[j] > vector[j+1]) {
					aux = vector[j];
					vector[j] = vector[j+1];
					vector[j+1] = aux;
				}
			}
		}		
	}
	public static void main(String[] args) {
		int dado []= new int [5] ;
		for (int i=0; i<5; i++) {
			dado[i]= (int) (Math.random()*6+1);
		}
		burbujaMejorada(dado);
		pintarVector(dado);
	
		if (dado[0]==dado[1] && dado[2]==dado[3] && dado[3]==dado[4]) {
			System.out.println("Poker real");
			//POKER
		}else if (dado[0]==dado[1] && dado[2]==dado[3] && dado[3]!= dado[4] ){
			System.out.println("Poker");
			//FULL
		}else if (dado[0]==dado[1]&&dado[2]==dado[0]&&dado[3]==dado[4]) {
			System.out.println("Full");
			//ESCALERA MAYOR
		}else if (dado[0]==2 && dado[1]==3 && dado[2]==4 &&dado[3]==5 && dado[4]==6) {
			System.out.println("Escalera Mayor");
			//ESCALERA MENOR
		}else if (dado[0]==1&&dado[1]==2&& dado[2]==3 && dado[3]==4 && dado[4]==5) {
			System.out.println("Escalera menor");
			//TRIO
		}else if  (dado[0]==dado[1]&& dado[0]==dado[2] || dado[0]== dado[3]&& dado[0]==dado[4] || dado[1]== dado[2]&& dado[1]==dado[3]|| dado[2]==dado[3]&& dado[2]==dado[4]){
			System.out.println("Trio");
			//DOBLE PAREJA
		}else if (dado[0]==dado[1]&&dado[2]==dado[3] && dado[1]==dado[2]&& dado[1]==dado[3]&&dado[2]==dado[3]&& dado[0]==dado[4]){
			System.out.println("Doble pareja");
			//PAREJA
		}else if (dado[0]==dado[1] || dado[0]==dado[2] || dado[0]==dado[3]|| dado[0]==dado[4] || dado[1]== dado[2]|| dado[1]==dado[3]|| dado[1]==dado[4]|| dado[2]==dado[3]|| dado[2]== dado[4]|| dado[3]== dado[4])
				{
			System.out.println("Pareja");
		}
	}
	
}
