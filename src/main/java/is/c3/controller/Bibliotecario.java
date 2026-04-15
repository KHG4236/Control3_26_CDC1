package is.c3.controller;

import is.c3.model.entities.Biblioteca;
import is.c3.model.entities.LibroFisico;


public class Bibliotecario {
	public Bibliotecario(Biblioteca biblio) {
		super();
		this.biblio = biblio;
	}

	private Biblioteca biblio;
	
	public static void main(String[] args) {
		
		// Crear una nueva instancia de la galeria
		Biblioteca biblio = new Biblioteca();
		Bibliotecario responsable=new Bibliotecario(biblio);
		responsable.altaLibro();
		responsable.printData();	
		
	}
	private void altaLibro() {
		// Crear algunos libros
		LibroFisico f1 = new LibroFisico("Vera, una historia de amor", "Juan del Val", 2025, "P2-E433");
		LibroFisico f2 = new LibroFisico("Victoria", "Paloma Sánchez", 2024, "P2-E430");
		LibroFisico f3 = new LibroFisico("Las hijas de la criada", "Sonsoles Ónega", 2023, "P1-E127");
		
		// Añadir pinturas a la galeria
		biblio.save(f1);
		biblio.save(f2);
		biblio.save(f3);

		
	}
    private void printData() {
    	System.out.println("Libros en la biblioteca de KHG4236");
		// Mostrar todos los libros
		System.out.println(biblio.findAll());
    	
    }
}
