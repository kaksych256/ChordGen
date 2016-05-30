/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chordgen;

import java.util.ArrayList;
import jm.JMC;
import jm.music.data.Note;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gorgos
 */
public class GenerateMelodyTest  implements JMC {
    
    public GenerateMelodyTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
     @Test
    public void testGetMelodyIsEmpty() {
        System.out.println("getMelodyIsEmpty");
        
        GenerateMelody gm = new GenerateMelody();
        MelodyArray testMelody = new MelodyArray();
        gm.getMelody(testMelody);
        assertNotNull(testMelody);
        
    }
    
}
