package principal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import entidades.Persona;

public class Principal {

	public static void main(String[] args) {

		// creador de un fichero .txt en forma de bytes
		Persona np = new Persona();
		np = Persona.nuevaPersona();
		try {
			// TODO Auto-generated method stub
			File f = new File("persona.txt");
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(new Persona("Rafael", 15, "717379129m"));
			oos.writeObject(np);
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// lectura de fichero
		ObjectInputStream ois = null;
		try {
			File f = new File("persona.txt");
			FileInputStream fis = new FileInputStream(f);
			ois = new ObjectInputStream(fis);
			while (true) {
				Persona p = (Persona) ois.readObject();
				System.out.println("Nombre : " + p.getNombre());
				System.out.println("Edad :" + p.getEdad());
				System.out.println("DNI : " + p.getDni());
				System.out.println("-----------------------");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("\n ************** Fin ***********");

		} finally {
			try {
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
