/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sanbr
 */
public class TArbolBBTest {
    
    public TArbolBBTest() {
    }
    
    @Test
    public void testObtenerAltura_1() {
        TArbolBB instance = new TArbolBB();
        int expResult = -1;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testObtenerAltura0() {
        TArbolBB instance = new TArbolBB();
        instance.insertar(new TElementoAB(1, 1));
        int expResult = 0;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testObtenerAltura1() {
        TArbolBB instance = new TArbolBB();
        instance.insertar(new TElementoAB(1, 1));
        instance.insertar(new TElementoAB(2, 2));
        int expResult = 1;
        int result = instance.obtenerAltura();
        instance.insertar(1);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testObtenerAltura4() {
        TArbolBB instance = new TArbolBB();
        int expResult = -1;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testObtenerAltura5() {
        TArbolBB instance = new TArbolBB();
        int expResult = -1;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testObtenerAltura6() {
        TArbolBB instance = new TArbolBB();
        int expResult = -1;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testObtenerAltura7() {
        TArbolBB instance = new TArbolBB();
        int expResult = -1;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testObtenerAltura8() {
        TArbolBB instance = new TArbolBB();
        int expResult = -1;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testObtenerAltura9() {
        TArbolBB instance = new TArbolBB();
        int expResult = -1;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
    }
}
