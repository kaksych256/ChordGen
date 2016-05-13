/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chordgen;

import jm.JMC;
import jm.music.data.Note;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Алекс
 */
public class MementoTest implements JMC {
    
    public MementoTest() {
        this.testMemento = new Memento();
    }
    
    private Memento testMemento;
    
    @BeforeClass
    public static void setUpClass() {
        MelodyArray melAr1 = new MelodyArray();
        Note C4F = new Note(C4, SEMI_QUAVER, F);
        melAr1.noteList.add(C4F);
        testMemento.state = melAr1;
        
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("equal");
        MelodyArray melAr2 = new MelodyArray();
        Note D4F = new Note(D4, SEMI_QUAVER, F);
        melAr2.noteList.add(D4F);
        MelodyArray testM = new MelodyArray();
        testM = testMemento.getSavedState();
        assertEquals(testMemento.state, melAr2);
        fail("The test case is a prototype.");
    }
    
}
