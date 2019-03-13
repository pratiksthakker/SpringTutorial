package spring.core.inversionofcontrol;

import spring.core.dependencyinjection.FortuneService;

public class TrackCoach implements Coach {

	//Here is an example of Dependency Injections since the Spring Configuration initializes and injects the relevant bean(implementation) for us
		FortuneService myFortuneService;
		
		//Constructor Dependency Injection , check the application Context to see how its configured
		public TrackCoach(FortuneService theFortuneService) {
			myFortuneService = theFortuneService;
		}
		
		
	@Override
	public String getDailyWorkOut() {

		return "Run For 30 mins or 5KM Whichever is later";
	}

	@Override
	public String getDailyFortune() {
		
		return "Track Coach Fortune - " + myFortuneService.getFortune();
	}

}
