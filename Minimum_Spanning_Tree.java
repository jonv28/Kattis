import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
 
class Minimum_Spanning_Tree {
    
    class Edge implements Comparable<Edge>
    {
        int src, dest, weight;
 
        public int compareTo(Edge compareEdge)
        {
            return this.weight - compareEdge.weight;
        }
    };

    class Edge2 implements Comparable<Edge2>{
        int src, dest, min;
        public int compareTo(Edge2 compareEdge){
            return this.min - compareEdge.min;
        }
    }
 
    class subset
    {
        int parent, rank;
    };
 
    int V, E; 
    Edge edge[]; 
 

    Graph(int v, int e)
    {
        V = v;
        E = e;
        edge = new Edge[E];
        for (int i = 0; i < e; ++i)
            edge[i] = new Edge();
    }
 

    int find(subset subsets[], int i)
    {
        // find root and make root as parent of i
        // (path compression)
        if (subsets[i].parent != i){
            subsets[i].parent
                = find(subsets, subsets[i].parent);
        }
 
        return subsets[i].parent;
    }
 
    void Union(subset subsets[], int x, int y)
    {
        int xroot = find(subsets, x);
        int yroot = find(subsets, y);
 

        if (subsets[xroot].rank
            < subsets[yroot].rank)
            subsets[xroot].parent = yroot;
        else if (subsets[xroot].rank
                 > subsets[yroot].rank)
            subsets[yroot].parent = xroot;
 
        else {
            subsets[yroot].parent = xroot;
            subsets[xroot].rank++;
        }
    }


    void KruskalMST()
    {
        // Tnis will store the resultant MST
        Edge result[] = new Edge[V];
       
        // An index variable, used for result[]
        int e = 0;
       
        // An index variable, used for sorted edges
        int i = 0;
        for (i = 0; i < V; ++i)
            result[i] = new Edge();
 

        Arrays.sort(edge);
 
        
        subset subsets[] = new subset[V];
        for (i = 0; i < V; ++i)
            subsets[i] = new subset();
 
        for (int v = 0; v < V; ++v)
        {
            subsets[v].parent = v;
            subsets[v].rank = 0;
        }
 
        i = 0; 
 
        
        while (e < V - 1)
        {

            Edge next_edge = edge[i++];
 
            int x = find(subsets, next_edge.src);
            int y = find(subsets, next_edge.dest);
 

            if (x != y) {
                result[e++] = next_edge;
                Union(subsets, x, y);
            }
            
        }
 
        //Min cost
        int minimumCost = 0;
        for (i = 0; i < e; ++i)
        {
            minimumCost += result[i].weight;
        }
        System.out.println(minimumCost);

        //Reorder edges
        Edge2[] edgessorted = new Edge2[V - 1];
        for(int j = 0; j < e; j++){
            if(result[j].src < result[j].dest){
                edgessorted[j] = new Edge2();
                edgessorted[j].min = result[j].src;
                edgessorted[j].src = result[j].src;
                edgessorted[j].dest = result[j].dest;
            }

            else{
                edgessorted[j] = new Edge2();
                edgessorted[j].min = result[j].dest;
                edgessorted[j].src = result[j].src;
                edgessorted[j].dest = result[j].dest;

            }
        }

        Arrays.sort(edgessorted);
        for(Edge2 k : edgessorted){
            if(k.min == k.src){
                System.out.println(k.src + " " + k.dest);
            }
            else{
                System.out.println(k.dest + " " + k.src);
            }
        }


    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        while(true){
            int v = sc.nextInt();
            int e = sc.nextInt();
            if( v == 0 && e ==0){
                break;
            }
            if(e < v - 1){
                System.out.println("Impossible");
                continue;
            }

            Graph g = new Graph(v, e);
            for(int i = 0; i < e; i ++){
               g.edge[i].src = sc.nextInt();
               g.edge[i].dest = sc.nextInt();
               g.edge[i].weight = sc.nextInt(); 
            }
            g.KruskalMST();
        }



    }
}