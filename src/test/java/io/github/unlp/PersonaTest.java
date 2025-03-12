package io.github.unlp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class PersonaTest {
	
	io.github.unlp.Persona james, guido;
	
	@BeforeEach
	void setUp() throws Exception {
		james = new io.github.unlp.Persona();
		guido = new io.github.unlp.Persona();
		james.setApellido("Gosling");
		james.setNombre("James");
		guido.setApellido("van Rossum");
		guido.setNombre("Guido");
	}
	
    @Test
    public void testNombreCompleto() {
        assertEquals("Gosling, James", james.getNombreCompleto());
        assertEquals("van Rossum, Guido", guido.getNombreCompleto());
    }
}
