class Solution {

    public boolean dfs(int node,Stack<Integer>s,boolean[]vis,boolean[]recPath,List<List<Integer>> adj){

        vis[node]=true;
        recPath[node]=true;
        for(int neigh:adj.get(node)){
            if(!vis[neigh]){
                if(dfs(neigh,s,vis,recPath,adj)) return true;
            }else if(recPath[neigh]) return true;
        }
        recPath[node]=false;
        s.push(node);
        return false;      
    }

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] row:prerequisites){
            int u=row[1];
            int v=row[0];
            adj.get(u).add(v);
        }
        
        boolean[] vis=new boolean[numCourses];
        boolean[] recPath=new boolean[numCourses];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<numCourses;i++){
           if(!vis[i]){
            if(dfs(i,s,vis,recPath,adj)){
                return new int[0];
            }
            } 
        }

        int[] ans=new int[numCourses];
        int i=0;
        while(!s.isEmpty()){
            ans[i++]=s.pop();
        }
        
        return ans;
    }
}