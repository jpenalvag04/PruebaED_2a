/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instituto;

import java.util.TreeSet;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.fail;
import org.junit.jupiter.api.Test;

/**
 *
 * @author ProfDiurno
 */
public class Curso {

    private String nombre;
    private TreeSet<Persona> listaAlumnos;

    protected String getNombre() {
        return nombre;
    }

    public Curso(String nombre) {
        this.nombre = nombre;
        listaAlumnos = new TreeSet<>();
    }

    @Override
    public String toString() {
        String s = "--------------------" + nombre + "-----------------\n";
        s += "NumExp\tNIF\t\tNombre\t\tApellidos\n";
        s += "-------------------------------------------------\n";
        for (Persona listaAlumno : listaAlumnos) {
            s += listaAlumno + "\n";
        }
        return s;
    }

    public void aniadirAlumno(Persona p) {
        listaAlumnos.add(p);
    }
    
        @Test
    public void testañadirAlumno() {
        Curso curso = new Curso("Curso de Prueba");
        Persona alumno1 = new Persona(12345678, "Juan Perez", 'M', 1, 1, 1990);
        Persona alumno2 = new Persona(87654321, "Maria Gomez", 'F', 1, 1, 1995);
        
        curso.aniadirAlumno(alumno1);
        curso.aniadirAlumno(alumno2);
        
        TreeSet<Persona> listaAlumnos = curso.getListaAlumnos();
        
        assertTrue(listaAlumnos.contains(alumno1));
        assertTrue(listaAlumnos.contains(alumno2));
        assertEquals(2, listaAlumnos.size());
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

    private TreeSet<Persona> getListaAlumnos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
