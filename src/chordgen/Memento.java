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
public class Memento {
        public MelodyArray state;

        public Memento(MelodyArray stateToSave) { state = stateToSave; }
        public MelodyArray getSavedState() { return state; }
}
