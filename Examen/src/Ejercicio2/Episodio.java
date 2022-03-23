package Ejercicio2;

import java.util.ArrayList;

public class Episodio extends Multimedia {

	protected String titulo;
	protected String duracion;
	ArrayList <Temporada> Temporadas;
	
	
	public Episodio(long codigo, long titulo, boolean plus, int precio, String genero, String titulo2,
			String duracion) {
		super(codigo, titulo, plus, precio, genero);
		titulo2 = titulo2;
		this.duracion = duracion;
		ArrayList Temporada = new ArrayList<>();
	}


	


	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	/**
	 * @return the duracion
	 */
	public String getDuracion() {
		return duracion;
	}


	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}


	/**
	 * @return the temporadas
	 */
	public ArrayList<Temporada> getTemporadas() {
		return Temporadas;
	}


	/**
	 * @param temporadas the temporadas to set
	 */
	public void setTemporadas(ArrayList<Temporada> temporadas) {
		Temporadas = temporadas;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Episodio [titulo=");
		builder.append(titulo);
		builder.append(", duracion=");
		builder.append(duracion);
		builder.append(", Temporadas=");
		builder.append(Temporadas);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
