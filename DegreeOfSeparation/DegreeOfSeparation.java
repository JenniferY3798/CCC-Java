/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DegreeOfSeparation;
import java.util.*;
import java.lang.*;
import java.io.*;
/**
 *
 * @author jenni
 */
public class DegreeOfSeparation {

    /**
     * @param args the command line arguments
     */
   // A utility function to find the vertex with minimum distance value,
    // from the set of vertices not yet included in shortest path tree
    static final int V=50;
    int minDistance(int dist[], Boolean sptSet[])
    {
        // Initialize min value
        int min = Integer.MAX_VALUE, min_index=-1;
 
        for (int v = 0; v < V; v++)
            if (sptSet[v] == false && dist[v] <= min)
            {
                min = dist[v];
                min_index = v;
            }
 
        return min_index;
    }
 
    // A utility function to print the constructed distance array
    void printSolution(int dist[], int n)
    {
        System.out.println("Vertex   Distance from Source");
        for (int i = 0; i < V; i++)
            System.out.println(i+" \t\t "+dist[i]);
    }
 
    // Funtion that implements Dijkstra's single source shortest path
    // algorithm for a graph represented using adjacency matrix
    // representation
    void dijkstra(int graph[][], int src)
    {
        int dist[] = new int[V]; // The output array. dist[i] will hold
                                 // the shortest distance from src to i
 
        // sptSet[i] will true if vertex i is included in shortest
        // path tree or shortest distance from src to i is finalized
        Boolean sptSet[] = new Boolean[V];
 
        // Initialize all distances as INFINITE and stpSet[] as false
        for (int i = 0; i < V; i++)
        {
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }
 
        // Distance of source vertex from itself is always 0
        dist[src] = 0;
 
        // Find shortest path for all vertices
        for (int count = 0; count < V-1; count++)
        {
            // Pick the minimum distance vertex from the set of vertices
            // not yet processed. u is always equal to src in first
            // iteration.
            int u = minDistance(dist, sptSet);
 
            // Mark the picked vertex as processed
            sptSet[u] = true;
 
            // Update dist value of the adjacent vertices of the
            // picked vertex.
            for (int v = 0; v < V; v++)
 
                // Update dist[v] only if is not in sptSet, there is an
                // edge from u to v, and total weight of path from src to
                // v through u is smaller than current value of dist[v]
                if (!sptSet[v] && graph[u][v]!=0 &&
                        dist[u] != Integer.MAX_VALUE &&
                        dist[u]+graph[u][v] < dist[v])
                    dist[v] = dist[u] + graph[u][v];
        }
 
        // print the constructed distance array
        printSolution(dist, V);
    }
  
    public int dijkstrav1(int graph[][], int src, int des)
    {
        int dist[] = new int[V]; // The output array. dist[i] will hold
                                 // the shortest distance from src to i
 
        // sptSet[i] will true if vertex i is included in shortest
        // path tree or shortest distance from src to i is finalized
        Boolean sptSet[] = new Boolean[V];
 
        // Initialize all distances as INFINITE and stpSet[] as false
        for (int i = 0; i < V; i++)
        {
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }
 
        // Distance of source vertex from itself is always 0
        dist[src] = 0;
 
        // Find shortest path for all vertices
        for (int count = 0; count < V-1; count++)
        {
            // Pick the minimum distance vertex from the set of vertices
            // not yet processed. u is always equal to src in first
            // iteration.
            int u = minDistance(dist, sptSet);
 
            // Mark the picked vertex as processed
            sptSet[u] = true;
 
            // Update dist value of the adjacent vertices of the
            // picked vertex.
            for (int v = 0; v < V; v++)
 
                // Update dist[v] only if is not in sptSet, there is an
                // edge from u to v, and total weight of path from src to
                // v through u is smaller than current value of dist[v]
                if (!sptSet[v] && graph[u][v]!=0 &&
                        dist[u] != Integer.MAX_VALUE &&
                        dist[u]+graph[u][v] < dist[v])
                    dist[v] = dist[u] + graph[u][v];
        }
 
        // print the constructed distance array
        return dist[des-1];
    
}
    // Driver method
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        DegreeOfSeparation t = new DegreeOfSeparation();
       int g[][] = new int[50][50];
       for(int i = 0; i<50;i++){
           for(int j = 0; j<50;j++){
               g[i][j] = 0;
               g[j][i] = 0;
           }
       }
       //part 1
       g [1][6] = 1;
       g [6][1] = 1;
       g [2][6] = 1;
       g [6][2] = 1;
       g [3][6] = 1;
       g [6][3] = 1;
       g [4][6] = 1;
       g [6][4] = 1;
       g [5][6] = 1;
       g [6][5] = 1;
       g [7][6] = 1;
       g [6][7] = 1;
       g [3][4] = 1;
       g [4][3] = 1;
//part 2
       g [4][5] = 1;
       g [5][4] = 1;
       g [3][5] = 1;
       g [5][3] = 1;
       g [3][15] = 1;
       g [15][3] = 1;
       g [13][15] = 1;
       g [15][13] = 1;
       g [14][13] = 1;
       g [13][14] = 1;
       g [12][13] = 1;
       g [13][12] = 1;
       //part 3
       g [7][8] = 1;
       g [8][7] = 1;
       g [8][9] = 1;
       g [9][8] = 1;
       g [9][10] = 1;
       g [10][9] = 1;
       g [9][12] = 1;
       g [12][9] = 1;
       g [10][11] = 1;
       g [11][10] = 1;
       g [11][12] = 1;
       g [12][11] = 1;
       g [16][17] = 1;
       g [17][16] = 1;
       g [16][18] = 1;
       g [18][16] = 1;
       g [18][17] = 1;
       g [17][18] = 1;
       
       char command = input.next().charAt(0);
       int x1,y1;
       while(command != 'q'){
           if(command == 'i'){
               //make them friends
               x1 = input.nextInt();
               y1 = input.nextInt();
               g[x1][y1]=1;
               g[y1][x1]=1;
           }
           else if(command== 'd'){
               //delete the connection
               x1 = input.nextInt();
               y1 = input.nextInt();
               g[x1][y1]=0;
               g[y1][x1]=0;
           }
           else if (command == 'n'){
               x1 = input.nextInt();
               int count = 0;
               for(int i =0; i<g[x1].length;i++){
                   if(i!=x1&&g[x1][i]==1)count++;
               }
               System.out.println(count);
           }
           else if(command == 'f'){
               x1 = input.nextInt();
               int count = 0;
               for(int i =0; i<g[x1].length;i++){
                   if(i!=x1&&t.dijkstrav1(g, x1, i+1)==2)count++;
               }
               System.out.println(count);
           }
           else if (command == 's'){
               x1 = input.nextInt();
               y1 = input.nextInt();
               System.out.println(t.dijkstrav1(g, x1, y1+1));
           }
           command = input.next().charAt(0);
       }
    }
    
}
