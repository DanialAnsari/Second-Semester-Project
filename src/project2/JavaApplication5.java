/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.Scanner;

/**
 *
 * @author HiFi
 */
public class JavaApplication5 {


   
  
    public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  System.out.println("Enter the amount in Saudi Riyals");
  int one=0;
  int five=0;
   int ten=0;
    int fifty=0;
  int money=in.nextInt();
  if (money%5!=0 && money%10!=0 && money%50!=0){
  while(money%5!=0 || money%10!=0){
  money--;
  one++;
  }
  }
     if (money%5==0 && money%10!=0){
     while (money%10!=0){
         money=money-5;
     five++;
     }}
     if (money%10==0 && money%50!=0){
     while(money%50!=0){
         money=money-10;
     ten++;
     }
     }
     if (money%50==0){
     while(money!=0){
         money=money-50;
         fifty++;
     } 
     }
     int total=five+ten+one+fifty;
  System.out.println("The minimum number of bills is "+total);
  System.out.println("Number of 50 Riyal bills ="+fifty+"\n"+"Number of 10 Riyal bills ="+ten+"\n"+"Number of 5 Riyal bills ="+five+"\n"+"Number of one Riyal bills ="+one);
  
  }
}       
           
                         
                                  
    
     
    

