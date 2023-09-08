package Clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import Clases.Pedido;
import Clases.Combo;
import Clases.ProductoMenu;
import Clases.Ingrediente;

public class Restaurante {

	public void subirArchivoCombos() {
		try {
			  
            // Create a file object
            File f = new File("combos.txt");
  
            // Get the absolute path of file f
            String absolute = f.getAbsolutePath();
  
            FileReader fileReader = new FileReader(absolute);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            String linea;
            
            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
            }

            bufferedReader.close();
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
	}
	
	public void subirArchivoIngredientes() {
		try {
			  
            // Create a file object
            File f = new File("ingredientes.txt");
  
            // Get the absolute path of file f
            String absolute = f.getAbsolutePath();
  
            FileReader fileReader = new FileReader(absolute);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            String linea;
            
            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
            }

            bufferedReader.close();
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
	}
	
}
