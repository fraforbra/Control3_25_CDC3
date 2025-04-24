package is.c3.controller;

import is.c3.entities.GaleriaArte;
import is.c3.entities.Pintura;


public class Comisario {
	public Comisario(GaleriaArte galeria) {
		super();
		this.galeria = galeria;
	}

	private GaleriaArte galeria;
	
	public static void main(String[] args) {
		
		// Crear una nueva instancia de la galeria
		GaleriaArte galeria = new GaleriaArte();
		Comisario gestor=new Comisario(galeria);
		gestor.setInitialData();
		gestor.printData();	
		
	}
	private void setInitialData() {
		// Crear algunas Obra (Pintura)
				Pintura p1 = new Pintura("Noche estrellada", "Vicent Van Gogh", 1889);
				Pintura p2 = new Pintura("Las meninas", "Diego Velazquez", 1656);
				Pintura p3 = new Pintura("La persistencia de la memoria", "Salvador Dalí", 1931);

				// Añadir pinturas a la galeria
				galeria.save(p1);
				galeria.save(p2);
				galeria.save(p3);
		
	}
    private void printData() {
    	System.out.println("Pinturas en la galería:");
		// Mostrar todas las pinturas de la galería
		System.out.println(galeria.findAll());
    	
    }
}
