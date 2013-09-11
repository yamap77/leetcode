package coinChange;
import java.util.*;
public class MakeCoinChange {
	public int makeChange(int n, int coin){
		int next_coin=0;
		switch(coin){
		case 25:
			next_coin=10;
			break;
		case 10:
			next_coin=5;
			break;
		case 5:
			next_coin=1;
			break;
		case 1:
			return 1;
			
		}
		int ways=0;
		for(int i=0;i*coin<=n;i++){
			ways +=makeChange(n-coin*i,next_coin);
		}
		return ways;
		
	}
	public static void main(String[] args){
		MakeCoinChange test=new MakeCoinChange();
		System.out.println(test.makeChange(10, 25));
	}

}
