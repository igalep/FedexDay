package AnnotationDemo;

import org.springframework.stereotype.Component;

/**
 * Created by ie54553 on 18/09/2016.
 */
@Component
public class TennisCoach implements Coach{
	@Override
	public String getDailyWorkout() {
		return "Play Tennis";
	}
}
