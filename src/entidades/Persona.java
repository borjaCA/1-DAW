package entidades;

import java.io.Serializable;
import java.util.Scanner;

public class Persona implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	private int edad;
	private String dni;

	public Persona(String nombre, int edad, String dni) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
	}

	public Persona() {
		
	}

	public String data() {
		String ret = "";
		ret = this.nombre + "|" + this.edad + "|" + this.dni;
		return ret;
	}

	public static Persona nuevaPersona() {

		Persona ret = null;
		Scanner in;
		in = new Scanner(System.in);
		String nombre = "";
		int edad = -1;
		String dni = "";
		boolean valido = false;
		do {
			in.next();
			if (nombre.length() > 0)
				;
			valido = true;
		} while (!valido);

		System.out.println("introduce la edad " + edad + "introduce tambien su dni " + dni);

		ret = new Persona(nombre, edad, dni);
		return ret;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

}
