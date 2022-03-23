package ahorcado;

import java.util.Arrays;

public class ahorcado {
	
	//Propiedades
	private static String[] diccionario= {"pelota","caramelo","payaso","centinela"};
	
	private String palabraAAdivinar;
	private char [] palabraIntentada;  //Se puede hacer en StringBuilder
	private char[] letrasProbadas;
	private int fallos;
	
	public ahorcado() {
		//Elegir una palabra aleatoria del diccionario
		int posicion = (int) (Math.random()* ahorcado.diccionario.length);
		this.palabraAAdivinar= ahorcado.diccionario[posicion];
	
		//Reservo tantos caracteres para la palabra como longitud de palabraAAdivinar
		this.palabraIntentada= new char [this.palabraAAdivinar.length()];
		
		//Rellenar de guiones la palabraIntentada, tantos como longitud tenga
		for (int i=0; i<this.palabraAAdivinar.length();i++) {
			this.palabraIntentada[i]= '-';
		}
		
		//Iniciar el tamaño del array de letras probadas 
		this.letrasProbadas =new char[27];
		this.fallos= 0;
	}

	
	/**
	 * @return the diccionario
	 */
	public static String[] getDiccionario() {
		return diccionario;
	}



	/**
	 * @return the palabraAAdivinar
	 */
	public String getPalabraAAdivinar() {
		return palabraAAdivinar;
	}



	/**
	 * @return the palabraIntentada
	 */
	public char[] getPalabraIntentada() {
		return palabraIntentada;
	}



	/**
	 * @return the letrasProbadas
	 */
	public char[] getLetrasProbadas() {
		return letrasProbadas;
	}



	/**
	 * @return the fallos
	 */
	public int getFallos() {
		return fallos;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ahorcado [palabraAAdivinar=");
		builder.append(palabraAAdivinar);
		builder.append(", palabraIntentada=");
		builder.append(Arrays.toString(palabraIntentada));
		builder.append(", letrasProbadas=");
		builder.append(Arrays.toString(letrasProbadas));
		builder.append(", fallos=");
		builder.append(fallos);
		builder.append("]");
		return builder.toString();
	}
	
	/*
	 * La letra introducida la busca en la palabra adivinarÇ
	 * si la palabra encuentra nos muestra sus apariciones en la solución
	 * si no la encuentra suma un fallo
	 */
	
	public boolean intentar(char letra) {
		boolean encontrado = false;
		//Buscar la letra tantas veces como salga
		for (int i=0; i<this.palabraAAdivinar.length(); i++) {
			//Si coincide la letra en alguna posicion la pongo en palabraIntentar
			if (this.palabraAAdivinar.charAt(i)== letra) {
				this.palabraIntentada[i]= letra;
				encontrado = true;
			}
		}
		if (encontrado = false)
			this.fallos++;
		 
		return encontrado;
	}
	
	
	/* *
	 * Comprueba que las palabras son iguales
	 */
	
	public boolean solucion() {
		boolean solucionado = true;
		for (int i=0; i<this.palabraAAdivinar.length(); i++) {
			if (this.palabraAAdivinar.charAt(i) != this.palabraIntentada[i]) {
				solucionado=false;
			}
		}
		return solucionado;
	}
}
