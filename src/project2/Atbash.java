/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  Project2;

import java.util.Scanner;

/**
 *
 * @author Iqdar
 */
public class Atbash implements Encryption, Decryption{
   
    private char x;
    static Scanner obj = new Scanner(System.in);
   private String text1;
   private StringBuilder encrypted;
    
    public String dataIn(String text){
        
        this.text1=text;
        return text1;
    }
    
    public String procedure(String text){
        encrypted = new StringBuilder(text.toUpperCase());
        char alpha[] = new char[26];
        alpha[0] = 'A';
        alpha[1] = 'B';
        alpha[2] = 'C';
        alpha[3] = 'D';
        alpha[4] = 'E';
        alpha[5] = 'F';
        alpha[6] = 'G';
        alpha[7] = 'H';
        alpha[8] = 'I';
        alpha[9] = 'J';
        alpha[10] = 'K';
        alpha[11] = 'L';
        alpha[12] = 'M';
        alpha[13] = 'N';
        alpha[14] = 'O';
        alpha[15] = 'P';
        alpha[16] = 'Q';
        alpha[17] = 'R';
        alpha[18] = 'S';
        alpha[19] = 'T';
        alpha[20] = 'U';
        alpha[21] = 'V';
        alpha[22] = 'W';
        alpha[23] = 'X';
        alpha[24] = 'Y';
        alpha[25] = 'Z';
        int j;
        for(int i = 0; i < encrypted.length(); i++){
            j=0;
            x = encrypted.charAt(i);
            while(j<26){
                if(x == alpha[j]){
                    encrypted.setCharAt(i, alpha[25-j]);
                    j=26;
                }
                j++;
            }
        }
        text=encrypted.toString();
        return text;
    }
    
   
}
