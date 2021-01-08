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
public class TermsOfOffice {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int cy = input.nextInt();
        int fy = input.nextInt();
        int m = 4;//4
        int t = 2;//2
        int c = 3;//3
        int d = 5;//5
        int changes =cy;
        int change = (4*2*3*5)/2;
        System.out.println("All positions change in year " + changes);
        for(int i = (fy-cy/60);i>0;i--){
        if(changes+60<=fy){
                changes = changes+60;
                System.out.println("All positions change in year " + changes);
            }
    }
}
}
