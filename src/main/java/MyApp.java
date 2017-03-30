import basicDependency.coach.SpringTestClass1;
import basicDependency.coach.SpringTestClass2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ie54553 on 15/09/2016.
 */
public class MyApp {
	public static void main(String[] args){

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		//dependency injection

		// Coach theCoach = context.getBean("myCoach" , Coach.class);
		// System.out.println(theCoach.getDailyWorkout());
		// System.out.println(theCoach.getDailyFortune());
		//
		// Coach trackCoach = context.getBean("trackCoach" , Coach.class);
		// System.out.println(trackCoach.getDailyWorkout());
		// System.out.println(trackCoach.getDailyFortune());
		//

		//setter dependency

		// CricketCoach cricketCoach = context.getBean("myCricketCoach" , CricketCoach.class);
		// System.out.println(cricketCoach.getDailyWorkout());
		// System.out.println(cricketCoach.getDailyFortune());
		// System.out.println(cricketCoach.getEmail());
		// System.out.println(cricketCoach.getTeam());

		//regular interface

		// Coach basicDependency.coach = new BaseballCoach();
		// System.out.println(basicDependency.coach.getDailyWorkout());
		//
		// basicDependency.coach = new TrackCoach();
		// System.out.println(basicDependency.coach.getDailyWorkout());


		SpringTestClass1 springClass1 = context.getBean("springClass1" , SpringTestClass1.class);
		SpringTestClass2 springClass2 = context.getBean("springClass2" , SpringTestClass2.class);

		springClass2.print();
		System.out.println("-------------------------------");

		springClass1.printMap();
		System.out.println("-------------------------------");

		springClass2.print();


		context.close();
	}
}
