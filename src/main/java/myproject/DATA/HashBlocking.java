package myproject.DATA;

public class HashBlocking implements BlockingStrategy{
	
	
	public HashBlocking() {
		super();

	}

	@Override
	public String[] BlockingData(String[] data) {
		System.out.print("HashBlocking");
		return null;
	}

}
