package is.c3.entities;


import is.c3.model.Obra;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class GaleriaTest {

	private GaleriaArte galeria;

	@BeforeEach
	public void setUp() {
		// Antes de cada test, creamos una nueva instancia de la galeria
		galeria = new GaleriaArte();
	}

	@Test
	public void testdelete() {
		Pintura p1 = new Pintura("La Gioconda", "Leonardo Da Vinci", 1503);
		Pintura p2 = new Pintura("El guernica", "Pablo Picasso", 1937);
		
		galeria.save(p1);
		galeria.save(p2);
		
		// Permitir eliminar una pintura en concreto
		galeria.delete(p1);

		assertFalse(galeria.find(p1), "Pintura añadida incorrectamente");
	}
	
	@Test
	public void testSave() {
		Pintura nueva = new Pintura("La Gioconda", "Leonardo Da Vinci", 1503);
		
		//Permitir almacenar nuevas pinturas
		galeria.save(nueva);

		assertTrue(galeria.find(nueva), "Pintura añadida incorrectamente");
	}
	
	@Test
	public void testDeleteAll() {
		
		// Permitir la eliminación de todas las pinturas
		galeria.deleteAll();

		assertEquals(0, galeria.getObras().size(), "Pinturas eliminadas incorrectamente");
	}
	
	@Test
	public void testSaveAll() {
		
		Pintura p1 = new Pintura("La Gioconda", "Leonardo Da Vinci", 1503);
		Pintura p2 = new Pintura("El guernica", "Pablo Picasso", 1937);
		
		// Almacenar pinturas de una en una, o en grupo
		galeria.save(p1);
		galeria.save(p2);
		
		//Verificar que se han añadido y en orden ASCENDENTE (por año de creación)
		List<Obra> lista = galeria.findAll();
		
		assertEquals(p1,lista.get(0), "Almacenadas incorrectamente");

	}

	

}
