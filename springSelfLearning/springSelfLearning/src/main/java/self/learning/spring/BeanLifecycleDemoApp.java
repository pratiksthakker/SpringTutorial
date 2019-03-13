package self.learning.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.core.inversionofcontrol.Coach;

public class BeanLifecycleDemoApp {
	
	public static void main(String args[])
	{
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifecycleApplicationContext.xml");
		
		Coach iocCoach = context.getBean("myTrackCoach", Coach.class);
		
		System.out.println(iocCoach.getDailyFortune());
		
		System.out.println("Shutting Down");
        context.close(); 
		
		
	}
	

}
