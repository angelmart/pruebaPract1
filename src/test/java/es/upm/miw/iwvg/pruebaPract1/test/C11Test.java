package es.upm.miw.iwvg.pruebaPract1.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import pruebaPract1.C11;

public class C11Test {
	
	private C11 myClass;

    @Before
    public void before() {
        myClass = new C11();
        
    }
    
    @Test
    public void testC11() {
    }
    
    @Test
    public void testM1() {
        assertEquals("C21.m1()", myClass.m1());
    }
    
    @Test
    public void testM2() {
        assertEquals("C21.m2()", myClass.m2());
    }

}


