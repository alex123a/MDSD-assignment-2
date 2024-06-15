package math_expression;

public class Test27 {
	
	private External external; 
	 
	public Test27(External external) { 
		this.external = external;
	} 
	
	public int x;
	public int y;
	
	public void compute() {
		x = external.pi();
		y = (external.pi() + 2);
	}
	
	public interface External { 
		public int pi();
		
	}
}
