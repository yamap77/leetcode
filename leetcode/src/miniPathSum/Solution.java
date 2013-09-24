package miniPathSum;

public class Solution {
    public int minPathSum(int[][] grid) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	int[][] path=new int[grid.length][grid[0].length];
    	path[0][0]=grid[0][0];
    	for(int i=1;i<grid[0].length;i++){
    		path[0][i]=path[0][i-1]+grid[0][i];
    	}
    	for(int j=1;j<grid.length;j++){
    		path[j][0]=path[j-1][0]+grid[j][0];
    	}
    	for(int i=1;i<grid[0].length;i++)
    		for(int j=1;j<grid.length;j++){
    			path[i][j]=Math.max(path[i-1][j], path[i][j-1]);
    		}
    	return path[grid.length-1][grid[0].length];
        
    }

}
