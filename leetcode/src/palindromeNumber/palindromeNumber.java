package palindromeNumber;

public class palindromeNumber {
  public boolean isPalindromeNo(int x){
        int div=1;
        while(x/div>=10){
        	div *=10;
        }
        System.out.println(div);
        while(x!=0){
        	int l=x%10;
        	int r=x/div;
        	if(l!=r){
        		return false;
        	}
        	x = (x % div) / 10;     	
        	div /=100;
        }
        return true;
  }
  public static void main(String [] args){
	  palindromeNumber test=new palindromeNumber();
	  System.out.println(test.isPalindromeNo(1119339111));
  }
}
