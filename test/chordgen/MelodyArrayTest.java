/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chordgen;


import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import jm.JMC;
import jm.music.data.*;
import jm.util.*;

/**
 *
 * @author Алекс
 */
public class MelodyArrayTest implements JMC {
    
    public MelodyArrayTest() {
    }
    
        private MelodyArray melAr;

    @BeforeClass
    public static void oneTimeSetUp() {
        // one-time initialization code   
    	System.out.println("@BeforeClass - oneTimeSetUp");
    }

    @AfterClass
    public static void oneTimeTearDown() {
        // one-time cleanup code
    	System.out.println("@AfterClass - oneTimeTearDown");
    }

    @Before
    public void setUp() {
        melAr = new MelodyArray();
        System.out.println("@Before - setUp");
    }

    @After
    public void tearDown() {
        melAr.noteList.clear();
        System.out.println("@After - tearDown");
    }

    @Test
    public void testEmptyCollection() {
        assertTrue(melAr.noteList.isEmpty());
        System.out.println("@Test - testEmptyCollection");
    }

    @Test
    public void testOneItemCollection() {
        Note CO4 = new Note(C4, SEMI_QUAVER, F);
        melAr.noteList.add(CO4);
        assertEquals(1, melAr.noteList.size());
        System.out.println("@Test - testOneItemCollection");
    }
    
}
