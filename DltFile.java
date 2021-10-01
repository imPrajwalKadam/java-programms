import java.util.*;

import java.io.*;
import java.io.File;
import java.io.IOException;
import java.util.List;
class DltFile {
     public static void main(String args[]) throws IOException {

          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Enter dir : ");
          String dir = br.readLine();

          File f = new File(dir);
          


          File[] files = f.listFiles(new FilenameFilter() {
             //  @Override
               public boolean accept(File dir, String name) {
                    boolean bRet;

                    if( name.endsWith(".exe")||( name.endsWith(".class")))
                    {
                         bRet =  true;
                    }
                    else{
                         bRet = false;
                    }
                    return bRet;     
               }
          });

          for (File dltFileX : files) {
               dltFileX.delete();
               System.out.println(dltFileX);
          }
     }
}
