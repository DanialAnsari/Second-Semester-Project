/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project2;

/**
 *
 * @author Iqdar
 */
public interface Encryption{
    String dataIn(String text);
    String dataIn(String t,String c);
    String dataIn(String t,StringBuffer c);
    
    String procedure(String a);
     String procedure(String t,String c);
    String procedutre(String t,StringBuffer c);
   
}
