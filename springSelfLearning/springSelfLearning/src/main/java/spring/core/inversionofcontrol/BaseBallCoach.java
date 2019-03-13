package spring.core.inversionofcontrol;

import spring.core.dependencyinjection.FortuneService;

public class BaseBallCoach implements Coach {

	//Here is an example of Dependency Injections since the Spring Configuration initializes and injects the relevant bean(implementation) for us
	FortuneService myFortuneService;
	
	//Constructor Dependency Injection , check the application Context to see how its configured
	public BaseBallCoach(FortuneService theFortuneService) {
		myFortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkOut() {
		return "Spend 40 mins of practice ";
	}

	@Override
	public String getDailyFortune() {
		return myFortuneService.getFortune();
	}

}
