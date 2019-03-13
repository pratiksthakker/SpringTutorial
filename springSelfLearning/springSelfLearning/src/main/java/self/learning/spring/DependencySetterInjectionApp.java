package self.learning.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.core.inversionofcontrol.CricketCoach;

public class DependencySetterInjectionApp {
	
	public static void main(String args[])
	{
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach iocCoach = context.getBean("myCricketCoach", CricketCoach.class); // what implementation would be picked up is configured in the applicationContext.xml

		System.out.println(iocCoach.getDailyWorkOut());// IOC
		
		System.out.println(iocCoach.getDailyFortune());//DI
		
		System.out.println(iocCoach.getEmailAddress());//DI
		System.out.println(iocCoach.getTeam());//DI
		
		
		context.close(); 
		
		
	}
	

}
