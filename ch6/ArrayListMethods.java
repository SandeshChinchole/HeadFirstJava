import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {

		ArrayList<Egg> myList = new ArrayList<Egg>();
		
		Egg s = new Egg();
		
		myList.add(s);
		
		Egg b = new Egg();
		
		myList.add(b);
		
		System.out.println("size of ArrayList: " + myList.size());
		
		boolean isIn = myList.contains(b);
		
		System.out.println("b is in ArrayList: " + isIn);
		
		int index = myList.indexOf(b);
		
		System.out.println("index of b in ArrayList: " + index);
		
		boolean empty = myList.isEmpty();
		
		System.out.println("ArrayList is empty: " + empty);
		
		myList.remove(s);
		
		System.out.println("size of ArrayList after removing b: " + myList.size());
	}

}
