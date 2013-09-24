package climbStairs;

public class Solution {
    public int climbStairs(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(n==0){
            return 1;
        }
        if(n==1){
            return 1;
        }
        int a=1;int b=1;
        for(int i=2;i<=n;i++){
            int temp=a+b;
            b=a;
            a=temp;
        }
        
        return a;
     
    }
}
