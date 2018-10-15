package self.learning.spring;

import spring.demo.first.BaseBallCoach;
import spring.demo.first.Coach;
import spring.demo.first.TrackCoach;

/**
 * Hello world!s
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Coach coach = new BaseBallCoach(); 
    	/*
    	 * Here we see that even though Coach is a interface we have to define what kind of Object is actually initiaed (BaseBallCoach)
    	 * So in order to avoid this (kind of hard coding) we will use Inversion of Control
    	 */
    	Coach coach = new TrackCoach(); 
        System.out.println(coach.getDailyWorkOut());
    }
}
