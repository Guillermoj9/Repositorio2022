package EjercicioLibreria;

public class Categoria {
	
	protected String nombre;
	
	
	//Constructor
	public Categoria(String nombre) {
		super();
		this.nombre = nombre;
	}

	
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
