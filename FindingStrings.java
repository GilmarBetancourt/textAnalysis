
/**
 * Finds a list of words in a text taken from a file.
 * 
 * @author (Gilmar) 
 * @version (1.1 17/06/2019)
 */

import java.io.*;
import edu.duke.*; //Specific library for the FileResource method.
import java.io.File;
import org.apache.commons.csv.*;
public class FindingStrings {
      //Two inputs are the "content" text and the second is the list of words to look for. They are in the form of .txt files.
      public int howMany(FileResource text, FileResource strings){
          int count = 0;
          System.out.println("Frecuencia: ");
          //This loops through each of the lines of the desired words or phrases. Each one is in a different line.
          for (String line : strings.lines()){
              //look for each line in all of the content file.
              count = 0;
              //Make the line lower case.
              String lowerLine = line.toLowerCase();
              //Loops through each of the lines in the text.
              for (String content : text.lines()){
                  String contents = content.toLowerCase();
                  //finds the first occurrence of the phrase in the line of the content.
                  int result = contents.indexOf(lowerLine);
                  //Loops through the lines until there are no more of this word/phrase and counts them.
                  while(result != -1){
                      result = contents.indexOf(lowerLine, result + lowerLine.length());
                      count += 1;
            
                    } 
                }
              //Prints each of the words/phrases searched and the total amount of them in the text.
              System.out.println(lowerLine + ": " + count);
          }
          //This return is not important at all.
          return count;
        
    }
    //Calls the method testHowMany to action and prints the results.
    public void testHowMany (){
       FileResource text = new FileResource();
       FileResource strings = new FileResource();
       int total = howMany(text, strings);

    }
    
}
