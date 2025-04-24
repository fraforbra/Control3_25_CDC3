package is.c3.model;

/**
 * Interfaz de operaciones típicas para gestionar obras de arte
 */
public interface Obra {

	String getNombre();

	void setNombre(String nombre);

	String getAutor();

	void setAutor(String autor);

	int getAnio();

	void setAnio(int anio);

}
