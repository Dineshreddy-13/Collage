package DataStructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    static class Edge{
        int src, dest;
        Edge(int s, int d){
            src = s;
            dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){

        for (int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));
        
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));
        
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));
        
        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));
        
        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));
        
        graph[6].add(new Edge(6, 5));


    }

    public static void bfs(ArrayList<Edge> graph[]){
        Queue<Integer> queue = new LinkedList<>();
        boolean vis[] = new boolean[7];
        queue.add(0);
        while(!queue.isEmpty()){
            int curr = queue.remove();
            if(vis[curr] == false){
                System.out.print(curr + " ");
                vis[curr] = true;
                for(int i = 0; i<graph[curr].size(); i++){
                    queue.add(graph[curr].get(i).dest);
                }
            }
        }

    }


    public static void dfs(ArrayList<Edge> graph[],int curr, boolean vis[]){
        System.out.print(curr + " ");
        vis[curr] = true;
        for(int i = 0; i< graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(vis[e.dest] == false){
                dfs(graph, e.dest, vis);
            }
        }
    }

    public static void main(String args[]){
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[7]; 
        createGraph(graph);
        // bfs(graph);
        dfs(graph, 0, new boolean[7]);
    }

}
