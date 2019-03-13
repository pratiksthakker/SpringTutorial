package spring.core.inversionofcontrol;

public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkOut() {

		return "Run For 30 mins or 5KM Whichever is later";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
