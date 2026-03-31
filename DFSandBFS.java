class Solution {

    public List<Integer> dfsHelper(int u,List<Integer> ans,List<List<Integer>> adj,boolean[]vis){
        
        ans.add(u);
        vis[u]=true;
       
        for(int v:adj.get(u)){
            if(!vis[v]){
                dfsHelper(v,ans,adj,vis);
            }
        }

        return ans;
    }

    public List<Integer> dfsOfGraph(int V, List<List<Integer>> adj) {
      
        boolean[] vis=new boolean[V];
        List<Integer> ans=new ArrayList<>();
        dfsHelper(0,ans,adj,vis);
        return ans;
    }
    
    public List<Integer> bfsOfGraph(int V, List<List<Integer>> adj) {
        
        boolean[] vis=new boolean[V];
        Queue<Integer> q=new LinkedList<>();
        List<Integer> ans=new ArrayList<>();

        q.add(0);
        vis[0]=true;

        while(!q.isEmpty()){
            int u=q.poll();
            ans.add(u);

            for(int v:adj.get(u)){
                if(!vis[v]){
                    vis[v]=true;
                    q.add(v);
                }
            }
        }
        return ans;
    }
}

