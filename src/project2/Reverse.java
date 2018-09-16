/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.Scanner;

/**
 *
 * @author Iqdar
 */
public class Reverse implements Encryption,Decryption{
    private String text ;
    private StringBuffer reversed;
    private String encrypted ;
    static Scanner obj = new Scanner(System.in);
    
    public void dataIn(){
        System.out.println("Enter text to encrypt/Decrypt");
        text = obj.nextLine();
    }
    
    public void procedure(){
        reversed = new StringBuffer(text);
        reversed.reverse();
        encrypted = reversed.toString().toUpperCase();
    }
 
    public void display(){
        System.out.println(encrypted);
    }
}