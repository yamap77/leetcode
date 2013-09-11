package phoneLetterCom;
import java.util.*;
public class Solution {
	 private char[][] map = new char[][] { { 'a', 'b', 'c' }, { 'd', 'e', 'f' },
				{ 'g', 'h', 'i' }, { 'j', 'k', 'l' }, { 'm', 'n', 'o' },
				{ 'p', 'q', 'r', 's' }, { 't', 'u', 'v'}, { 'w', 'x', 'y', 'z' } };
	public ArrayList<String> findLetterCom(String digits){		
		ArrayList<String> res=new ArrayList<String>();
		StringBuilder s=new StringBuilder();
		letterCom(digits,0,s,res);
		return res;
		
		
	}
	private void letterCom(String digits, int i, StringBuilder s,ArrayList<String> res){
		if(s.length()==digits.length()){
			res.add(s.toString());
		}
		else{
			int index=Character.getNumericValue(digits.charAt(i))-1;
			int size=map[index].length;
		for(int j=0;j<size;j++){
			s.append(map[index][j]);
			letterCom(digits,i+1,s,res);
			s.deleteCharAt(s.length()-1);
		}

		}
		
	}
	public static void main(String[] args){
		Solution test=new Solution();
		ArrayList<String> result=test.findLetterCom("23");
		for(int i=0;i<result.size();i++){
			System.out.println(result.get(i));
		}
	}

}
