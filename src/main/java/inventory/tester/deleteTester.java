package inventory.tester;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Muhamad Ashraff
 */
public class deleteTester {

    public static void main(String args[]) {
        getText(1);
    }//END MAIN
    
    public static String getText(int n){
    n=n-1;
    String strPath = "C:/Products.txt";
    String line = null;
    try (BufferedReader br = new BufferedReader(new FileReader(strPath))) {
        for (int i = 0; i < n; i++)
            br.readLine();
            line = br.readLine();
            deleteText(line, " ");
      }
      catch(IOException e){
        System.out.println(e);
      }//END TRY CATCH
    return line;
    }//END METHOD GETTEXT
    
    private static void deleteText(String oldStr, String newStr){
        String strPath = "C:/Products.txt";
        File fileToBeModified = new File(strPath);
        String oldContent = "";
        BufferedReader reader = null;
        FileWriter writer = null;
        try
        {   
            //READ LINES OF TXT FILE
            reader = new BufferedReader(new FileReader(fileToBeModified));
            String line = reader.readLine();
             
            while (line != null) 
            {
                oldContent = oldContent + line + System.lineSeparator();
                line = reader.readLine();
            }//ENDDO
             
            //REPLACING WITH NEW DATA
            String newContent = oldContent.replaceAll(oldStr, newStr);

            //REWRITE THE NEW DATA 
            writer = new FileWriter(fileToBeModified);
            writer.write(newContent);
            System.out.println("DONE !");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }//END TRY CATCH
        finally{
            try
            {
                //CLOSE READER & WRITER
                reader.close();
                writer.close();
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }//END NESTED TRY CATCH
        }//END FINALLY
    }//END METHOD
    
}//END CLASS
