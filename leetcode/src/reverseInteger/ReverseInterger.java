package reverseInteger;
import java.util.*;
public class ReverseInterger {
   public int reverseInt(int a){	  
	   int res=0;
	   while(a!=0){
		   int temp=a%10;
		   res=res*10+temp;
		   a=a/10;
	   }
	   return res;
   }
   public static void main(String []args){
	   int a=-779802;
	   ReverseInterger test=new ReverseInterger();
	   System.out.println(test.reverseInt(a));
   }
}
