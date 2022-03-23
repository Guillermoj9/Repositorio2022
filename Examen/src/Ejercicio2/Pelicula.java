package Ejercicio2;

public class Pelicula extends Multimedia {
	
	protected int duracion;

	public Pelicula() {
		super();
		this.duracion=duracion;
	}

	public Pelicula(long titulo, boolean plus, int precio) {
		super(titulo, plus, precio);
		this.duracion=duracion;
	}

	public Pelicula(long codigo, long titulo, boolean plus, int precio, String genero) {
		super(codigo, titulo, plus, precio, genero);
		this.duracion=duracion;
	}

	/**
	 * @return the duracion
	 */
	public int getDuracion() {
		return duracion;
	}

	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pelicula [duracion=");
		builder.append(duracion);
		builder.append("]");
		return builder.toString();
	}
	
	
}
