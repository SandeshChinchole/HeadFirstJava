
public class WhileLoop {

	public static void main(String[] args) {

		int x = 1;
		
		System.out.println("This is before the loop");
		
		while(x<4) {
			System.out.println("In the loop");
			System.out.println("the value of x is " + x);
			x = x + 1;
		}
		
		System.out.println("This is after the loop");
	}

}
