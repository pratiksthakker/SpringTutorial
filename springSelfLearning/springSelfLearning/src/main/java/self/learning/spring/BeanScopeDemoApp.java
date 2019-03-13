package self.learning.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.core.inversionofcontrol.Coach;

public class BeanScopeDemoApp {
	
	public static void main(String args[])
	{
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScopeApplicationContext.xml");
		
		Coach iocCoach = context.getBean("myCoach", Coach.class);//Singleton
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
        System.out.println("Are myCoach Bean Same -- "+iocCoach.equals(theCoach)); //address same so the pointing to same object so myCoach bean is actually singleton 		
		
        
        Coach trachCoach = context.getBean("myTrackCoach", Coach.class);//protoype
		Coach alphaTrackCoach = context.getBean("myTrackCoach", Coach.class);
		
        System.out.println("Are myTrackCoach Bean Same -- "+trachCoach.equals(alphaTrackCoach));//since the scope in the config is defined as prototype the address will be different
        
        
        
        
        context.close(); 
		
		
	}
	

}
