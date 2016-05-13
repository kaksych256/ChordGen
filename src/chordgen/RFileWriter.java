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
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;

public class RFileWriter implements Writer {
    
    public PrintWriter bufWriter = null;  
    
    public RFileWriter() throws IOException{
        try{ 
            bufWriter = new PrintWriter(new FileWriter("output.txt", true));
        }
        catch (IOException e){}
    }
    
    @Override
    public void write(String toWrite)  throws IOException{
        bufWriter.println(toWrite);
    }   
}