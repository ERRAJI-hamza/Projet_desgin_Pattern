package myproject.DATA;

public class StandardaBlocking implements BlockingStrategy{

	public StandardaBlocking() {
		super();
	}
	@Override
	public String[] BlockingData(String[] data) {
		System.out.print("Q-GameBlocking");
		return null;
	}

	

}
