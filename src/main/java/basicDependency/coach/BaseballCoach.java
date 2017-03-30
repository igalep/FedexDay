package basicDependency.coach;

import basicDependency.Fortune.FortuneService;

/**
 * Created by ie54553 on 15/09/2016.
 */
public class BaseballCoach implements Coach {
	private FortuneService _fortuneService;
	public BaseballCoach(FortuneService fortuneService){
		_fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout(){
		return "Spend 30 min";
	}

	@Override
	public String getDailyFortune() {
		return _fortuneService.getFortune();
	}
}
