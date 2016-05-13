/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chordgen;

/**
 *
 * @author Алекс
 */
import java.util.ArrayList;
import jm.JMC;
import jm.music.data.*;
import jm.util.*;

public class NoteArray implements JMC {
    public static ArrayList<Note> noteList = new ArrayList<>();
    
    
    public NoteArray(){
        Note C = new Note(C4, SEMI_QUAVER, F);
        noteList.add(C);
        Note D = new Note(D4, SEMI_QUAVER, F);
        noteList.add(D);
        Note E = new Note(E4, SEMI_QUAVER, F);
        noteList.add(E);
        Note F1 = new Note(F4, SEMI_QUAVER, F);
        noteList.add(F1);
        Note G = new Note(G4, SEMI_QUAVER, F);
        noteList.add(G);
        Note A = new Note(A4, SEMI_QUAVER, F);
        noteList.add(A);
        Note B = new Note(B4, SEMI_QUAVER, F);
        noteList.add(B);
        Rest rest = new Rest(0.25);
        noteList.add(rest);
    }
    
    
    
}
