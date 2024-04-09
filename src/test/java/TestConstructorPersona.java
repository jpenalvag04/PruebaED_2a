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
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author Javier Peñalva Gonzalez 
 */
public class TestConstructorPersona {
    
            @Test
    public void testConstructor() {
        Persona persona = new Persona(12345678, "Juan Perez", 'M', 1, 1, 2000);
        
        // Verificar que los valores se asignan correctamente en el constructor
        assertEquals("Juan Perez", persona.getNombre());
        assertEquals('M', persona.getGenero());
        assertEquals(1, persona.getNacimiento().getDayOfMonth());
        assertEquals(1, persona.getNacimiento().getMonthValue());
        assertEquals(2000, persona.getNacimiento().getYear());
    }
}
