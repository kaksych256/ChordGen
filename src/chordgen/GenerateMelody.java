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
    //MelodyArray melody = new MelodyArray();
        melody.noteList.clear();
        ArrayList<Integer> dur = new ArrayList<>();
        int maxLength = 32;
        
        int sum = 0;
        
        
        do {
            t=ran.nextInt(100)%maxLength + 1;
            dur.add(t);
            sum += t;
        } while (sum<=maxLength);
        
        if (sum>maxLength){
            int k = sum - maxLength;
            int last = dur.size() - 1;
            int dif = dur.get(last)-k;
            if (dif>0)
            { dur.set(last, dur.get(last)-k);}
            else {dur.remove(last);}
        }
        
          for (int i=0;i<dur.size();i++)
    {
        System.out.println(dur.get(i));
    }
        
    for (int i=0;i<dur.size();i++)
    {
        Note temp = new Note();
        t=ran.nextInt(100)%NUM;
        temp.setPitch(nA.noteList.get(t).getPitch());
        temp.setDuration(0.25*dur.get(i));
        melody.noteList.add(temp);
    }
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
