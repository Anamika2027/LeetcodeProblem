import java.util.Scanner;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> row = new ArrayList<>();

            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    row.add(1);
                }else{
                    row.add(arr.get(i-1).get(j-1)+arr.get(i-1).get(j));
                }   
            }
             arr.add(row);
        }
        return arr;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Solution ob=new Solution();
        List<List<Integer>> result = ob.generate(n);
        for (List<Integer> row : result) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}