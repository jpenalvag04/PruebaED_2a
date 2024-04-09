/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit3TestClass.java to edit this template
 */

import instituto.Nif;
import instituto.Persona;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
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
        @Test
    public void testCalculoEdad() {
        Persona persona = new Persona(12345678, "Juan Perez", 'M', 1, 1, 2000);
        
        // Verifica que el cálculo de edad sea correcto
        assertEquals(24, persona.getEdad());
    }
    
    @Test
    public void testIgualdad() {
        Persona persona1 = new Persona(12345678, "Juan Perez", 'M', 1, 1, 2000);
        Persona persona2 = new Persona(12345678, "Ana Lopez", 'F', 1, 1, 2000);
        Persona persona3 = new Persona(87654321, "Maria Garcia", 'F', 1, 1, 2000);
        
        // Verifica que dos personas con el mismo número de NIF sean iguales
        assertTrue(persona1.equals(persona2));
        assertFalse(persona1.equals(persona3));
    }
    
    @Test
    public void testDesgloseNombre() {
        Persona persona1 = new Persona(12345678, "Juan Perez", 'M', 1, 1, 2000);
        Persona persona2 = new Persona(87654321, "Maria", 'F', 1, 1, 2000);
        
        // Verifica el desglose de nombres
        assertEquals("Juan Perez", persona1.toString());
        assertEquals("Maria", persona2.toString());
    }
    
    @Test
    public void testGeneroValido() {
        Persona persona1 = new Persona(12345678, "Juan Perez", 'M', 1, 1, 2000);
        Persona persona2 = new Persona(87654321, "Maria", 'F', 1, 1, 2000);
        
        // Verifica que solo se acepten valores válidos para el género
        assertEquals('M', persona1.getGenero());
        assertEquals('F', persona2.getGenero());
    }
}
