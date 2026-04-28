class Solution {
    public int countPaths(int n, int[][] roads) {
        
        int MOD = 1_000_000_007;
        List<List<int[]>> adj=new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int[] r:roads){
            adj.get(r[0]).add(new int[]{r[1],r[2]});
            adj.get(r[1]).add(new int[]{r[0],r[2]});
        }

        PriorityQueue<long[]> pq=new PriorityQueue<>(
            (a,b)->Long.compare(a[0],b[0])
        );
        pq.offer(new long[]{0,0});

        long[] dist=new long[n];
        Arrays.fill(dist,Long.MAX_VALUE);
        dist[0]=0;
        
        int[] ways=new int[n];
        ways[0]=1;

        while(!pq.isEmpty()){
            long[] curr=pq.poll();
            long time=curr[0];
            int node=(int)curr[1];

            if(time>dist[node]) continue;
 
            for(int[] nei:adj.get(node)){   
                int nextNode=nei[0];
                long newTime=time+nei[1];
                if(newTime<dist[nextNode]){
                    dist[nextNode]=newTime;
                    ways[nextNode]=ways[node];
                    pq.offer(new long[]{newTime,nextNode});
                }else if(newTime==dist[nextNode]){
                    ways[nextNode]=(ways[nextNode]+ways[node])%MOD;
                }
            }
        }
        return ways[n-1];
    }
}