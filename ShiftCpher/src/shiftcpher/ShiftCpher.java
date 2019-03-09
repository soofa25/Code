/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shiftcpher;

import java.util.Scanner;
import javax.xml.transform.Source;

/**
 *
 * @author abdulmunemal-sultan
 */
public class ShiftCpher {

    /**
     * @param args the command line arguments
     */
    
    
   String alph = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
   String massage = "HELLO" ; //7
   String key = "XMCKL";    //23
   
   int i = 0;
   int r = 0;
   int sum = 0;

   public void OneTime()
   {
       char convertalph [] = alph.toCharArray();
       char converkey [] = key.toCharArray();
       char convrtmassage [] = massage.toCharArray();
     
      
       
       
       
   for(char ss : convrtmassage)
   {
     
           
       for(char al : convertalph)
       {
           
           if(ss ==al)
           {
               
                if(i>25)
               {
                  
                  i = i-26;
                   System.out.print("("+i+" "+al+")"); //print letter (al)
               }
                else{
               System.out.print("("+i+ " "+al+")"); //print letter (al)
                }
               
               
           }
         
       
           i++;
       
       }
       
       }
       System.out.println("");
   for(char k : converkey)
       {
          for(char al : convertalph)
       {
           if(k == al)
           {
                if(i>25)
                {
                   i = i-26; 
                   System.out.print("("+i+" "+al+")");
                }
                else{
               System.out.print("("+i+" "+al+")");
                }
           }
           i++;
       }
       }
      
   }
    public static void main(String[] args) {
        
        ShiftCpher_Algoritham shift = new ShiftCpher_Algoritham();
        
               //    shift.Shift();
                ShiftCpher ShiftCpher = new ShiftCpher();
               ShiftCpher.OneTime();
                  
    }
    
}
