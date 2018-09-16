/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

/**
 *
 * @author Sameer
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project2  {
    
    public static void main(String[] args) {
        // TODO code application logic here
     
  java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjectGUI2().setVisible(true);
            }
        });
        
       
      
        
    }
    
}
