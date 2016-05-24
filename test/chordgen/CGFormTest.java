/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chordgen;

import java.io.IOException;
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
public class CGFormTest {
    
    public CGFormTest() {
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

    /**
     * Test of main method, of class CGForm.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CGForm.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        
        

    }
    
     @Test(expected = IOException.class) 
     public void empty() throws IOException { 
     
     RFileWriter filWrit = null;
     filWrit.write("chinese");
     }
     
     @Test
     public void TextField()  { 
        String[] args = null;
        CGForm.main(args);
        CGSingleton instance = null;
    //    Score expResult = null;
      //  Score result = instance.getScore();
       // assertEquals(expResult, result);
         
         
     }
     
}
