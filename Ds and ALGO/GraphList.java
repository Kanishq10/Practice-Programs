import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class GraphList {
   public ArrayList<Integer> BreadthFirstSearch(int v, ArrayList<Integer> adj)
   {
    ArrayList<Integer> bfs=new ArrayList<>();
    boolean vis[]=new boolean[v+1];

    for(int i=1;i<=v;i++){
        if(vis[i]==false){
            Queue<Integer> q=new LinkedList<>();
            q.add(i);
            vis[i]=true;
            while(!q.isEmpty()){
                Integer node=q.poll();
                bfs.add(node);
            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
                for(Integer it:adj.get(node)){
                    if(vis[it]==false){
                        vis[it]=true;
                        q.add(it);
                    }
                }
            }
        }
    }
    return bfs;
    // Time Complexity: O(N) + O(2E), 
   }

   public void dfs(int node, boolean[] vis, ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> ls){
    vis[node]=true;
    ls.add(node);

    for(Integer it:adj.get(node)){
        if(vis[it]==false){
            dfs(it ,vis,adj ,ls);
        }
    }
   }
   public ArrayList<Integer> dfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj){
    boolean[] vis=new boolean[v+1];
    vis[0]=true;
    ArrayList<Integer> ls=new ArrayList<>();
    dfs(0,vis,adj,ls);  //dfs code
    return ls;
    // O(N) + O(2E)
   }

   public boolean dfsCyc(int v,boolean vis[], ArrayList<ArrayList<Integer>> adj,int parent){
    vis[v]=true;
    Integer i;
    Iterator<Integer> it=adj.get(v).iterator();
    while(it.hasNext()){
        i=it.next();
        if(!vis[i]){
            if(dfsCyc(i, vis, adj, v)){
                return true;
            }
            else if(i!=parent){
                return true;
            }
        }
    }
   }

   public boolean detectCycle(int v,ArrayList<ArrayList<Integer>> adj){
    boolean[] vis=new boolean[v] ;
    return dfsCyc(v,vis,adj,-1);
   }

   public static void main(String[] args)
   {
       // Write your code here
       Scanner sc= new Scanner(System.in);
       int n;
       int e;
       n=sc.nextInt();
       e=sc.nextInt();
       ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
       for(int i=0; i<n; i++){
         adj.add(new ArrayList<Integer>());
       }
     //filling adjacency matrix;
       for (int i = 0; i < e; i++) {
           int f, s;
           f=sc.nextInt();
           s=sc.nextInt();
           adj.get(f).add(s);
           adj.get(s).add(f);
       }
       boolean visited [] = new boolean[n];
       for (int i = 0; i < n; i++) {
           visited[i]=false;
       }
     boolean flag=false;
     for (int u = 0; u < n; u++) {
           if (!visited[u]){
               if (containsCycle(u,-1,adj,visited)){
                   flag=true;
                   break;
               }}
       }
     if(flag){
         System.out.println("Yes");
     }
     else{
         System.out.println("No");
       }
    }
}
