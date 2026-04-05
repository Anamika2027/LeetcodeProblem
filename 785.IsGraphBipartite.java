class Solution {
    public boolean isBipartite(int[][] graph) {
        
        int n=graph.length;
        int[] visited=new int[n];

        for(int i=0;i<n;i++){
            visited[i]=-1;
        }

        for(int i=0;i<n;i++){
            if(visited[i]==-1){
                if(!bfs(graph,i,visited)) return false;
            }
        }
        return true;
    }

    public boolean bfs(int[][]graph,int start,int[] visited){

        Queue<Integer> q=new LinkedList<>();
        q.add(start);
        visited[start]=0;

        while(!q.isEmpty()){

            int node=q.poll();

            for(int neigh:graph[node]){
                if(visited[neigh]==-1){
                    visited[neigh]=1-visited[node];
                    q.add(neigh);
                }else if(visited[neigh]==visited[node]) return false;
            }
        }
        return true;
    }
}