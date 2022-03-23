package Ejercicio2;

import java.util.ArrayList;

public class Serie extends Multimedia {

	
	ArrayList <Temporada> Temporadas;

	public Serie() {
		super();
	ArrayList Temporada = new ArrayList<>();
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
		builder.append("Serie [Temporadas=");
		builder.append(Temporadas);
		builder.append("]");
		return builder.toString();
	}
	

}
