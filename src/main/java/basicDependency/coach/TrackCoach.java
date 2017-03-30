package basicDependency.coach;

import basicDependency.Fortune.FortuneService;
import basicDependency.Fortune.HappyFortuneService;

/**
 * Created by ie54553 on 15/09/2016.
 */
public class TrackCoach implements Coach {
	private FortuneService _fortuneService;

	public TrackCoach(HappyFortuneService happyFortuneService) {
		_fortuneService = happyFortuneService;
	}


	//init
	public void myInit(){
		System.out.println("Inside Init");
	}

	//destroy
	public void myDestroy(){
		System.out.println("Inside Destroy");
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 60 min";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it : " + _fortuneService.getFortune();
	}
}
