/**
 * 
 */
package example;

/**
 * @author charles
 *
 */
public class Cat extends Animal{
	
	public Cat(String name, int legs) {
		super(name, legs);
	}

	@Override
	public String eats() {
		return this.getName() + " eats cat food...";
	}

	@Override
	public String makesNoise() {
		return this.getName() + " Meow Meow.....";
	}
	
	public void purr() {
		System.out.println("Cat purrrs");
	}
	
	

}
