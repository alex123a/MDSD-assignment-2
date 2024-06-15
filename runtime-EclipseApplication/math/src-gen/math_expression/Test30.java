package math_expression;

public class Test30 {
	
	private External external; 
	 
	public Test30(External external) { 
		this.external = external;
	} 
	
	public int x;
	
	public void compute() {
		x = external.sqrt(external.pow(external.pi(),2));
	}
	
	public interface External { 
		public int pow(int a,int b);
		
		public int sqrt(int a);
		
		public int pi();
		
	}
}
