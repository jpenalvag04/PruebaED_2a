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
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

/**
 *
 * @author Javier Peñalva Gonzalez 
 */
public class TestAñadirAlumnoNulo {
    
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
