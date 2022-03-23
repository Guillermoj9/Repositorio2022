package Ejercicio2;

import java.util.Objects;

public class Multimedia {
	
	protected long codigo;
	protected long titulo;
	protected boolean plus;
	protected int precio;
	protected String genero;
	
	//Constructor
	public Multimedia(long codigo, long titulo, boolean plus, int precio, String genero) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.plus = plus;
		this.precio = precio;
		this.genero = genero;
	}
	
	//Constructor - codigo y genero
	public Multimedia(long titulo, boolean plus, int precio) {
		super();
		this.titulo = titulo;
		this.plus = plus;
		this.precio = precio;
	}

	//Constructor vacio
	public Multimedia() {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.plus = plus;
		this.precio = precio;
		this.genero = genero;
	}


	/**
	 * @return the codigo
	 */
	public long getCodigo() {
		return codigo;
	}


	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}


	/**
	 * @return the titulo
	 */
	public long getTitulo() {
		return titulo;
	}


	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(long titulo) {
		this.titulo = titulo;
	}


	/**
	 * @return the plus
	 */
	public boolean isPlus() {
		return plus;
	}


	/**
	 * @param plus the plus to set
	 */
	public void setPlus(boolean plus) {
		this.plus = plus;
	}


	/**
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}


	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}


	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}


	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}


	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Multimedia other = (Multimedia) obj;
		return codigo == other.codigo;
	}
	
	
	
	
}
