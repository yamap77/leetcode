package longestPalidrome;

/*base case:dp[i][i]=true dp[i][i+1]=true if(s[i]==s[i+1])
 * dp[i+1][j-1]==true&&s[i]==s[j]=>dp[i][j]==ture;
 * O(N*N)
 */
public class Solution {
	public String longestPalidrome(String s){
		if(s==null) return null;
		if(s.length()==0) return "";
		if(s.length()==1) return s;
		boolean [][]dp=new boolean[s.length()][s.length()];
		for(int i=0;i<s.length();i++)
			for(int j=0;j<s.length();j++){
				if(i==j)
					dp[i][j]=true;
				else if(j-i==1&&s.charAt(i)==s.charAt(j))
					dp[i][j]=true;
				else
					dp[i][j]=false;
				
			}
		int maxLen=1;
		int ir=-1;
		int il=-1;
		for(int i=s.length()-3;i>=0;i--)
			for(int j=i+2;j<s.length();j++){
				if(s.charAt(i)==s.charAt(j)&&dp[i+1][j-1]==true){
					dp[i][j]=true;
					if(j-i+1>maxLen){
						maxLen=j-i+1;
						ir=j;
						il=i;
					}
					else{
						dp[i][j]=false;
					}
				}
			}
		return s.substring(il, ir+1);
		
	}
	public static void main(String[] args){
		Solution test=new Solution();
		System.out.println(test.longestPalidrome(""));
		}



}
