import basicDependency.coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ie54553 on 18/09/2016.
 */
public class BeanScopeDemoApp {
	public static void main(String [] args){
		// ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		//
		// Coach theCoach1 = context.getBean("myCoach" , Coach.class);
		// Coach theCoach2 = context.getBean("myCoach" , Coach.class);
		//
		// System.out.println("equals " + theCoach1.equals(theCoach2));
		// System.out.println("== " + (theCoach1 == theCoach2));
		//
		// System.out.println(theCoach1);
		// System.out.println(theCoach2);


		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

		Coach theCoach1 = context.getBean("myCoach" , Coach.class);
		System.out.println(theCoach1.getDailyFortune());

		context.close();
	}
}
