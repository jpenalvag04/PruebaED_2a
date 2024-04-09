/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import instituto.Persona;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 *
 * @author Javier Peñalva Gonzalez 
 */
public class TestIgualdad {
      @Test
    public void testIgualdad() {
        Persona persona1 = new Persona(12345678, "Juan Perez", 'M', 1, 1, 2000);
        Persona persona2 = new Persona(12345678, "Ana Lopez", 'F', 1, 1, 2000);
        Persona persona3 = new Persona(87654321, "Maria Garcia", 'F', 1, 1, 2000);
        
        // Verifica que dos personas con el mismo número de NIF sean iguales
        assertTrue(persona1.equals(persona2));
        assertFalse(persona1.equals(persona3));
    }
}
