package spring.core.inversionofcontrol;

import spring.core.dependencyinjection.FortuneService;

public class CricketCoach implements Coach {

	FortuneService myFortuneService;//Here we will use Setter Dependency Injection to Inject this bean
	
	private String emailAddress;//Literal Value Injection
	private String team;//Literal Value Injection
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

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
