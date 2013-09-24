package NonRepeatSubseque;
import java.util.*;
public class NonRepeatSubseque {
	
  /*  public int lengthOfLongestSubstring(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(s==null)
        return 0;
        boolean [] dic=new boolean[256];
        for(int i=0;i<256;i++){
            dic[i]=false;
            
        }
        char [] str=s.toCharArray();
        int length=s.length();
        int max=0;
        if(length==0)
        return 0;
        int start=0;
        int end=0;
        while(end<length){
            if(dic[str[end]]==false){
                dic[str[end]]=true;
                end++;
            }
            else{
                for(int i=start;i<end;i++){
                   dic[str[i]]=false;                  
                }
                max=Math.max(max,end-start);
                //System.out.println("a: "+start+" "+end);
                 start=end;                
                 
            }
            
        }
        max=Math.max(max,end-start);
       // System.out.println("b: "+start+" "+end);
        return max;
        
    }*/
	/*
	 * start=0 end=0; scan the string from start keep end
	 */
	
	public int lengthOfLongestSubstring(String s) {
		boolean [] dic=new boolean[256];
		for(int i=0;i<256;i++)
		{
			dic[i]=false;
		}
		int start=0;
		int end=0;
		int max=0;
		while(end<s.length()){
			if(dic[s.charAt(end)]){
				for(int j=start;j<end;j++){
					dic[s.charAt(j)]=false;
					
				}				
				max=Math.max(max, end-start);
				start=end;
			
				}
				else{
					dic[s.charAt(end)]=true;
					end++;
				}
			}
		max=Math.max(max,end-start);//very important!!!!!!
		return max;
		}
		
	
    public static void main(String [] args){
    	NonRepeatSubseque test=new NonRepeatSubseque();
    	System.out.println(test.lengthOfLongestSubstring("abbbbax"));
    }

}
