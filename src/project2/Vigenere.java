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
public class Vigenere implements Encryption{
    private String txt;
    private StringBuffer encrypted;
    private StringBuffer keyword;
    private char k;
    private char k2;
    private final char alpha[] = new char [52];
    private static Scanner obj = new Scanner(System.in);
    
    public Vigenere(char a[]){
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
    }
    
    public String dataIn(String text){
        txt=text;
        return text;
    }
    
    public String procedure(String text,StringBuffer c ){
        key(keyword);
        encrypted = new StringBuffer(text.toUpperCase());
        int j;
        for (int i = 0; i<encrypted.length(); i++){
            j = 0;
            while(j < 26){
                if(encrypted.charAt(i) == alpha[j]){
                    j =26;
                }
                if(encrypted.charAt(i) != alpha[j] && j==25){
                    encrypted.deleteCharAt(i);
                    j++;
                    i--;
                }
                if(encrypted.charAt(i) != alpha[j] && j<25){
                    j++;
                }
            }
        }
        int h = 0;
        int x = 0;
        int l;
        int m;
        while(h<encrypted.length()){
            k = encrypted.charAt(h);
            if(x == keyword.length()){
                x = 0;
            }
            k2 = keyword.charAt(x);
            if(x < keyword.length()){
                m=0;
                while (m<26){
                    if(k2 == alpha[m]){
                        l = 0;
                        while (l<26){
                            if(k == alpha[l]){
                                encrypted.setCharAt(h, alpha[l+m]);
                                x++;
                                h++;
                                l=26;
                            }
                        l++;
                        }
                    }
                    m++;
                }
            }
        }
        text=encrypted.toString();
        return text;
    }
    
    void key(StringBuffer keyword){
        System.out.println("Enter Keyword");
        keyword = new StringBuffer(obj.nextLine().toUpperCase());
        int  j;
        for (int i = 0; i<keyword.length(); i++){
            j = 0;
            while(j < 26){
                if(keyword.charAt(i) == alpha[j]){
                    j=26;
                }
                if(keyword.charAt(i) != alpha[j] && j==25){
                    keyword.deleteCharAt(i);
                    j++;
                    i--;
                }
                if(keyword.charAt(i) != alpha[j] && j<25){
                    j++;
                }
            }
        }
    }
    
    public void display(){
        System.out.println(encrypted);
    }
}