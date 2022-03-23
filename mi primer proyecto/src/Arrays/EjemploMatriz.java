package Arrays;

public class EjemploMatriz {

	public static void pintarMedia(int[][]matriz) {
		String[] asignaturas= {"fol","SSII","BBDD","ENTORNOS","PROGRAMACION","LM"};
		
		for (int i=0; i<matriz.length;i++) {
			//Sumo las notas de esa fila/asignatura
			int total=0;
			for (int j=0; j<matriz[i].length; j++) {
				total=total+matriz[i][j];
			}
			System.out.println("LA NOTA MEDIA DE;" +asignaturas[i]+" es "+total/matriz[i].length);
		}
	}
	
	
	public static void pintarMatriz( int [][] matriz) {
		for (int i=0; i<matriz.length; i++){
			
		
			for (int j=0; j<matriz[i].length; j++){
				System.out.print(matriz[i][j]+"|");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {

		//Asignaturas: FOL, SSII, LM, BBDD, Entornos, Programación.
		//Notas por asignatura : 4 notas diferentes
		//Matriz 6x4
		
		int notas[][]= new int [6][4];
		
		//Llenamos la matriz con notas aleatorias.
		for (int i=0; i<notas.length; i++) {  //FILAS
			for (int j=0; j<notas[i].length;j++) {
				notas[i][j]= (int) (Math.random()*10+1);
			}
		}
		//Pintar la matriz
		pintarMatriz(notas);
		//Pintar nota media
		pintarMedia(notas);
	}
}
