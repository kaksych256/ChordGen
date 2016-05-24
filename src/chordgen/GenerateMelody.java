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
    final static int NUM=4;
    int progNum;
    int ChordNumber = 4;
    
    /* 
 Am
 Dm
 G
 C
 F
 Em 
 E
     */
    
    
    
    
    public void getMelody(MelodyArray melody){
    //MelodyArray melody = new MelodyArray();
        
        ArrayList<ArrayList> chordArray = new ArrayList<>();
        
        if (progNum == 0) 
                {
                    chordArray.add(nA.AmList);
                    chordArray.add(nA.DmList);
                    chordArray.add(nA.GList);
                    chordArray.add(nA.CList);
                }
        else if (progNum == 1)
                {
                    chordArray.add(nA.CList);
                    chordArray.add(nA.GList);
                    chordArray.add(nA.AmList);
                    chordArray.add(nA.FList);
                }
        else if (progNum == 2)
                {
                    chordArray.add(nA.AmList);
                    chordArray.add(nA.EmList);
                    chordArray.add(nA.FList);
                    chordArray.add(nA.GList);
                }
        else if (progNum == 3)
                {
                    chordArray.add(nA.AmList);
                    chordArray.add(nA.DmList);
                    chordArray.add(nA.EmList);
                    chordArray.add(nA.AmList);
                }
              
        
        
        int sum = 0;
        melody.noteList.clear();
        
        
        
        for (int genN = 0;genN<ChordNumber;genN++)
        {       
        sum = 0;
        int maxLength = 8;
        ArrayList<Note> curGen = chordArray.get(genN);
        ArrayList<Integer> dur = new ArrayList<>();
        
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
        Note temp = new Note();
        t=ran.nextInt(100)%NUM;
        temp.setPitch(curGen.get(t).getPitch());
        temp.setDuration(0.25*dur.get(i));
        melody.noteList.add(temp);
    }
    
        for (int i=0;i<dur.size();i++)
    {
        System.out.println(dur.get(i));
    }
    
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
