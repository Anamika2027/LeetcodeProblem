// class Solution {

//     public boolean dfs(int node,boolean[] vis,boolean[] recPath,boolean[]safe,List<List<Integer>> adj){

//         vis[node]=true;
//         recPath[node]=true;
//         for(int neigh:adj.get(node)){
//             if(!vis[neigh]){
//                 if(dfs(neigh,vis,recPath,safe,adj)) return true;
//             }else if(recPath[neigh]) return true;
//             else if(!safe[neigh])return true;
//         }
//         recPath[node]=false;
//         safe[node]=true;
//         return false;
//     }

//     public List<Integer> eventualSafeNodes(int[][] graph) {
//         int n=graph.length;
//         List<Integer> ans=new ArrayList<>();
//         List<List<Integer>> adj=new ArrayList<>();
//         for(int i=0;i<n;i++){
//             adj.add(new ArrayList<>());
//         }
//         for(int i=0;i<n;i++){
//             for(int v:graph[i]){
//                 adj.get(i).add(v);
//             } 
//         }

//         boolean[] vis=new boolean[n];
//         boolean[] recPath=new boolean[n];
//         boolean[] safe=new boolean[n];

//         for(int i=0;i<n;i++){
//             if(!vis[i]){
//                 dfs(i,vis,recPath,safe,adj); 
//             }
//         }
//         for(int i=0;i<n;i++){
//             if(safe[i])ans.add(i);
//         }

//         return ans;
//     }
// }

class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {

        int V=graph.length;
        List<List<Integer>> rev=new ArrayList<>();
        for(int i=0;i<V;i++){
            rev.add(new ArrayList<>());
        }

        int[] indegree=new int[V];
        for(int u=0;u<V;u++){
            for(int v:graph[u]){
                rev.get(v).add(u);
                indegree[u]++;
            }
        }

        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indegree[i]==0) q.add(i);
        }

        List<Integer> safe=new ArrayList<>();
        while(!q.isEmpty()){
            int curr=q.poll();
            safe.add(curr);
            for(int neigh:rev.get(curr)){
                indegree[neigh]--;
                if(indegree[neigh]==0) q.add(neigh);
            }
        }

        Collections.sort(safe);
        return safe;
    }
}