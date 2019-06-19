
/**
 * Finds a list of words in a text taken from a file.
 * 
 * @author (Gilmar) 
 * @version (1.1 17/06/2019)
 */

import java.io.*;
import edu.duke.*;
import java.io.File;
import org.apache.commons.csv.*;
import javax.swing.JOptionPane;


public class FindingStrings {

      public static int howMany(FileResource text, FileResource strings){
          int count = 0;
          System.out.println("Frecuencia: ");
          for (String line : strings.lines()){
              //look for each line in all of the content string.
              count = 0;
              String lowerLine = line.toLowerCase();
              //System.out.println(lowerLine);
              for (String content : text.lines()){
                  String contents = content.toLowerCase();
                  int result = contents.indexOf(lowerLine);
                  while(result != -1){
                      result = contents.indexOf(lowerLine, result + lowerLine.length());
                      count += 1;
            
                    } 
                }
              System.out.println(lowerLine + ": " + count);
              //JOptionPane.showMessageDialog(null,"Eggs are not supposed to be green.","Resultados", JOptionPane.PLAIN_MESSAGE);
          }
          
          return count;
        
    }
    
    public static void main (String [] args) {
       FileResource text = new FileResource();
       FileResource strings = new FileResource();
       int total = howMany(text, strings);

    }
    
}
