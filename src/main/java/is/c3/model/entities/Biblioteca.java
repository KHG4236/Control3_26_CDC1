package is.c3.model.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.logging.Logger;

import is.c3.model.GestionProductos;
import is.c3.model.Libro;

/**
 * Clase para gestionar los libros de una biblioteca
 */
public class Biblioteca implements GestionProductos<Libro> {
	private static Logger log = Logger.getLogger(Biblioteca.class.getName());

	// Colección ordenada y de elementos no duplicados
	private List<Libro> libros;

	public Biblioteca() {
		libros = new ArrayList<Libro>();
	}

	public List<Libro> getLibros() {
		return libros;
	}
	
	@Override
	public Boolean find(Libro libro){
		return libros.contains(libro);
	}
	
	@Override
	public List<Libro> findAll(){
		return new ArrayList<>(libros);
	}

	@Override
	public void save(Libro libro) {
		log.fine("libro añadido");
	}

	@Override
	public void delete(Libro obra) {
		log.fine("Se va a eliminar un libro de: " + obra.getAutor());	
		libros.remove(obra);
	}
	
	@Override
	public void deleteAll() {
		log.fine("Se van a eliminar todos los libros");	
		libros.clear();

	}
	
	@Override
	public void saveAll(Libro[] t) {
		// TODO Auto-generated method stub

	}

}
