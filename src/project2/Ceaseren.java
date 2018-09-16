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
public class Ceaseren implements Encryption {
    
     private String text ;
    private StringBuilder encrypted;
 
    private int k ;
    static Scanner obj = new Scanner(System.in);
    
    public String dataIn(String txt){
       text=txt;
       return text;
    }
    
    public String procedure(String text,String c){
        key(c);
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
        char alphas[] = new char[52];
        alphas[0] = 'a';
        alphas[1] = 'b';
        alphas[2] = 'c';
        alphas[3] = 'd';
        alphas[4] = 'e';
        alphas[5] = 'f';
        alphas[6] = 'g';
        alphas[7] = 'h';
        alphas[8] = 'i';
        alphas[9] = 'j';
        alphas[10] = 'k';
        alphas[11] = 'l';
        alphas[12] = 'm';
        alphas[13] = 'n';
        alphas[14] = 'o';
        alphas[15] = 'p';
        alphas[16] = 'q';
        alphas[17] = 'r';
        alphas[18] = 's';
        alphas[19] = 't';
        alphas[20] = 'u';
        alphas[21] = 'v';
        alphas[22] = 'w';
        alphas[23] = 'x';
        alphas[24] = 'y';
        alphas[25] = 'z';
        alphas[26] = 'a';
        alphas[27] = 'b';
        alphas[28] = 'c';
        alphas[29] = 'd';
        alphas[30] = 'e';
        alphas[31] = 'f';
        alphas[32] = 'g';
        alphas[33] = 'h';
        alphas[34] = 'i';
        alphas[35] = 'j';
        alphas[36] = 'k';
        alphas[37] = 'l';
        alphas[38] = 'm';
        alphas[39] = 'n';
        alphas[40] = 'o';
        alphas[41] = 'p';
        alphas[42] = 'q';
        alphas[43] = 'r';
        alphas[44] = 's';
        alphas[45] = 't';
        alphas[46] = 'u';
        alphas[47] = 'v';
        alphas[48] = 'w';
        alphas[49] = 'x';
        alphas[50] = 'y';
        alphas[51] = 'z';
        char x;
        encrypted = new StringBuilder(text);
        for(int i = 0; i < encrypted.length(); i++){
            x = encrypted.charAt(i);
            int j = 0;
            while (j < 26){
                if(x == alpha[j]){
                    encrypted.setCharAt(i, alpha[j+k]);
                    j=26;
                }
                if(x == alphas[j]){
                    encrypted.setCharAt(i, alphas[j+k]);
                    j=26;
                }
                j++;
            }
        }
        text=encrypted.toString();
        return text;
    }
    
    public void display(){
        if(k >0 && k<27){
            System.out.println(encrypted);
        }
        if(k <= 0 || k>=27){
            System.out.println("Entered incorrect charset");
        }
    }
    
    void key(String key){
      
        switch (key){
            case "1":
                k = 1;
                break;
            case "2":
                k = 2;
                break;
            case "3":
                k = 3;
                break;
            case "4":
                k = 4;
                break;
            case "5":
                k = 5;
                break;
            case "6":
                k = 6;
                break;
            case "7":
                k = 7;
                break;
            case "8":
                k = 8;
                break;
            case "9":
                k = 9;
                break;
            case "10":
                k = 10;
                break;
            case "11":
                k = 11;
                break;
            case "12":
                k = 12;
                break;
            case "13":
                k = 13;
                break;
            case "14":
                k = 14;
                break;
            case "15":
                k = 15;
                break;
            case "16":
                k = 16;
                break;
            case "17":
                k = 17;
                break;
            case "18":
                k = 18;
                break;
            case "19":
                k = 19;
                break;
            case "20":
                k = 20;
                break;
            case "21":
                k = 21;
                break;
            case "22":
                k = 22;
                break;
            case "23":
                k = 23;
                break;
            case "24":
                k = 24;
                break;
            case "25":
                k = 25;
                break;
            case "26":
                k = 26;
                break;
            default:
            }
}
}
