package spring.core.dependencyinjection;

public class HappyFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		return "Happy Fortune";
	}

}
