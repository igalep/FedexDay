import AnnotationDemo.TennisCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ie54553 on 18/09/2016.
 */
public class AnnotationDemoApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnnotation.xml");

		TennisCoach theCoach = context.getBean("tennisCoach" , TennisCoach.class);
		System.out.println(theCoach.getDailyWorkout());

		context.close();
	}
}
