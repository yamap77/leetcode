package shortestSegment;
import java.util.*;
import java.io.*;
public class findSegment {
	public String findShortestSegement(String[] s, String[] list){
	      Hashtable<String,Integer> hasFound=new Hashtable<String,Integer>();
	      Hashtable<String,Integer> needFound=new Hashtable<String,Integer>();
	      int count=0;
	      boolean found=false;
	      for(int i=0;i<list.length;i++){
	    	  hasFound.put(list[i], 0);
	    	  if(needFound.containsKey(list[i])){
	    		  needFound.put(list[i], needFound.get(list[i])+1);
	    	  }
	    	  else{
	    		  needFound.put(list[i], 1);
	    	  }
	      }
	      int right=Integer.MAX_VALUE;
	      int left=0;
	      int start=0;
	      int end=0;	      
	      while(end<s.length){
	    	  String tail=s[end].toLowerCase();
	    	  if(needFound.containsKey(tail)){
	    		  hasFound.put(tail, hasFound.get(tail)+1);    		  
	    		  if(hasFound.get(tail)<=needFound.get(tail)){
	    			  count++;
	    		  }
	    			  if(count>=list.length){
	    				  found=true;
	    				  while(true){
	    					  String head=s[start].toLowerCase();
	    					  if(!needFound.containsKey(head)){
	    						  start++;
	    					  }
	    					  else {
	    						  if(hasFound.get(head)>needFound.get(head)){
	    						  hasFound.put(head,hasFound.get(head)-1);
	    					       start++;
	    						  }
	    						  else
	    							  break;
	    				  }
	    				  }
	    				  if((end-start)<(right-left)){
	    				  right=end;
	    				  left=start;
	    				  }
	    			  }
	    		  
	    		  end++;
	    		  
	    	  }
	    	  else{
	    		  end++;
	    	  }
	      }
	      if(found==false){
	    	  return "NO SUBSEGMENT FOUND";
	      }
	      else{
	    	  String res="";
	    	  for(int i=0;i<(right-left+1);i++){
	    		  res=res+s[i+left]+" ";
	    	  }
	      return res;
	      }
	     
	}
	 public static void main(String args[] ) throws Exception {
		  //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         // String line = br.readLine();
         String paragraph="This is a test. This is a programming test. This is a programming test in any language.";
		 String str=paragraph.replaceAll("\\pP|\\pS", "");
		 String[] s=str.split(" ");
		 String[] list={"this","a","test","programming"};
		 findSegment test=new findSegment();
		 String result=test.findShortestSegement(s, list);
		 System.out.println(result);

		 /*
		  *      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String str=line.replaceAll("\\pP|\\pS", "");
        String[] s=str.split(" ");
            line=br.readLine();
            int k=Integer.parse(line);
            String[] list=new String[k];
            for(int i=0;i<k;i++){
                line=br.readline();
                list[i]=line.toLowerCase();
            }
		 Solution test=new Solution();
		 String result=test.findShortestSegement(s, list);
		 System.out.println(result);
    }
		  */
		 
	 
	 }

}
