package longestValieParenthese;

public class LongestValidParenthese {
    public int longestValidParentheses(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(s==null)
        return 0;
        int length=s.length();
        if(length==0)
        return 0;
        int []dp=new int[length];
        java.util.Arrays.fill(dp, 0); 
        dp[length-1]=0;
        int max=0;
        
        for(int i=length-2;i>=0;i--){
         if(s.charAt(i)=='('){
             int j=i+1+dp[i+1];
             if(j<length&&s.charAt(j)==')'){
             dp[i]=2+dp[i+1];
             if(j+1<length)
             dp[i]+=dp[j+1];
             }
         }
         max=Math.max(max,dp[i]);
        
        }
        return max;
    }

}
