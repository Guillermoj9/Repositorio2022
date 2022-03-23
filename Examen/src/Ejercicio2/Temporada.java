package Ejercicio2;

import java.util.ArrayList;

public class Temporada extends Multimedia {
	
	protected int numero;
	ArrayList <Episodio> Episodios;
	ArrayList <Serie> Series;
	
	//Constructor defecto
	public Temporada(long codigo, long titulo, boolean plus, int precio, String genero, int numero,
			ArrayList<Episodio> episodios, ArrayList<Serie> series) {
		super(codigo, titulo, plus, precio, genero);
		this.numero = numero;
		Episodios = episodios;
		Series = series;
	}

	//Constructor solo con numero
	public Temporada(long codigo, long titulo, boolean plus, int precio, String genero, int numero) {
		super(codigo, titulo, plus, precio, genero);
		this.numero = numero;
		ArrayList Episodio = new ArrayList<>();
		ArrayList Serie = new ArrayList<>();
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the episodios
	 */
	public ArrayList<Episodio> getEpisodios() {
		return Episodios;
	}

	/**
	 * @param episodios the episodios to set
	 */
	public void setEpisodios(ArrayList<Episodio> episodios) {
		Episodios = episodios;
	}

	/**
	 * @return the series
	 */
	public ArrayList<Serie> getSeries() {
		return Series;
	}

	/**
	 * @param series the series to set
	 */
	public void setSeries(ArrayList<Serie> series) {
		Series = series;
	}
	
	
}
