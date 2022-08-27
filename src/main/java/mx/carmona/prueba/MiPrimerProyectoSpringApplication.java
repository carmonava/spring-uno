package mx.carmona.prueba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MiPrimerProyectoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiPrimerProyectoSpringApplication.class, args);
		
		System.out.println("Hola mundo Dianis 1");
		System.out.println("Hola mundo Dianis 2");
		System.out.println("Hola mundo Dianis 3");
		
		mas();
		
		System.out.println("Hola mundo Dianis 7");
		System.out.println("Hola mundo Dianis 8");
		
	}
	
	
	private static void mas() {
		System.out.println("Hola mundo Dianis 4");
		System.out.println("Hola mundo Dianis 5");
		System.out.println("Hola mundo Dianis 6");
	}
	
	//Para correr un proyecto de Spring.
	//Abrimso menú Window -> Show View -> Boot Dashboard
	//De forma opcional ponerla al lado de la pestaña Project Explorer.
	//Dentro del icono verde "local"
	//Darle clic derecho al proyecto que queremos correr.
	//Damos Re debug
	
	//OJO!!!!!
	//Si se pone un punto de ruptura y das Re-debug, cambias de perspectiva a Debugg (Icono del bichito del bichito)
	
	//F6 Debug general
	//F5 entras a los métodos.
	//F7 sales del método.
	//F8 saltas de n punto de ruptura a otro.
	//Boton cuadrado rojo es para detener el proyecto.
	
	//OJOOO!!
	// Regresar a la perspectiva de Java EE es el icono de arbolito.
	
}
