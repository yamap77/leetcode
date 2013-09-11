package iterator;
import java.util.*;
public class IterateHash {
	public static void main(String[] args){
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		map.put(1, 2);
		map.put(2, 1);
		map.put(3, 3);
		Iterator<Integer> it=map.keySet().iterator();
		while(it.hasNext()){
			System.out.println(map.get(it.next()));
		}
		
	}

}
