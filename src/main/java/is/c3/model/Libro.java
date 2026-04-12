package is.c3.model;

/**
 * Interfaz de operaciones típicas para un libro
 */
public interface Libro {

	String getAutor();

	void setAutor(String autor);

	int getAnio();

	void setAnio(int anio);

	String getTitulo();

	void setTitulo(String titulo);

}
