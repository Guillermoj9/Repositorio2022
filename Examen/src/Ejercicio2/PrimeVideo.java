package Ejercicio2;

import java.util.ArrayList;

public class PrimeVideo {
	
	protected double ganancias;
	ArrayList<Multimedia> catalogo;
	ArrayList<Cliente> Suscriptores;
	
	//Constructor
	public PrimeVideo(double ganancias, ArrayList<Multimedia> catalogo, ArrayList<Cliente> suscriptores) {
		super();
		this.ganancias = 0;
		this.catalogo = new ArrayList<>();
		Suscriptores = new ArrayList<>();
	}
	//Metodos para añadir y eliminar suscriptor
		/**
		 * 
		 * @param aut
		 */
		public void addSuscriptor(Cliente aut) {
			Suscriptores.addAll(Suscriptores);
		}
		/**
		 * 
		 * @param aut
		 */
		public void elimiarAutor(Cliente aut) {
			Suscriptores.remove(Suscriptores);
		}
}
