package is.c3.entities;

import java.util.logging.Logger;

import is.c3.model.Obra;

/**
 * Datos de un tipo particular de Obra, una pintura 
 */
public class Pintura implements Obra, Comparable<Pintura> {
	private static Logger log = Logger.getLogger(Pintura.class.getName());
	private String nombre;
	private String autor;
	int anio;

	// Constructor
	public Pintura(String nombre, String autor, int anio) {
		this.nombre = nombre;
		this.autor = autor;
		this.anio = anio;
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;	
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
	
	@Override
	public String toString() {
		String sms = "\nDatos de la pintura: \nNombre: " + nombre + "\nAutor: " + autor + "\nAño de realización: "
				+ anio + "\n***************************************\n";
		return sms;
	}

	// La ordenación natural se llevará a cabo por el año de creación, de un modo ascendente
	@Override
	public int compareTo(Pintura p1) {
		return (p1.anio - this.anio);
	}
}
