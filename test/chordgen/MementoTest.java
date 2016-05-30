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

    }
    
    private Memento testMemento;
    
    @BeforeClass
    public static void setUpClass() {

        
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        MelodyArray melAr1 = new MelodyArray();
        Note D4F = new Note(D4, SEMI_QUAVER, F);
        melAr1.noteList.add(D4F);
        testMemento.state = melAr1;
        this.testMemento = new Memento(melAr1);
        
        
        System.out.println("equal");
        MelodyArray melAr2 = new MelodyArray();
        melAr2.noteList.add(D4F);
        MelodyArray testM = new MelodyArray();
        testM = testMemento.getSavedState();
        assertEquals(testM, melAr2);
    }
    
}
