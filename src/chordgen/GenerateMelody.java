/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chordgen;


import java.util.ArrayList;
import java.util.Random;
import jm.music.data.Note;

/**
 *
 * @author Алекс
 */
public class GenerateMelody {
    
    public NoteArray nA = new NoteArray(); 
    Random ran = new Random();
    int t=0;
    final static int NUM=8;
    
    public void getMelody(MelodyArray melody){
        
    }
    
    public MelodyArray state1;
   /* lots of memory consumptive private data that is not necessary to define the 
    * state and should thus not be saved. Hence the small memento object. */

   public void setMelody(MelodyArray state) { 
       System.out.println("Setting new melody");
       this.state1 = state; 
   }

   public Memento saveToMemento() { 
       System.out.println("Saving to Memento.");
       MelodyArray st = new MelodyArray();
       st = state1;
       return new Memento(st); 
   }
   public void restoreFromMemento(Memento m) {
       state1 = m.getSavedState(); 
       System.out.println("Restoring from Memento previous melody.");
   }
    
}
