package is.c3.entities;


import is.c3.model.Libro;
import is.c3.model.entities.Biblioteca;
import is.c3.model.entities.LibroFisico;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class BibliotecaTest {

	private Biblioteca biblio;

	@BeforeEach
	public void setUp() {
		// Antes de cada test, creamos una nueva instancia de la biblioteca
		biblio = new Biblioteca();
	}

	@Test
	public void testdelete() {
		LibroFisico p1 = new LibroFisico("La muy catastrófica visita al zoo", "Joel Dicker", 2025, "P3-E345");
		LibroFisico p2 = new LibroFisico("El cuco de cristal", "Javier Castillo", 2023, "P3-E657");
		
		biblio.save(p1);
		biblio.save(p2);
		
		// Permitir eliminar un libro en concreto
		biblio.delete(p1);

		assertFalse(biblio.find(p1), "Libro añadido incorrectamente");
	}
	
	@Test
	public void testSave() {
		LibroFisico nuevo = new LibroFisico("El cuco de cristal", "Javier Castillo", 2023, "P3-E657");
		
		//Añadir un libro
		biblio.save(nuevo);

		assertTrue(biblio.find(nuevo), "Libro añadido incorrectamente");
	}
	
	@Test
	public void testDeleteAll() {
		
		LibroFisico p1 = new LibroFisico("La muy catastrófica visita al zoo", "Joel Dicker", 2025, "P3-E345");
		LibroFisico p2 = new LibroFisico("El cuco de cristal", "Javier Castillo", 2023, "P3-E657");
		
		biblio.save(p1);
		biblio.save(p2);
		
		// Eliminar los libros
		biblio.deleteAll();

		assertEquals(0, biblio.getLibros().size(), "Libros eliminados incorrectamente");
	}
	
	@Test
	public void testSaveAll() {
		
		LibroFisico p1 = new LibroFisico("La muy catastrófica visita al zoo", "Joel Dicker", 2025, "P3-E345");
		LibroFisico p2 = new LibroFisico("El cuco de cristal", "Javier Castillo", 2023, "P3-E657");
		
		//Almacenar libros
		biblio.save(p1);
		biblio.save(p2);
				
		assertEquals(2,biblio.getLibros().size(), "Almacenados incorrectamente");

	}

	

}
