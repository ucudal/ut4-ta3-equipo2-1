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
    public void testObtenerTamanioVarios() {
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
    public void testCalcularAltura_1() {
        TArbolBB instance = new TArbolBB();
        int expResult = -1;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalcularAltura0() {
        TArbolBB instance = new TArbolBB();
        int expResult = -1;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalcularAltura1() {
        TArbolBB instance = new TArbolBB();
        instance.insertar(new TElementoAB(1, 1));
        int expResult = 0;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalcularAltura2() {
        TArbolBB instance = new TArbolBB();
        instance.insertar(new TElementoAB(1, 1));
        instance.insertar(new TElementoAB(2, 2));
        int expResult = 1;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalcularAltura3() {
        TArbolBB instance = new TArbolBB();
        instance.insertar(new TElementoAB(2, 2));
        instance.insertar(new TElementoAB(1, 1));
        int expResult = 1;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalcularAltura4() {
        TArbolBB instance = new TArbolBB();
        instance.insertar(new TElementoAB(1, 1));
        instance.insertar(new TElementoAB(2, 2));
        instance.insertar(new TElementoAB(3, 3));
        int expResult = 2;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalcularAltura5() {
        TArbolBB instance = new TArbolBB();
        instance.insertar(new TElementoAB(1, 1));
        instance.insertar(new TElementoAB(2, 2));
        instance.insertar(new TElementoAB(3, 3));
        int expResult = 2;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalcularAltura6() {
        TArbolBB instance = new TArbolBB();
        instance.insertar(new TElementoAB(3, 3));
        instance.insertar(new TElementoAB(2, 2));
        instance.insertar(new TElementoAB(1, 1));
        int expResult = 2;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalcularAltura7() {
        TArbolBB instance = new TArbolBB();
        instance.insertar(new TElementoAB(2, 2));
        instance.insertar(new TElementoAB(1, 1));
        instance.insertar(new TElementoAB(3, 3));
        int expResult = 1;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalcularAltura8() {
        TArbolBB instance = new TArbolBB();
        instance.insertar(new TElementoAB(3, 3));
        instance.insertar(new TElementoAB(1, 1));
        instance.insertar(new TElementoAB(2, 2));
        int expResult = 2;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalcularAltura9() {
        TArbolBB instance = new TArbolBB();
        instance.insertar(new TElementoAB(2, 2));
        instance.insertar(new TElementoAB(4, 4));
        instance.insertar(new TElementoAB(3, 3));
        int expResult = 2;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
    }
}
