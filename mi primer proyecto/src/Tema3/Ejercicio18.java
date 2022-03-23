package Tema3;

public class Ejercicio18 {
	
	public static void pintarMatriz (int matriz[][]) {
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				System.out.println(matriz[i][j]);
			}
		}
	}
	
	
	public static void main(String[] args) {
		//Encuesta matriz 10x3
		
		int encuesta [][]=new int [100][3];
		
		//Rellenarla con datos aleatorios
		
		for (int i=0; i<encuesta.length; i++) {
			//Sexo
			encuesta[i][0]=(int) Math.random()*2+1;
			//Trabaja
			encuesta[i][0]=(int) Math.random()*2+1;
			//Sueldo
			if (encuesta [i][2]==2) {
				encuesta [i][2]=0;
			}else {
				//Si trabaja 600-2000
				encuesta [i] [2] = (int) (Math.random()*1401)+600;
			}
		}
		//Pintamos la encuesta 
		pintarMatriz(encuesta);
		
		
		//Calcular porcentajes encuesta
		int numeroHombres=0;
		int numeroMujeres=0;
		int numeroHombresTrabajan=0;
		for (int i=0; i<encuesta.length; i++) {
			if (encuesta[i][0] ==1)
				numeroHombres ++;
			if (encuesta[i][0] ==2)
				numeroMujeres ++;
		}
		
		
		//Pintar resultados
		System.out.println("El porcentaje de hombres es "+ numeroHombres*100/encuesta.length);
		System.out.println("El porcentaje de mujeres es "+ numeroMujeres*100/encuesta.length);
		System.out.println("El porcentaje de hombres que trabajan "+ numeroHombresTrabajan*100/numeroHombres);

	}

}
