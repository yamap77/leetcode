package sortByPriority;
import java.util.*;
public class SortByPriority {
	public String sortByPriority(String a, String base){
		if(base==null||base.length()==0)
			return a;
		StringBuilder res=new StringBuilder();
		Hashtable<Character,Integer> table=new Hashtable<Character,Integer>();
		HashSet<Character> dic=new HashSet<Character>();
		for(int i=0;i<base.length();i++){
			dic.add(base.charAt(i));
		}
		for(int i=0;i<a.length();i++){
			char cur=a.charAt(i);
			if(!dic.contains(cur)){
				res.append(cur);
			}
			else{
			if(table.containsKey(cur)){
				table.put(cur, table.get(cur)+1);
			}
			else{
				table.put(cur, 1);
			}
			}
		}
		for(int j=0;j<base.length();j++){
			if(table.containsKey(base.charAt(j))){
				for(int k=0;k<table.get(base.charAt(j));k++){
					res.append(base.charAt(j));
				}
				table.remove(base.charAt(j));
			}
		}
		Iterator<Character> it=table.keySet().iterator();
		while(it.hasNext()){
			res.append(it.next());
		}
		return res.toString();
	}
	public static void main(String [] args){
		String a="yyccbsdaxyz";
		String base="yxab";
		SortByPriority test=new SortByPriority();
		String result=test.sortByPriority(a, base);
		System.out.println(result);
	}

}
