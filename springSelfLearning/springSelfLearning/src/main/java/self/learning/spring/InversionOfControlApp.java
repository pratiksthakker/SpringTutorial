package self.learning.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.core.inversionofcontrol.Coach;

public class InversionOfControlApp {
	
	public static void main(String args[])
	{
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach iocCoach = context.getBean("myCoach", Coach.class); // what implementation would be picked up is configured in the applicationContext.xml

		System.out.println(iocCoach.getDailyWorkOut());// IOC
		
		System.out.println(iocCoach.getDailyFortune());//DI
		
		
		context.close(); 
		
		
	}
	

}
