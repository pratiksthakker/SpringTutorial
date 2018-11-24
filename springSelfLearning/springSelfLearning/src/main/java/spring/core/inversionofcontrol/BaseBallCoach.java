package spring.core.inversionofcontrol;

public class BaseBallCoach implements Coach {

	@Override
	public String getDailyWorkOut() {
		return "Spend 40 mins of practice ";
	}

}
