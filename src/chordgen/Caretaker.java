/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chordgen;

import java.util.ArrayList;

/**
 *
 * @author Алекс
 */
public class Caretaker {
       public ArrayList<Memento> savedStates = new ArrayList<Memento>();

   public void addMemento(Memento m) { savedStates.add(m); }
   public Memento getMemento() { return savedStates.get(savedStates.size()-2); }
}

