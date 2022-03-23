package Tema2;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		
		int num=0;
		int mayor=0;
		int menor=0;
		
		do {
			num=sc.nextInt();
			
			if (num==0) {
				break;
			}
			else {
				mayor=num;
				
				if (num>mayor) {
					mayor=num;
				}
				menor=num;	
				if(num<menor) {
					menor=num;
				}
					
			}
			
		}while(num!=0); 
		
		System.out.println("El mayor es;"+mayor);
		System.out.println("El menor es;"+menor);
	}

}
