package is.c3.model.entities;

import java.util.logging.Logger;

import is.c3.model.Libro;

/**
 * Datos de un tipo particular de Libro: una Novela 
 */
public class LibroFisico implements Libro, Comparable<LibroFisico> {
	private static Logger log = Logger.getLogger(LibroFisico.class.getName());
	private String autor;
	private String titulo;
	private int anio;
	private String ubicacion;

	// Constructor
	public LibroFisico(String titulo, String autor, int anio, String ubicacion) {
		this.titulo = titulo;
		this.autor = autor;
		this.anio = anio;
		this.ubicacion = ubicacion;
	}

	@Override
	public String getTitulo() {
		return titulo;
	}

	@Override
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String getAutor() {
		return autor;
	}

	@Override
	public void setAutor(String autor) {
		this.autor = autor;	
	}

	@Override
	public int getAnio() {
		return anio;
	}

	@Override
	public void setAnio(int anio) {
		this.anio = anio;	
	}
		
	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	@Override
	public String toString() {
		String sms = "\nDatos del libro físico: \nTitulo: " + titulo + "\nAutor: " + autor + "\nAño de escritura: "
				+ anio +  "\nUbicacion: " + ubicacion  +"\n***************************************\n";
		return sms;
	}

	// La ordenación natural se llevará a cabo por el año de creación, de un modo ascendente
	@Override
	public int compareTo(LibroFisico p1) {
		return (p1.anio - this.anio);
	}

}
