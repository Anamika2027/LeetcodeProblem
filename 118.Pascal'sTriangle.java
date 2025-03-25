import java.util.Scanner;
class Solution {
    public List<List<Integer>> generate(int numRows) {//What is List<List<Integer>>?
                                                    // List<List<Integer>> is a list of lists, meaning each element of the outer list is another list.
                                                    // In this case, it is used to store Pascal’s Triangle, where each row is a List<Integer>, and the entire triangle is stored in List<List<Integer>>.
        List<List<Integer>> arr=new ArrayList<>();//ArrayList is used to store multiple rows of Pascal’s Triangle dynamically
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