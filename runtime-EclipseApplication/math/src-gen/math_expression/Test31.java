package math_expression;

public class Test31 {
	
	private External external; 
	 
	public Test31(External external) { 
		this.external = external;
	} 
	
	public int x;
	public int y;
	
	public void compute() {
		x = 5;
		y = (2 + external.pow((5 - 3),(3 * 2)));
	}
	
	public interface External { 
		public int pow(int a,int b);
		
	}
}
