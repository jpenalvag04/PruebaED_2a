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
public class TestDesgloseNombre {
    
       @Test
    public void testDesgloseNombre() {
        Persona persona1 = new Persona(12345678, "Juan Perez", 'M', 1, 1, 2000);
        Persona persona2 = new Persona(87654321, "Maria", 'F', 1, 1, 2000);
        
        // Verifica el desglose de nombres
        assertEquals("Juan Perez", persona1.toString());
        assertEquals("Maria", persona2.toString());
    }
}
