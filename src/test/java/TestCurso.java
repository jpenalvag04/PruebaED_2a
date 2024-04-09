/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import instituto.Curso;
import instituto.Persona;
import java.util.TreeSet;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jpena
 */
public class TestCurso {
    @Test
    public void testAniadirAlumno() {
        Curso curso = new Curso("Curso de Prueba");
        Persona alumno = new Persona(12345678, "Juan Perez", 'M', 1, 1, 2000);
        
        curso.aniadirAlumno(alumno);
        
        // Verificar que el alumno está presente en el toString del curso
        assertTrue(curso.toString().contains(alumno.toString()));
    }

    @Test
    public void testAñadirAlumnoNulo() {
        Curso curso = new Curso("Curso de Prueba");
        Persona alumno = null;
        
        try {
            curso.aniadirAlumno(alumno);
            fail("Debería haber lanzado NullPointerException");
        } catch (NullPointerException e) {
            assertNotNull(e);
        }
    }



 

  
}
