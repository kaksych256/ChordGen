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
        
        if (notePitch>0)
        {
        noteOctave = Integer.toString((notePitch/12)-1);
        if (notePitch%12==0)
        {noteName="C";}
        if (notePitch%12==2)
        {noteName="D";}
        if (notePitch%12==4)
        {noteName="E";}
        if (notePitch%12==5)
        {noteName="F";}
        if (notePitch%12==7)
        {noteName="G";}
        if (notePitch%12==9)
        {noteName="A";}
        if (notePitch%12==11)
        {noteName="B";}
        }
        
        else if (notePitch<0)
        {noteName = "x";}
        
        double durNote = note.getDuration();
        
        double stripNumber = durNote/0.25;
        
        for (int k = 0;k<stripNumber-1;k++)
        {
            strips += "-";
        }
        
    return noteName + noteOctave + strips + " ";
        //String noteP = Integer.toString(note.getPitch());
        //return noteP;
        
    }
}
