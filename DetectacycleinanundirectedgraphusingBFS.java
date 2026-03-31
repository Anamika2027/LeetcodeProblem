class Solution {

    public boolean bfsCycleDetection(int node,boolean[] vis){

        Queue<Integer> q=new LinkedList<>();
        q.add(new int[]{node,-1});
        vis[node]=true;

        
        while(!q.isEmpty()){
            int[] curr=q.poll();  
            int u=curr[0];
            int parent=curr[1];

            for(int v: adj[u]){
                if(!vis[v]){
                    q.add(new int[]{v,u});
                    vis[v]=true;
                }else if(v!=parent){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isCycle(int V, List<Integer>[] adj) {
        
        boolean[] vis=new boolean[V];
        for(int i=0;i<V;i++){
            if(!vis[i]){
                if(bfsCycleDetection(i,vis,adj)){
                    return true;
                }
            }
        }

        return false;
    }
}
