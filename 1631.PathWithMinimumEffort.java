class Solution {
  
    public int minimumEffortPath(int[][] heights) {
        
        int rows=heights.length;
        int cols=heights[0].length;

        int[][] directions={
            {0,-1},{0,1},{-1,0},{1,0}
        };

        PriorityQueue<int[]> pq=new PriorityQueue<>(
            (a,b)->a[0]-b[0]
        );

        int[][] efforts=new int[rows][cols];
        for(int[] row:efforts){
            Arrays.fill(row,Integer.MAX_VALUE);
        }
        pq.offer(new int[]{0,0,0});
        efforts[0][0]=0;

        while(!pq.isEmpty()){
            int curr[]=pq.poll();
            int currEffort=curr[0];
            int r=curr[1];
            int c=curr[2];

            if(r==rows-1 && c==cols-1) return currEffort;
            for(int[] d:directions){
                int nr=r+d[0];
                int nc=c+d[1];

                if(nr>=0&&nc>=0&&nr<rows&&nc<cols){
                    int edgeDiff=Math.abs(heights[r][c]-heights[nr][nc]);
                    int newEfforts=Math.max(currEffort,edgeDiff);
                

                if(newEfforts<efforts[nr][nc]){
                    efforts[nr][nc]=newEfforts;
                    pq.offer(new int[]{newEfforts,nr,nc});
                }
                }
            }
            
        }
        return 0;

    }
}