package Clases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.File;

import Clases.Restaurante;

public class Aplicacion {
	
	/**
	 * Este es el método principal de la aplicación, con el que inicia la ejecución
	 * de la aplicación.
	 * (Se tomo del Taller 1)
	 */
	
	public static void main(String args[]){
		Aplicacion consola = new Aplicacion();
		consola.ejecutarOpcion();
	}
	
	/**
	 * Este método sirve para imprimir un mensaje en la consola pidiéndole
	 * información al usuario y luego leer lo que escriba el usuario.
	 * 
	 * @param mensaje El mensaje que se le mostrará al usuario
	 * @return La cadena de caracteres que el usuario escriba como respuesta.
	 * (Se tomo del Taller 1)
	 */
	public String input(String mensaje)
	{
		try
		{
			System.out.print(mensaje + ": ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		}
		catch (IOException e)
		{
			System.out.println("Error leyendo de la consola");
			e.printStackTrace();
		}
		return null;
	}
	
	public void subirArchivoMenu() {
		try {
			  
            // Create a file object
            File f = new File("menu.txt");
  
            // Get the absolute path of file f
            String absolute = f.getAbsolutePath();
  
            FileReader fileReader = new FileReader(absolute);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            String linea;
            
            while ((linea = bufferedReader.readLine()) != null) {
                String[] elementos = linea.split(";");
                if (elementos.length == 2) {
                    String nombre = elementos[0].trim();
                    String precio = elementos[1].trim();
                    System.out.println("Producto: " + nombre);
                    System.out.println("Precio: $" + precio);
                    System.out.println("--------------");
                }
            }
            bufferedReader.close();  
		}
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
	}
		
	
	public void mostrarMenu(){
		System.out.println("\nBienvenido a la mejor hamburguesería de la ciudad.\n");
		System.out.println("Opciones de la aplicación\n");
		System.out.println("1. Mostrar el menú.");
		System.out.println("2. Iniciar un nuevo pedido.");
		System.out.println("3. Agregar un nuevo elemento a un pedido.");
		System.out.println("4. Cerrar un pedido y guardar su factura.");
		System.out.println("5. Consultar la información de un pedido dado su id.");
		System.out.println("6. Salir de la aplicación.\n");
	}
	
	public void ejecutarOpcion(){
		System.out.println("La mejor hamburguesería de la ciudad.\n");

		boolean continuar = true;
		while (continuar)
		{
			try
			{
				mostrarMenu();
				int opcion_seleccionada = Integer.parseInt(input("Por favor seleccione una opción"));
				if (opcion_seleccionada == 1)
					subirArchivoMenu();
				else if (opcion_seleccionada == 2)
					;
				else if (opcion_seleccionada == 3)
					;
				else if (opcion_seleccionada == 4)
					;
				else if (opcion_seleccionada == 5)
					;
				else if (opcion_seleccionada == 6)
				{
					System.out.println("Saliendo de la aplicación ...");
					continuar = false;
				}
				else
				{
					System.out.println("Por favor seleccione una opción válida.");
				}
			}
				catch (NumberFormatException e){
			}
		}
	}		
}
