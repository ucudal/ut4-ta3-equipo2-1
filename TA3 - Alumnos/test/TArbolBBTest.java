/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Franco Barlocco
 */
public class TArbolBBTest {
    
    public TArbolBBTest() {
    }

    /**
     * Test of obtenerTamanio method, of class TArbolBB.
     */
    @Test
    public void testObtenerTamanioCero() {
        System.out.println("obtenerTamanio");
        TArbolBB instance = new TArbolBB();
        int expResult = 0;
        int result = instance.obtenerTamanio();
        assertEquals(expResult, result);
    }
    @Test
    public void testObtenerTamanioUno() {
        System.out.println("obtenerTamanio");
        TArbolBB instance = new TArbolBB();
        instance.insertar(new TElementoAB(0,2));
        int expResult = 1;
        int result = instance.obtenerTamanio();
        assertEquals(expResult, result);
    }
    @Test
    public void testObtenerTamanioDer() {
        System.out.println("obtenerTamanio");
        TArbolBB instance = new TArbolBB();
        instance.insertar(new TElementoAB(0,2));
        instance.insertar(new TElementoAB(1,22));
        instance.insertar(new TElementoAB(22,22));
        int expResult = 3;
        int result = instance.obtenerTamanio();
        assertEquals(expResult, result);
    }
    @Test
    public void testObtenerTamanioIzq() {
        System.out.println("obtenerTamanio");
        TArbolBB instance = new TArbolBB();
        instance.insertar(new TElementoAB(10,10));
        instance.insertar(new TElementoAB(9,9));
        instance.insertar(new TElementoAB(8,8));
        int expResult = 3;
        int result = instance.obtenerTamanio();
        assertEquals(expResult, result);
    }
    @Test
    public void testObtenerTamanioDerIzq() {
        System.out.println("obtenerTamanio");
        TArbolBB instance = new TArbolBB();
        instance.insertar(new TElementoAB(10,10));
        instance.insertar(new TElementoAB(11,11));
        instance.insertar(new TElementoAB(9,9));
        int expResult = 3;
        int result = instance.obtenerTamanio();
        assertEquals(expResult, result);
    }
    @Test
    public void testObtenerTamanioDerIzqIzq() {
        System.out.println("obtenerTamanio");
        TArbolBB instance = new TArbolBB();
        instance.insertar(new TElementoAB(10,10));
        instance.insertar(new TElementoAB(11,11));
        instance.insertar(new TElementoAB(9,9));
        instance.insertar(new TElementoAB(3,3));
        int expResult = 4;
        int result = instance.obtenerTamanio();
        assertEquals(expResult, result);
    }
    @Test
    public void testObtenerTamanioDerIzqDer() {
        System.out.println("obtenerTamanio");
        TArbolBB instance = new TArbolBB();
        instance.insertar(new TElementoAB(10,10));
        instance.insertar(new TElementoAB(11,11));
        instance.insertar(new TElementoAB(9,9));
        instance.insertar(new TElementoAB(22,22));
        int expResult = 4;
        int result = instance.obtenerTamanio();
        assertEquals(expResult, result);
    }
}
