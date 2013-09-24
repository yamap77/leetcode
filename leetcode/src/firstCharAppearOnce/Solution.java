package firstCharAppearOnce;
import java.util.*;
public class Solution {
	public char firstChar(String a){
		HashMap<Character,Integer> map=new HashMap<Character, Integer>();
		for(int i=0;i<a.length();i++){
			if(map.containsKey(a.charAt(i))){
				map.put(a.charAt(i), map.get(a.charAt(i))+1);
			}
			else{
				map.put(a.charAt(i), 1);
			}
		}
		for(int i=0;i<a.length();i++){
			if(map.get(a.charAt(i))==1){
				return a.charAt(i);
			}
		}
		return 0;
	}
	
	public static void main(String []args){
		Solution test=new Solution();
		System.out.print(test.firstChar("aabccd"));
	}

}
