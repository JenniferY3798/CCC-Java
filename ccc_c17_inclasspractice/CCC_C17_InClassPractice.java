/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ccc_c17_inclasspractice;
import java.util.*;
import java.lang.*;
import java.io.*;
/**
 *
 * @author jenni
 */
public class CCC_C17_InClassPractice {

    // A utility function to find the vertex with minimum distance value,
    // from the set of vertices not yet included in shortest path tree
    int V;
    //the constructor for the frecles class
    double minKey(double key[], Boolean sptSet[])
    {
        // Initialize min value
        double min = Integer.MAX_VALUE, min_index=-1;
        
        for (int v = 0; v < V; v++)
            if (sptSet[v] == false && key[v] <= min)
            {
                min = key[v];
                min_index = v;
            }
 
        return min_index;
    }
    public void printMST(int parent[],int n,double graph[][]){
    double total = 0;
    System.out.println("Edge      Weight");
    for(int i = 1;i<V;i++){
        System.out.println(parent[i]+" - "+i+"   "+graph[i][parent[i]]);
        total = total + graph[i][parent[i]];
    }
    System.out.println(total);
    }
  public void Dijekstra(double graph[][]){
      int parent [] = new int [V];
      double key [] = new double [V];
      Boolean mstSet[]=new Boolean[V];
      for(int i =0; i<V;i++){
          key[i]=Integer.MAX_VALUE;
          mstSet[i]=false;
     
  }
      key[0] = 0;
      parent[0]=-1;
      
      for(int count = 0; count<V-1;count++){
          int u = (int)minKey(key,mstSet);
          mstSet[u] = true;
      }
      for(int v = 0;v<V;v++){
          if(graph[u][v]!=0&&mstSet[v]==false&&graph[u][v])
      }
  }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
       double g[][] = new double[a][a];
        for(int i = 0; i<a;i++){
           for(int j = 0; j<a;j++){
               g[i][j] = 0;
               g[j][i] = 0;
           }
       }
        
       
    }
    
}
