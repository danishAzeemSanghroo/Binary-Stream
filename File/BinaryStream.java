/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Files;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author Danish
 */
public class BinaryStream {
    public static void main(String args[])throws Exception{
    
        FileOutputStream writeFile=new FileOutputStream("fileName.extention");
        
        char ch=65;
       
        for(int i = 0; i <= 25; i++){
            writeFile.write(ch);
            ch++;
        }
      
      FileInputStream readFile=new FileInputStream("D:\\File Handling\\NewFile2.doc");
      
      int size = readFile.available();
      for(int i=0;i<size;i++){
          int code=readFile.read();
          char ch1=(char)code;
          System.out.print(ch1+" ");
          
      }
      
     // File
        
                
        
    }
}
