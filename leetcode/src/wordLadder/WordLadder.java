package wordLadder;
import java.util.*;
public class WordLadder {
    public int ladderLength(String start, String end, HashSet<String> dict) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	Queue<String> q=new LinkedList<String>();
    	Queue<Integer> level =new LinkedList<Integer>();
    	q.add(start);
    	level.add(1);
    	dict.remove(start);
    	while(!q.isEmpty()){
    		String curr=q.remove();
    		int currLevel=level.remove();
    		if(curr.equals(end)) return currLevel;
    		Iterator<String> it=dict.iterator();
    		while(it.hasNext()){
    			String temp=it.next();
    			if(ajacent(temp,curr)){
    				q.add(temp);
    				level.add(currLevel+1);
    				it.remove();
    			}
    		}
    	}
      return 0;      
    }
 	public boolean ajacent(String a, String b){
 		int result=0;
 		if(a.length()!=b.length())
 			return false;
 		for(int i=0;i<a.length();i++){
 			if(a.charAt(i)!=b.charAt(i)){
 				result++;
 			}
 		}
 		return result==1;
		
	}
 	public static void main(String [] args){
 		String []list={"hit","hit"};
 	    HashSet<String> dict=new HashSet<String>();
 	    for(int i=0;i<list.length;i++){
 	    	dict.add(list[i]);
 	    }
 	   WordLadder test=new WordLadder();
 	   String start="hit";
 	   String end="hot";
 	   System.out.println(test.ladderLength(start, end, dict));
 	}

}
