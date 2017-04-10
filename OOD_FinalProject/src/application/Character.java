/**
 * 
 */
package application;

/**
 * @author terre_000
 *
 */
public class Character extends ObjectDecorator{
	
	
	public Character(String i, String g) {
		super(i,g);
	}
	
	
	public String exec(){
		return super.load();
	}
	

}
