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
public class ConsoleWriter implements Writer{
        public ConsoleWriter(){
    }
    
    @Override
    public void write(String toWrite){
       System.out.println(toWrite);
    }
}

