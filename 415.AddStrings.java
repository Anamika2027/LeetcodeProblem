class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder ans=new StringBuilder();
        int n1=num1.length();
        int n2=num2.length();
        
        int i=n1-1;
        int j=n2-1;
        int carry=0;
       
        while(i>=0 || j>=0){
            int a=(i>=0)? num1.charAt(i)-'0' :0;
            int b=(j>=0)? num2.charAt(j)-'0' :0;
            int add=a+b+carry;
            carry=add/10;
            add=add%10;
            ans.append(add);
            i--;
            j--;
        }

        while(carry>0){
            ans.append(carry);
            carry=carry/10;
        }
        return ans.reverse().toString();       

    }
}