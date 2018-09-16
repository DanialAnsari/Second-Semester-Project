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
public class Rot13 implements Encryption, Decryption{
    private String text ;
    private StringBuilder encrypted;
    static Scanner obj = new Scanner(System.in);
    
    public void dataIn(){
        System.out.println("Enter text to encrypt/decrypt");
        text = obj.nextLine();
    }
    
    public void procedure(){
        char alpha[] = new char[52];
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
        alpha[26] = 'A';
        alpha[27] = 'B';
        alpha[28] = 'C';
        alpha[29] = 'D';
        alpha[30] = 'E';
        alpha[31] = 'F';
        alpha[32] = 'G';
        alpha[33] = 'H';
        alpha[34] = 'I';
        alpha[35] = 'J';
        alpha[36] = 'K';
        alpha[37] = 'L';
        alpha[38] = 'M';
        alpha[39] = 'N';
        alpha[40] = 'O';
        alpha[41] = 'P';
        alpha[42] = 'Q';
        alpha[43] = 'R';
        alpha[44] = 'S';
        alpha[45] = 'T';
        alpha[46] = 'U';
        alpha[47] = 'V';
        alpha[48] = 'W';
        alpha[49] = 'X';
        alpha[50] = 'Y';
        alpha[51] = 'Z';
        char x;
        encrypted = new StringBuilder(text.toUpperCase());
        for(int i = 0; i < encrypted.length(); i++){
            x = encrypted.charAt(i);
            int j = 0;
            while (j < 26){
                if(x == alpha[j]){
                    encrypted.setCharAt(i, alpha[j+13]);
                    j=26;
                }
            j++;
            }
        }
    }
    
    public void display(){
        System.out.println(encrypted);
    }
}