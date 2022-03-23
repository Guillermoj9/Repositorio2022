package Examen;

import java.util.Scanner;

public class Ejercicio3 {
	//Pintar Matriz
	public static void pintarMatriz(int matriz[][]) {
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
			
	}
	
	//ORDENAR
	public static void ordenar(int a[]) {
		boolean flag = true;
        int inicio = 0;
        int fin = a.length;
 
        while (flag == true){            
            flag = false;
 
            for (int i = inicio; i < fin - 1; ++i) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    flag = true;
                }
            }
            fin = fin - 1;
 
            //Si no hay intercambios est� ordenado
            if (flag == false)
                break;
            flag = false;
            
            for (int i = fin - 1; i >= inicio; i--) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    flag = true;
                }
            }
            inicio = inicio + 1;
        }		
	
	}
	
	//Ordenar fila 
	public static void ordenarFila(int matriz[][]) {
		
		for(int i=0; i<matriz.length; i++) {
			ordenar(matriz[i]);
		}		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz [][]=new int [20][20];
		int matrizT [][]=new int [20][20];
		
		//Aleatorio
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				matriz[i][j] = (int) (Math.random() * 100) + 1;
			}
		}
		
		
		
		
		
		double opcion=0;
		Scanner sc=new Scanner(System.in); 
		do {
			
			System.out.println("MENU" +" " +"Elige opcion" );
			System.out.println("1 Sumar fila");
			System.out.println("2 Sumar columna");
			System.out.println("3 Sumar diagonal");
			System.out.println("4 Media todos los valores de la matriz");
			System.out.println("5 Pintar matriz traspuesta");
			System.out.println("6 Mayor a menor");
			System.out.println("7 Salir");
				
			opcion = sc.nextInt();
			switch ((int)opcion) {
				case 1: 
					for (int i=0; i<matriz.length; i++) { 
						//Suma fila 
						int suma=0;
						for (int j=0; j<matriz[i].length; j++) {
							suma+=matriz[i][j];
						}
						System.out.println("La suma de la fila " + i + " es "+ suma);
					}
					break;
					 
				case 2: 
					System.out.println("Escribe el primer numero");  
					//Sumamos las columnas 
					for (int j=0; j<matriz[0].length; j++) {
						int sumaC=0;
						for (int i=0; i<matriz.length; i++){
							sumaC+=matriz[i][j];
							
						}
						System.out.println("La suma de la columna "+j+":"+sumaC);
						
					}
					break;
				case 3:
					 
					break;
				
				case 4:
					break;
			
					
				case 5 :System.out.println("Pintar Matriz traspuesta");
				for(int i=0; i<matriz.length; i++) {
					for(int j=0; j<matriz[i].length; j++) {
						matrizT[j][i] = matriz[i][j];
					}
				}
				pintarMatriz(matrizT);
				break;
				
				case 6:for(int i=0; i<matriz.length; i++) {
					ordenar(matriz[i]);//ordenarFila(matriz);
					pintarMatriz(matriz);
				     	}break;
					
				case 7: System.out.println("Salir");
				break;
				
				default : System.out.println("Numero invalido");break;
			}	
			
		} while (opcion!=7);
	}

}
