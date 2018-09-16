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
public class MorseEN {
     private String txt;
    private String encrypted = "";
    private int x;
    private int y;
    private char letter;
    
    public String dataIn(String text){
     txt=text;
     return txt;
    }
    
    
    public String procedure(String text){
        text = text.toUpperCase();
        x = text.length();
        for (int i=0; i<x; i++){
            letter =text.charAt(i);
            switch (letter){
                case 'A':
                    encrypted = encrypted+".- ";
                    break;
                case 'B':
                    encrypted = encrypted+"-... ";
                    break;
                case 'C':
                    encrypted = encrypted+"-.-. ";
                    break;
                case 'D':
                    encrypted = encrypted+"-.. ";
                    break;
                case 'E':
                    encrypted = encrypted+". ";
                    break;
                case 'F':
                    encrypted = encrypted+"..-. ";
                    break;
                case 'G':
                    encrypted = encrypted+"--. ";
                    break;
                case 'H':
                    encrypted = encrypted+".... ";
                    break;
                case 'I':
                    encrypted = encrypted+".. ";
                    break;
                case 'J':
                    encrypted = encrypted+".--- ";
                    break;
                case 'K':
                    encrypted = encrypted+"-.- ";
                    break;
                case 'L':
                    encrypted = encrypted+".-.. ";
                    break;
                case 'M':
                    encrypted = encrypted+"-- ";
                    break;
                case 'N':
                    encrypted = encrypted+"-. ";
                    break;
                case 'O':
                    encrypted = encrypted+"--- ";
                    break;
                case 'P':
                    encrypted = encrypted+".--. ";
                    break;
                case 'Q':
                    encrypted = encrypted+"--.- ";
                    break;
                case 'R':
                    encrypted = encrypted+".-. ";
                    break;
                case 'S':
                    encrypted = encrypted+"... ";
                    break;
                case 'T':
                    encrypted = encrypted+"- ";
                    break;
                case 'U':
                    encrypted = encrypted+"..- ";
                    break;
                case 'V':
                    encrypted = encrypted+"...- ";
                    break;
                case 'W':
                    encrypted = encrypted+".-- ";
                    break;
                case 'X':
                    encrypted = encrypted+"-..- ";
                    break;
                case 'Y':
                    encrypted = encrypted+"-.-- ";
                    break;
                case 'Z':
                    encrypted = encrypted+"--.. ";
                    break;
                case '0':
                    encrypted = encrypted+"----- ";
                    break;
                case '1':
                    encrypted = encrypted+".---- ";
                    break;
                case '2':
                    encrypted = encrypted+"..--- ";
                    break;
                case '3':
                    encrypted = encrypted+"...-- ";
                    break;
                case '4':
                    encrypted = encrypted+"....- ";
                    break;
                case '5':
                    encrypted = encrypted+"..... ";
                    break;
                case '6':
                    encrypted = encrypted+"-.... ";
                    break;
                case '7':
                    encrypted = encrypted+"--... ";
                    break;
                case '8':
                    encrypted = encrypted+"---.. ";
                    break;
                case '9':
                    encrypted = encrypted+"----. ";
                    break;
                case ' ':
                    encrypted = encrypted+"/ ";
                    break;
                default:
            }
        }
        StringBuilder sb = new StringBuilder(encrypted);
        y = sb.length();
        sb.deleteCharAt(y-1);
        encrypted = sb.toString();
        text=encrypted.toString();
        return text;
    }
    
    public void display(){
        System.out.println(encrypted);
    }
}

