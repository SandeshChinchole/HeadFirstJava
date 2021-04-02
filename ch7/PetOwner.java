
public class PetOwner {

	public static void main(String[] args) {

		Vet v = new Vet();
		
		Dog d = new Dog();
		
		Cat c = new Cat();
		
		System.out.println("Dog gets the shot");
		v.giveShot(d);
		
		System.out.println("Cat gets the shot");
		v.giveShot(c);
	}

}
