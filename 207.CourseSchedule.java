class Solution {

    public boolean isCycle(boolean[] vis,boolean[]recPath,int node,List<List<Integer>>adj){

        vis[node]=true;
        recPath[node]=true;

        for(int neigh:adj.get(node)){
            if(!vis[neigh]){
                if(isCycle(vis,recPath,neigh,adj)) return true;
            }else if(recPath[neigh]) return true; 
        }

        recPath[node]=false;
        return false;
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge:prerequisites){
            int u=edge[1];
            int v=edge[0];
            adj.get(u).add(v);
        }

        boolean[] vis=new boolean[numCourses];
        boolean[] recPath=new boolean[numCourses];

        for(int i=0;i<numCourses;i++){
            if(!vis[i]){
                if(isCycle(vis,recPath,i,adj)) return false;
            }
        }

        return true;
    }
}