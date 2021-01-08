/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccc_c19_inclass;
import java.util.Scanner;
/**
 *
 * @author jenni
 */
public class CCC_C19_InClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        /*int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        int dis = Math.abs(x1-x2)+Math.abs(y1-y2);
        int t = input.nextInt();
        
        if(dis<=t&&(t-dis)%2==0)System.out.println("yes");
*/double asdfghj = input.nextDouble();
        int q = input.nextInt();
        int a =0;
        int b =0;
        while(a!=0&&b!=0){
        for(int i = 0;i<q;i++){
            int x = input.nextInt();
            int y = input.nextInt();
            if(x>=0)a=x;
            else{a=a+x; 
            if(a<0)a=0;
            }
            if(y>=0)b=y;
            else{
                b=b+x;
                if(b<0)b=0;
            }
            System.out.println(a+"\t"+b);
        }
        }
    }
    
}
