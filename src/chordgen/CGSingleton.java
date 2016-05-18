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

public class CGSingleton implements CGFactory {
    private static CGSingleton object = null;
	
	public static CGSingleton getFactory() {
		
		if (object == null) {
			object = new CGSingleton();
		}
		return object;
		
	}
        
        private CGSingleton() {
        }
        
    @Override
    public NoteArray getNoteArray() {
        return (NoteArray) new NoteArray();
    }

    @Override
    public GenerateMelody getGenerateMelody() {
        return (GenerateMelody) new GenerateMelody();
    }

    @Override
    public Phrase getPhrase() {
        return (Phrase) new Phrase();
    }

    @Override
    public Score getScore() {
        return (Score) new Score();
    }
        
}
