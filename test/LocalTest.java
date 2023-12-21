/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author user
 */
public class LocalTest {
    
    public LocalTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of contarFrecuenciaProductos method, of class Local.
     */
    @Test
    public void testContarFrecuenciaProductos() {
        System.out.println("contarFrecuenciaProductos");
        Local instance = new Local();
        String expResult = "";
        String result = instance.contarFrecuenciaProductos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GrabarEnArchivo2 method, of class Local.
     */
    @Test
    public void testGrabarEnArchivo2() {
        System.out.println("GrabarEnArchivo2");
        Alquilar e = null;
        Local instance = new Local();
        instance.GrabarEnArchivo2(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Insertarentabla2 method, of class Local.
     */
    @Test
    public void testInsertarentabla2() {
        System.out.println("Insertarentabla2");
        Alquilar UnEvento = null;
        Local instance = new Local();
        instance.Insertarentabla2(UnEvento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Insertarentabla method, of class Local.
     */
    @Test
    public void testInsertarentabla() {
        System.out.println("Insertarentabla");
        ClienteA UnClient = null;
        Local instance = new Local();
        instance.Insertarentabla(UnClient);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CambiarTamañoColumnas method, of class Local.
     */
    @Test
   /* public void testCambiarTamañoColumnas() {
        System.out.println("CambiarTama\u00f1oColumnas");
        Local instance = new Local();
        instance.CambiarTamañoColumnas();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    /**
     * Test of ExtraerDeArchivo method, of class Local.
     */
   // @Test
    public void testExtraerDeArchivo() {
        System.out.println("ExtraerDeArchivo");
        Local instance = new Local();
        instance.ExtraerDeArchivo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GrabarEnArchivo method, of class Local.
     */
    @Test
    public void testGrabarEnArchivo() {
        System.out.println("GrabarEnArchivo");
        ClienteA e = null;
        Local instance = new Local();
        instance.GrabarEnArchivo(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of LimpiarEntradas method, of class Local.
     */
    @Test
    public void testLimpiarEntradas() {
        System.out.println("LimpiarEntradas");
        Local instance = new Local();
        instance.LimpiarEntradas();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Local.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Local.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
