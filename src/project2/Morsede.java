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
public class Morsede implements Decryption{
    private String code;
    private String decrypt = "";
    private int x;
    private int y;
    static Scanner obj = new Scanner(System.in);
    
    public void dataIn(){
        System.out.println("Enter code to decrypt");
        code = obj.nextLine();
    }
    
    public void procedure(){
        y = code.length();
        for (int i = 0; i<y; i++){
            if(code.charAt(i) != ' '){
                String a = "";
                if(i <= y-5){
                    a = code.substring(i, i+5);
                }
                switch(a){
                    case "-----":
                        decrypt = decrypt+"0";
                        i=i+5;
                        break;
                    case ".----":
                        decrypt = decrypt+"1";
                        i=i+5;
                        break;
                    case "..---":
                        decrypt = decrypt+"2";
                        i=i+5;
                        break;
                    case "...--":
                        decrypt = decrypt+"3";
                        i=i+5;
                        break;
                    case "....-":
                        decrypt = decrypt+"4";
                        i=i+5;
                        break;
                    case ".....":
                        decrypt = decrypt+"5";
                        i=i+5;
                        break;
                    case "-....":
                        decrypt = decrypt+"6";
                        i=i+5;
                        break;
                    case "--...":
                        decrypt = decrypt+"7";
                        i=i+5;
                        break;
                    case "---..":
                        decrypt = decrypt+"8";
                        i=i+5;
                        break;
                    case "----.":
                        decrypt = decrypt+"9";
                        i=i+5;
                        break;
                    default:
                        String b = "";
                        if(i <= y-4){
                            b = code.substring(i, i+4);
                        }
                        switch(b){
                            case "-...":
                                decrypt = decrypt+"B";
                                i=i+4;
                                break;
                            case "-.-.":
                                decrypt = decrypt+"C";
                                i=i+4;
                                break;
                            case "..-.":
                                decrypt = decrypt+"F";
                                i=i+4;
                                break;
                            case "....":
                                decrypt = decrypt+"H";
                                i=i+4;
                                break;
                            case ".---":
                                decrypt = decrypt+"J";
                                i=i+4;
                                break;
                            case ".-..":
                                decrypt = decrypt+"L";
                                i=i+4;
                                break;
                            case ".--.":
                                decrypt = decrypt+"P";
                                i=i+4;
                                break;
                            case "--.-":
                                decrypt = decrypt+"Q";
                                i=i+4;
                                break;
                            case "...-":
                                decrypt = decrypt+"V";
                                i=i+4;
                                break;
                            case "-..-":
                                decrypt = decrypt+"X";
                                i=i+4;
                                break;
                            case "-.--":
                                decrypt = decrypt+"Y";
                                i=i+4;
                                break;
                            case "--..":
                                decrypt = decrypt+"Z";
                                i=i+4;
                                break;
                            default:
                                String c = "";
                                if(i <= y-3){
                                   c = code.substring(i, i+3);
                                }
                                switch(c){
                                    case "-..":
                                        decrypt = decrypt+"D";
                                        i=i+3;
                                        break;
                                    case "-.-":
                                        decrypt = decrypt+"K";
                                        i=i+3;
                                        break;
                                    case "---":
                                        decrypt = decrypt+"O";
                                        i=i+3;
                                        break;
                                    case ".-.":
                                        decrypt = decrypt+"R";
                                        i=i+3;
                                        break;
                                    case "...":
                                        decrypt = decrypt+"S";
                                        i=i+3;
                                        break;
                                    case "..-":
                                        decrypt = decrypt+"U";
                                        i=i+3;
                                        break;
                                    case ".--":
                                        decrypt = decrypt+"W";
                                        i=i+3;
                                        break;
                                    default:
                                        String d = "";
                                        if(i <= y-2){
                                            d = code.substring(i, i+2);
                                        }
                                        switch(d){
                                            case ".-":
                                                decrypt = decrypt+"A";
                                                i=i+2;
                                                break;
                                            case "..":
                                                decrypt = decrypt+"I";
                                                i=i+2;
                                                break;
                                            case "--":
                                                decrypt = decrypt+"M";
                                                i=i+2;
                                                break;
                                            case "-.":
                                                decrypt = decrypt+"N";
                                                i=i+2;
                                                break;
                                            default:
                                                char e = code.charAt(i);
                                                switch(e){
                                                    case '-':
                                                        decrypt = decrypt+"T";
                                                        i=i++;
                                                        break;
                                                    case '.':
                                                        decrypt = decrypt+"E";
                                                        i=i++;
                                                        break;
                                                    case '/':
                                                        decrypt = decrypt+" ";
                                                        i=i++;
                                                        break;
                                                    default:
                                                        if(i == i-1){
                                                            System.out.println("Mistake in a code!");
                                                        }
                                                }
                                        }
                                }     
                        }
                    }
                }
            }
        }
    
        public void display(){
            System.out.println(decrypt);
        }
    }
