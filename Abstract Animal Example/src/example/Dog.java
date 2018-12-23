/**
 * 
 */
package example;

/**
 * @author charles
 *
 */
public class Dog extends Animal{
	
	public Dog(String name, int legs) {
		super(name, legs);
		
	}

	@Override
	public String eats() {
		return this.getName() + " eats some dog food...";
		
	}

	@Override
	public String makesNoise() {
		return this.getName() + " Bark Bark....";
		
	}
	
	public void wagTail() {
		System.out.println("Dog wags its tail");
	}
	
	

}
