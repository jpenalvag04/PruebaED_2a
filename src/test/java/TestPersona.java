/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit3TestClass.java to edit this template
 */

import instituto.Nif;
import instituto.Persona;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author jpena
 */
public class TestPersona {
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
