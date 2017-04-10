
package application;

/**
 * @author terre_000
 *
 */
public class Archer_Decorator implements Class{
	
	@Override
	public String getBehavior(String b) {
		if (b == "altmer"){
			AltmerBehavior altmer = new AltmerBehavior();
			return altmer.Behavior();
		} else if (b == "argonian"){
			ArgonianBehavior argonian = new ArgonianBehavior();
			return argonian.Behavior();
		} else if (b == "bosmer"){
			BosmerBehavior bosmer = new BosmerBehavior();
			return bosmer.Behavior();
		} else if (b == "breton"){
			BretonBehavior breton = new BretonBehavior();
			return breton.Behavior();
		} else if (b == "dunmer"){
			DunmerBehavior dunmer = new DunmerBehavior();
			return dunmer.Behavior();
		} else if (b == "imperial"){
			ImperialBehavior imperial = new ImperialBehavior();
			return imperial.Behavior();
		} else if (b == "khajiit"){
			KhajiitBehavior khajiit = new KhajiitBehavior();
			return khajiit.Behavior();
		} else if (b == "nord"){
			NordBehavior nord = new NordBehavior();
			return nord.Behavior();
		} else if (b == "orsimer"){
			OrsimerBehavior orsimer = new OrsimerBehavior();
			return orsimer.Behavior();
		} else if (b == "redguard"){
			RedguardBehavior redguard = new RedguardBehavior();
			return redguard.Behavior();
		} else {
			return "This is the Archer base class. ";
		}
		
	}

	@Override
	public void getStats() {
		// TODO Auto-generated method stub
		
	}


}



