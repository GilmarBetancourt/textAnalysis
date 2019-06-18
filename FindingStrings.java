
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
public class FindingStrings {

      public int howMany(FileResource text, FileResource strings){
          String cont = text.asString();
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
          }
          
          return count;
        
    }
    
    public void testHowMany (){
       FileResource text = new FileResource();
       FileResource strings = new FileResource();
       int total = howMany(text, strings);

    }
    
}
