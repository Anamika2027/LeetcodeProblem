import java.util.Arrays;
import java.util.Scanner;
class Solution {
    public void nextPermutation(int[] nums) {
        int x=nums[0];
        int y=nums[1];
        int z=nums[2];
        int a=Math.max(Math.max(x,y),z);
        int e;
        if(a==x){
            e=Math.max(y,z);
        }else if(a==y){
            e=Math.max(a,z);
        }else{
            e=Math.max(x,y);
        }
        int c=Math.min(x,y);
        int d=Math.min(c,z);

        if(x<=y && y<z ){
            nums[0]=x;
            nums[1]=z;
            nums[2]=y;
        }
        else if(x<y && y>z){
            nums[0]=y;
            nums[1]=x;
            nums[2]=z;
        }
        else if(x>y && y<z){
            nums[0]=x;
            nums[1]=z;
            nums[2]=y;
        }
        else{
            nums[0]=d;
            nums[1]=e;
            nums[2]=a;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[3];
        for(int i=0;i<3;i++){
            arr[i]=sc.nextInt();
        }
        Solution ob=new Solution();
        ob.nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
}