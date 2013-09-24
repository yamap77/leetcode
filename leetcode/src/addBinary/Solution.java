package addBinary;

public class Solution {
	   public String addBinary(String a, String b) {
	        // Start typing your C/C++ solution below
	        // DO NOT write int main() function
		   int i=a.length()-1;
		   int j=b.length()-1;
		   int carry=0;
		   StringBuilder res=new StringBuilder();
		   while(i>=0&&j>=0){
			   if(a.charAt(i)=='0'&&b.charAt(j)=='0'){
				   if(carry==0){
					   res.append('0');
				   }
				   else{
					   res.append('1');
					   carry=0;
				   }
			   }
			   else if(a.charAt(i)=='1'&&b.charAt(j)=='1'){
				   if(carry==0){
					   res.append('0');
					   carry=1;
				   }
				   else{
					   res.append('1');
				   }
			   }
			   else{
				   if(carry==1){
					   res.append('0');				   
				   }
				   else{
					   res.append('1');
				   }
			   }
			   i--;j--;
		   }
		   if(i>=0){
			   while(i>=0){
				   res.append(a.charAt(i));
				   i--;
			   }
		   }
		   else if(j>=0){
			   while(j>=0){
				   res.append(b.charAt(j));
				   j--;
			   }
			   
		   }
		   if(carry==1)
			   res.append('1');
		   return new String(res.reverse());
	        
	    }
	   public static void main(String [] args){
		   String a="11111111";
		   String b="10";
		   Solution test=new Solution();
		   System.out.println(test.addBinary(a, b));
	   }

}
