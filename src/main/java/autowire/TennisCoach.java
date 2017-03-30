package autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by ie54553 on 18/09/2016.
 */
@Component
public class TennisCoach implements Coach {
	@Autowired
	private FortuneService _fortuneService;

	// @Autowired
	// public TennisCoach(FortuneService _fortuneService) {
	// 	this._fortuneService = _fortuneService;
	// 	System.out.println("inside constructor");
	// }

	public TennisCoach() {
		System.out.println("Inside default constructor");
	}



	@Override
	public String getDailyWorkout() {
		return "Play Tennis";
	}

	@Override
	public String getDailyFortune() {
		return "Plays Soccer";
	}

	@Autowired
	public void foo(FortuneService _fortuneService){
		this._fortuneService = _fortuneService;
		System.out.println("inside foo");
	}
}
