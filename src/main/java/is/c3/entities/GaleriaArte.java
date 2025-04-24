package is.c3.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.logging.Logger;

import is.c3.model.GestionStock;
import is.c3.model.Obra;

/**
 * Clase para gestionar las obras de una galería de arte
 */
public class GaleriaArte implements GestionStock<Obra> {
	private static Logger log = Logger.getLogger(GaleriaArte.class.getName());

	// Colección ordenada y de elementos no duplicados
	private SortedSet<Obra> obras;

	public GaleriaArte() {
		obras = new TreeSet<Obra>();
	}

	public SortedSet<Obra> getObras() {
		return obras;
	}
	
	@Override
	public Boolean find(Obra obra){
		return obras.contains(obra);
	}
	
	@Override
	public List<Obra> findAll(){
		return new ArrayList<>(obras);
	}

	@Override
	public void save(Obra obra) {
		obras.add(obra);
		log.fine("Obra añadida");	
	}

	@Override
	public void delete(Obra obra) {
		log.fine("Se va a eliminar la obra de: " + obra.getAutor());	
		obras.remove(obra);
	}
	
	@Override
	public void deleteAll() {
		log.fine("Se van a eliminar todas las pinturas");	
		obras.clear();

	}
	
	@Override
	public void saveAll(Obra[] t) {
		// TODO Auto-generated method stub

	}

}
