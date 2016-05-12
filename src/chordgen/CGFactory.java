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
import jm.music.data.Phrase;
import jm.music.data.Score;

/**
 *
 * @author Gorgos
 */
public interface CGFactory {
    public NoteArray getNoteArray();
    public GenerateMelody getGenerateMelody();
    public Phrase getPhrase();
    public Score getScore();
    
}