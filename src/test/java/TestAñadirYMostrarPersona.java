/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import instituto.Persona;
import java.time.LocalDate;
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
public class TestAñadirYMostrarPersona {
    
   @Test
    public void testAñadirYMostrarPersona() {
        Persona persona = new Persona();
        
        // Añadir valores a la persona
        persona.setNombre("Juan Perez");
        persona.setGenero('M');
        persona.setNacimiento(LocalDate.of(2000, 1, 1));
        
        // Verificar que los valores se han asignado correctamente
        assertEquals("Juan Perez", persona.getNombre());
        assertEquals('M', persona.getGenero());
        assertEquals(2000, persona.getNacimiento().getYear());
        
        // Verificar que el método toString muestra los valores correctamente
        assertEquals("0- Juan Perez     21", persona.toString());
    }
}
