class Solution {
    public int[] topoSort(int V, List<List<Integer>> adj) {
    
        int[] indegree=new int[V];

        for(int u=0;u<V;u++){
            for(int neigh:adj.get(u)){
                indegree[neigh]++;
            }
        }

        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indegree[i]==0) q.offer(i);
        }

        int[] res=new int[V];
        int idx=0;

        while(!q.isEmpty()){
            int curr=q.poll();
            res[idx++]=curr;  

            for(int neigh:adj.get(curr)){
                indegree[neigh]--;
                if(indegree[neigh]==0) q.offer(neigh);
            }
        }

        return res;
    }
}