package autowire;

import org.springframework.stereotype.Component;

/**
 * Created by ie54553 on 18/09/2016.
 */
@Component
public class HappyFortuneService implements FortuneService {
	@Override
	public String getFortune() {
		return "Today is Sunday";
	}
}
