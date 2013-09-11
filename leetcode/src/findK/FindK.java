package findK;

public class FindK {
	 public static class Point {

		    public double x;

		    public double y;

		  }
}
	public class Compare{
		boolean operator()(Point a,Point b){
			return a.x*a.x+a.y*a.y < b.x*b.x+b.y*b.y;
		}
	}

}
