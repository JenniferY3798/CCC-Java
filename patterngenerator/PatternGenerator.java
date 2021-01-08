/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterngenerator;
import java.util.Scanner;
/**
 *
 * @author jenni
 */
public class PatternGenerator {

    /**
     * @param args the command line arguments
     */
   
    public static boolean isValid(String str, int n){
        //check if str has n 1
        int count =0;
        for(int i =0; i<str.length();i++){
            if(str.charAt(i)=='i')count++;
        }
        return count ==n;
    }
    
    public static String binary(int x,int n){
    String str = "";
    while(x>0){
        str = str + x%2;
        x = x/2;
    }
    String temp = "";
    for(int i = str.length()-1;i>=0;i--){
        temp = temp + str.charAt(i);
    }
   int d = temp.length();
   String temp1 = "0";
    if(temp.length()!=n){
        for(int i =0;i<n-d;i++){
            
        }
    }
    return temp;
    
    
    }
     public static int decimal(String str){

        int x =0;
        int index =0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)=='0')x=x+0*(int)(Math.pow(2,index));
            else if(str.charAt(i)=='1')x=x+1*(int)(Math.pow(2, index));
            index ++;
        }
        return x;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int ntest = input.nextInt();
        for(int i =0;i<ntest;i++){
            int n = input.nextInt();
            int k = input.nextInt();
            String str = "";
            for(int j=0;j<k;j++){
                str = str+"1";
            }
            for(int a =0; a<(n-k);a++){
                str = str+"0";
            }
        
        //Let generate the decimal equivalent of str
        int x =0;
        int index =0;
        int d = decimal(str);
        for(int b=str.length()-1;b>=0;b--){
            if(str.charAt(i)=='0')x=x+0*(int)(Math.pow(2,index));
            else x = x+(int)(Math.pow(2,b)*1);
            System.out.println("Decimal "+ d);
        for(int c =x; c>=0;c--){
            if(isValid(binary(c,n),k))System.out.println(binary(c));
        }
        }
        }
    }
    
}
