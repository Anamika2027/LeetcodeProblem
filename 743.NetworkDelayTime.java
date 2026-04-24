class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        
        List<List<int[]>> adj=new ArrayList<>();
        for(int i=0;i<n;i++)adj.add(new ArrayList<>());
        for(int[] e:times)adj.get(e[0]).add(new int[]{e[1],e[2]});

        PriorityQueue<int[]> pq=new PriorityQueue<>(
            (a,b)->a[0]-b[0]
        );
        int[] dist=new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        pq.offer(new int[]{0,k});

        while(!pq.isEmpty()){
            int[] curr=pq.poll();
            int node=curr[1];
            int time=curr[0];

            for(int[] nei:adj.get(node)){
                int newTime=time+nei[1];
                if(newTime<dist[nei[0]]){
                    dist[nei[0]]=newTime;
                    pq.offer(new int[]{newTime,nei[0]});
                }
            }
        }
        int max=0;
        for(int i=1;i<=n;i++){
            if(dist[i]==Integer.MAX_VALUE) return -1;
            max=Math.max(max,dist[i]);
        }
        return max;
    }
}