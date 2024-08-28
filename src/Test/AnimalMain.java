package Test;

class Animal{
	public void sound() {
		System.out.println("Sound of Animal");
	}
}
	class Dog extends Animal{
		public void sound() {
			System.out.println("Sound of dog, bark bark");
		}
	}
	class AnimalMain{
	public static void main(String[]args) {
		Animal animal = new Animal();
		animal.sound();
		
		Dog dog = new Dog();
		dog.sound();
	}
}
	