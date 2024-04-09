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
public class TestCalculoEdad {
            @Test
    public void testCalculoEdad() {
        Persona persona = new Persona(12345678, "Juan Perez", 'M', 1, 1, 2000);
        
        // Verifica que el cálculo de edad sea correcto
        assertEquals(24, persona.getEdad());
    }
}