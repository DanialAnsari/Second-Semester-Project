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





public class Decrypt {
    Scanner zx=new Scanner(System.in);
    
   public void GetString(){
char high;
       String txt;
char a[]={'e','t','a','o','i','n','s','h','r','d','l','c','u','m','w','f','y','p'};
txt=zx.nextLine();
char s[]=new char[26];
   }
   
   public void Frequency(String a,char s[]){
       int count2=0;
       int b[]=new int[26];
   for(int i=0;i<a.length();i++){
       if(a.charAt(i)=='a'){
       b[Character.getNumericValue(a.charAt(i))-10]++;
       }
       else if(a.charAt(i)=='b'){
       b[Character.getNumericValue(a.charAt(i))-10]++;
       }
         else if(a.charAt(i)=='c'){
       b[Character.getNumericValue(a.charAt(i))-10]++;
       }
         else if(a.charAt(i)=='d'){
       b[Character.getNumericValue(a.charAt(i))-10]++;
       }
         else if(a.charAt(i)=='e'){
       b[Character.getNumericValue(a.charAt(i))-10]++;
       }
         else if(a.charAt(i)=='f'){
       b[Character.getNumericValue(a.charAt(i))-10]++;
       }
         else if(a.charAt(i)=='g'){
       b[Character.getNumericValue(a.charAt(i))-10]++;
       }
         else if(a.charAt(i)=='h'){
       b[Character.getNumericValue(a.charAt(i))-10]++;
       }
         else if(a.charAt(i)=='i'){
       b[Character.getNumericValue(a.charAt(i))-10]++;
       }
         else if(a.charAt(i)=='j'){
       b[Character.getNumericValue(a.charAt(i))-10]++;
       }
         else if(a.charAt(i)=='k'){
       b[Character.getNumericValue(a.charAt(i))-10]++;
       }
         else if(a.charAt(i)=='l'){
       b[Character.getNumericValue(a.charAt(i))-10]++;
       }
         else if(a.charAt(i)=='m'){
       b[Character.getNumericValue(a.charAt(i))-10]++;
       }
         else if(a.charAt(i)=='n'){
       b[Character.getNumericValue(a.charAt(i))-10]++;
       }
         else if(a.charAt(i)=='o'){
       b[Character.getNumericValue(a.charAt(i))-10]++;
       }
         else if(a.charAt(i)=='p'){
       b[Character.getNumericValue(a.charAt(i))-10]++;
       }
         else if(a.charAt(i)=='q'){
       b[Character.getNumericValue(a.charAt(i))-10]++;
       }
         else if(a.charAt(i)=='r'){
       b[Character.getNumericValue(a.charAt(i))-10]++;
       }
         else if(a.charAt(i)=='s'){
       b[Character.getNumericValue(a.charAt(i))-10]++;
       }
         else if(a.charAt(i)=='t'){
       b[Character.getNumericValue(a.charAt(i))-10]++;
       }
         else if(a.charAt(i)=='u'){
       b[Character.getNumericValue(a.charAt(i))-10]++;
       } 
         else if(a.charAt(i)=='v'){
       b[Character.getNumericValue(a.charAt(i))-10]++;
       }
         else if(a.charAt(i)=='w'){
       b[Character.getNumericValue(a.charAt(i))-10]++;
       }
         else if(a.charAt(i)=='x'){
       b[Character.getNumericValue(a.charAt(i))-10]++;
       }  
         else if(a.charAt(i)=='y'){
       b[Character.getNumericValue(a.charAt(i))-10]++;
       }
         else if(a.charAt(i)=='z'){
       b[Character.getNumericValue(a.charAt(i))-10]++;
       }
       }
   
  int n = b.length;
int k;
for (int m = n; m >= 0; m--) {

for (int i = 0; i < n - 1; i++) {
k = i + 1;
if (b[i] >= b[k]) {
int temp;
temp = b[i];
b[i] = b[k];
b[k]=temp;

}
}
}
   
   }
   }
       
       
   

