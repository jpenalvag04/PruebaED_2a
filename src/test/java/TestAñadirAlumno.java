/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import instituto.Curso;
import instituto.Persona;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 *
 * @author jpena
 */
public class TestAñadirAlumno {
    
      @Test
    public void testAniadirAlumno() {
        Curso curso = new Curso("Curso de Prueba");
        Persona alumno = new Persona(12345678, "Juan Perez", 'M', 1, 1, 2000);
        
        curso.aniadirAlumno(alumno);
        
        // Verificar que el alumno está presente en el toString del curso
        assertTrue(curso.toString().contains(alumno.toString()));
    }
}
