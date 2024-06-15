package math_expression;

public class Test28 {
	
	private External external; 
	 
	public Test28(External external) { 
		this.external = external;
	} 
	
	public int x;
	public int y;
	
	public void compute() {
		x = external.sqrt(4);
		y = (external.sqrt(4) * 2);
	}
	
	public interface External { 
		public int sqrt(int a);
		
	}
}
