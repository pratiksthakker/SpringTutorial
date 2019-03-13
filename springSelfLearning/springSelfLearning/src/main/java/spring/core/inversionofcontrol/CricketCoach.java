package spring.core.inversionofcontrol;

import spring.core.dependencyinjection.FortuneService;

public class CricketCoach implements Coach {

	FortuneService myFortuneService;//Here we will use Setter Dependency Injection to Inject this bean
	
	public FortuneService getMyFortuneService() {
		return myFortuneService;
	}

	//wiil be used for Setter Injection , check the context xml file
	public void setMyFortuneService(FortuneService myFortuneService) {
		this.myFortuneService = myFortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "Spend atleast 45 mins on Fielding practice daily";
	}

	@Override
	public String getDailyFortune() {
		return "Cricket Coach Fortune -- "+ myFortuneService.getFortune();
	}

}
