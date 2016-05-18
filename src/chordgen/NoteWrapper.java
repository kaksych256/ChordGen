/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chordgen;

import jm.music.data.Note;

/**
 *
 * @author Алекс
 */
public class NoteWrapper extends Note {
    
        Note note;
    
    public NoteWrapper(Note note){
        this.note = note;
        
    }
    
    public NoteWrapper(){
        note = new Note();
    }
    
    @Override
    public String getNote(){
    
       int notePitch = note.getPitch();
        String noteOctave = "";
        String strips = "";
        String noteName=null;
    
       return noteName + noteOctave + strips + " ";
    }
}
