package principal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import entidades.Persona;

public class PrincipalBien {
	public static void main(String[] args) {

		System.out.println("Guardando datos en fichchar.txt");

		File fOut = new File("Finchar.txt");
		FileWriter fw = null;
		BufferedWriter bw = null;
		String data;

		try {
			fw = new FileWriter(fOut);
			bw = new BufferedWriter(fw);
			// para persona añadiendola a mano
			Persona p = new Persona("Rafael", 15, "erwqerqerq");
			bw.write(p.data() + "\n");
			bw.close();

			/**
			 * importando desde la clase datos for (int i = 0; i< Datos.(loquesea); i++){
			 * loquesea l = new loquesea(); l = Datos.loquesea [i]; bw.write (l.data() +
			 * "\n") ;} bw.close();
			 */

		} catch (IOException e) {
			{
				e.printStackTrace();
			}

		} finally {

		}

		System.out.println("------------------------");

		// importar una collean de objeta de esa clase desde un fichero
		System.out.println("Paso a leer los datos guardados en esos ficheros");
		File fln = new File("Finchar.txt");
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(fln);
			br = new BufferedReader(fr);
			String c;

			for (int i = 0; i < 1; i++) {
				c = (String) br.readLine();
				System.out.println(c);
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// br.close
		}

	}
}