
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph_list {
    
    LinkedList<Integer>[] adj;
    int nodes;
    boolean[] visited;
    int[] compId;
    int count;
    
    public Graph_list(int nodes){
        this.nodes = nodes;
        this.adj = new LinkedList[nodes];
        for(int i=0;i<nodes;i++){
            this.adj[i]=new LinkedList<>();
        }
        this.visited = new boolean[nodes];
        this.compId = new int[nodes];
        this.count = 0;
    }

    public void addEdge(int u,int v){
        this.adj[u].add(v);
        this.adj[v].add(u);
    }

    public void show(){
        for (int i=0;i<adj.length;i++){
            System.out.print("adjacency of vertex "+i+": ");
            for (int j=0;j<adj[i].size();j++){
                System.out.print(adj[i].get(j)+" ");
            }
            System.out.println();

        }
    }

    public void BFS(int s){
        boolean[] visited = new boolean[nodes];
        Queue<Integer> q = new LinkedList<>();
        visited[s]=true;
        q.offer(s);
        while(!q.isEmpty()){
            int v = q.poll();
            System.out.print(v+ " ");
            for (int i:adj[v]){
                if(!visited[i]){
                    visited[i]=true;
                    q.offer(i);
                }
            }
        }
    }

    public void dfs(int s){
        boolean[] visited = new boolean[nodes];
        Stack<Integer> stack = new Stack<>();
        stack.push(s);
        while(!stack.isEmpty()){
            int u = stack.pop();
            if(!visited[u]){
                visited[u]=true;
                System.out.print(u+ " ");
            }
            for (int v: adj[u]){
                if(!visited[v]){
                    stack.push(v);
                }
            }

        }
    }
    
    public void dfs(){
        
        for(int v=0;v<nodes;v++){
            if(!visited[v]){
                dfs(v,visited,compId,count);
                count++;
            }
        }
        System.out.println(count + " ");
    }

    public void dfs(int v,boolean[] visited , int[] compId ,int count ){
        visited[v]=true;
        compId[v]=count;
        for (int i:adj[v]){
            if(!visited[i]){
                dfs(i, visited, compId, count);
            }
        }
    }
    
    public int notConnected(){
        dfs();
        return count;
    }

    public boolean isConnected(int x, int y){
        return compId[x]==compId[y];
    }

    public static void main(String[] args) {
        Graph_list g = new Graph_list(6);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(3, 4);
        //g.show();
        // //System.out.println(" BFS : ");
        // g.BFS(0);
        // System.out.println(" DFS : ");
        // g.dfs(0);
        g.dfs();
        g.notConnected();
        boolean boo = g.isConnected(1, 4);
        System.out.println(boo);
    }
}
