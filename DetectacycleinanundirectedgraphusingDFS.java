class Solution {

    public boolean dfsCycleDetection(int node,int parent,boolean[] vis,List<Integer>[] adj){

        vis[node]=true;
        for(int neigh:adj[node]){
            if(!vis[neigh]){
                if(dfsCycleDetection(neigh,node,vis,adj)){
                    return true;
                }   
            }
            else if(neigh!=parent){
                return true;
            }   
        }
        return false;
    }

    public boolean isCycle(int V, List<Integer>[] adj) {
        
        boolean[] visited=new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i]){
                if(dfsCycleDetection(i,-1,visited,adj))
                return true;
            }
        }
        return false;
    }
}
