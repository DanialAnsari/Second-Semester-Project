/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import java.util.Scanner;

/**
 *
 * @author Sameer
 */
public class JumbleDN implements Decryption {
        public  String[] datain(String a,String []b){
       b=new String [a.length()];
       for(int i=0;i<a.length();i++){
       b[i]=Character.toString(a.charAt(i));
          
       }
         
        String check;
        for(int i=a.length()-1;i>1;i--){
            if(!" ".equals(b[i]) && !" ".equals(b[i-2]) ){
    check=b[i];
    b[i]=b[i-2];
    b[i-2]=check;}
            else if(b[i-2].equals(" ")){
            i--;
            }
            else if(b[i].equals(" ")){
           check=b[i];
    b[i]=b[i-1];
    b[i-1]=check;
    i--;
            }   
        
    }
        return b;
       }
    
    
    public String procdeture(String []b,String a){
    for (int i=0;i<b.length;i++){
    a=a.concat(b[i]);
        
    }
    
        return a;
    
    
    }
}

    
    
    
    
    
 

