package generateParen;
import java.util.*;
public class GenerateParen {
    public ArrayList<String> generateParenthesis(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
  
        ArrayList<String> res=new ArrayList<String>();
        if(n==0)
        return res;
        else{
        String s="";
        getParenthesis(n,n,res,s);
        }
        return res;
        
    }
        public void getParenthesis(int left, int right, ArrayList<String>res, String s){
        if(left==0&&right==0){
        res.add(s);
        return;
        }
        if(left==0){
            getParenthesis(0,right-1,res,s+")");
        }
        else if(left>0){
           getParenthesis(left-1,right,res,s+"(");
           if(right>left){
               getParenthesis(left,right-1,res,s+")");
           }
        }
    }

}
