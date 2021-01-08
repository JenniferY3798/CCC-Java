/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jennifer_yan_ccc_l1_test1;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author jenni
 */
public class SmileAndSimiles {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();//number of adj
        int m = input.nextInt();//number of noun
        
        ArrayList<String> adj = new ArrayList <String>();
        ArrayList<String> nouns = new ArrayList <String>();
        
        for(int i = 0;i<n;i++){
        String adjective = input.next();
        adj.add(adjective);
        }
        
        for(int j = 0;j<m;j++){
        String noun = input.next();
        nouns.add(noun);
        }
        
        for(int i = 0;i<adj.size();i++){
            for(int j = 0;j<nouns.size();j++){
                System.out.println(adj.get(i)+" as "+nouns.get(j));
            }
        }
    }
}
