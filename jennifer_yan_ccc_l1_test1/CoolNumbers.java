/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jennifer_yan_ccc_l1_test1;
import java.util.Scanner;
/**
 *
 * @author jenni
 */
public class CoolNumbers {
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int count = 0;
        for(int i = b; i>= a;i--){
            for(int j = 1;j<=b;j++){
                if(Math.pow(j,3)==i){
                    if((int)Math.sqrt(i)*(int)Math.sqrt(i)==i)
                    count++;
                        }
                    } 
                }
        System.out.println(count);
            }
}
