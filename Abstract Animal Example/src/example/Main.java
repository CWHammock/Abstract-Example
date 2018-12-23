/**
 * 
 */
package example;

/**
 * @author charles
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Animal fido = new Dog("Fido", 4);
		Animal garfield = new Cat("Garfield", 4);
		System.out.println(fido.eats());
		System.out.println(fido.makesNoise());
		System.out.println("---------------------");
		System.out.println(garfield.eats());
		System.out.println(garfield.makesNoise());
		System.out.println("---------------------");
		((Dog)fido).wagTail();
		((Cat)garfield).purr();
		System.out.println("---------------------");
		System.out.println(((Animal)fido).eats());
		System.out.println(((Animal)garfield).eats());
		System.out.println("---------------------");

		
		

	}

}
