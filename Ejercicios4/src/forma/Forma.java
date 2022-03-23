package forma;

import java.util.Objects;

public abstract class Forma {
	
	//Propiedades
	protected int id;
	private static int contaF=0;
	
	
	
	//Abstract 
		public abstract double area();

		public abstract void dibujar();
		
	    //Constructor
	    public Forma() {
			Forma.contaF++;
			this.id=Forma.contaF;
		}
	    
	    
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the contaF
	 */
	public static int getContaF() {
		return contaF;
	}

	/**
	 * @param contaF the contaF to set
	 */
	public static void setContaF(int contaF) {
		Forma.contaF = contaF;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Forma other = (Forma) obj;
		return id == other.id;
	}


	
    
    
    
    
}
