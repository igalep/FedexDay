package basicDependency.Fortune;

/**
 * Created by ie54553 on 15/09/2016.
 */
public class HappyFortuneService implements FortuneService {
	@Override
	public String getFortune() {
		return "Today is weekend";
	}
}
