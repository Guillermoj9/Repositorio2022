package Tema2;

import java.util.Scanner;


public class Game {

	private static final int Jugada = 0;
	static int daño(int vida, int fuerza) {
		return (vida-fuerza);
	}
	static void Vida(int vidaJugador, int vidaEnemigo) {
		
	}
	static void ataque(int poderJugador, int poderEnemigo) {
		
	}
	public static void main(String[] args) {
		int vidaJugador=0, vidaEnemigo=0;
		int poderJugador=0, poderEnemigo=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Player 1 life");
		sc.nextInt();
		System.out.println("Player 1 Attack");
		sc.nextInt();
		System.out.println("Player 2 life");
		sc.nextInt();
		System.out.println("Player 2 Attack");
		sc.nextInt();
		sc.close();
		
			switch (Jugada) {
			case 1: 
				System.out.println("Attack1"+(poderJugador-vidaEnemigo));
				System.out.println("La vida ha bajado:");
			case 2: 
				 System.out.println("Attack2"); 
			     System.out.println("2 RESTAR"+"    ");break;
			case 3:
				System.out.println("Escribe el primer numero");  
				
	
	}
}
}

