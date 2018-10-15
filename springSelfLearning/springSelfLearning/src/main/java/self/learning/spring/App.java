package self.learning.spring;

import spring.demo.first.BaseBallCoach;
import spring.demo.first.Coach;
import spring.demo.first.TrackCoach;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Coach coach = new BaseBallCoach(); 
    	Coach coach = new TrackCoach(); 
        System.out.println(coach.getDailyWorkOut());
    }
}
