
public class Dog {

	String name;
	
	public static void main(String[] args) {
		
		//create a dog object
		
		Dog dog1 = new Dog();
		dog1.bark();
		dog1.name = "Bart";
		
		//create a dog array
		
		Dog[] myDogs = new Dog[3];
		
		//put some dogs in it
		
		myDogs[0] = new Dog();
		myDogs[1] = new Dog();
		myDogs[2] = dog1;
		
		//access dogs using array references
		
		myDogs[0].name = "Fred";
		myDogs[1].name = "Marge";
		
		System.out.println("The last dog's name is " + myDogs[2].name);
		
		//loop through the array and tell all dogs to bark
		
		int x = 0;
		
		while(x < myDogs.length) {
			myDogs[x].bark();
			
			x = x + 1;
		}
		
	}
	
	public void bark() {
		System.out.println(name + " says Ruff!");
	}

}
