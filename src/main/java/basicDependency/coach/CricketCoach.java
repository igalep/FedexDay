package basicDependency.coach;

import basicDependency.Fortune.FortuneService;

/**
 * Created by ie54553 on 18/09/2016.
 */
public class CricketCoach implements Coach{
	private FortuneService _FortuneService;


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	private String email;
	private String team;


	public CricketCoach() {
		System.out.println("we are inside cricketClass constructor");
	}

	@Override
	public String getDailyWorkout() {
		return "Practice bowling";
	}

	@Override
	public String getDailyFortune() {
		return _FortuneService.getFortune();
	}

	public void setFortuneService(FortuneService _FortuneService) {
		this._FortuneService = _FortuneService;
	}
}
