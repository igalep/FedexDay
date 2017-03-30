import autowire.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ie54553 on 18/09/2016.
 */
public class AutoWireDemoApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnnotation.xml");

		TennisCoach theCoach = context.getBean("tennisCoach" , TennisCoach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());

		context.close();
	}
}
