package search2DMatrix;

public class Solution {
	   public boolean searchMatrix(int[][] matrix, int target) {
	        // Start typing your Java solution below
	        // DO NOT write main() function
		   int i=0;
		   int j=matrix[0].length-1;
		   while(i<matrix.length&&j>=0){
			   if(matrix[i][j]==target){
				   return true;
			   }
			   else if(matrix[i][j]>target){
				   j--;
			   }
			   else{
				   i++;
			   }
		   }
		   return false;
	    }
	   public static void main(String [] args){
		   Solution test=new Solution();
		   int[][] matrix={{1,3,5,7},{10,11,16,20},{23,30,34,50}};
		   int[][] testcast={{1}};
		   int target=0;
		   System.out.println(test.searchMatrix(matrix, target));
	   }

}
