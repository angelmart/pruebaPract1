package es.upm.miw.iwvg.pruebaPract1.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import pruebaPract1.C22;

public class C22Test {
	
	private C22 myClass;

    @Before
    public void before() {
        myClass = new C22();
        
    }
    
    @Test
    public void testC22() {
    }
    
    @Test
    public void testMA() {
        assertEquals("C22.mA()", myClass.mA());
    }

}
