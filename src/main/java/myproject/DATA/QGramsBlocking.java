package myproject.DATA;

public class QGramsBlocking implements BlockingStrategy{

	public QGramsBlocking() {
		super();
	}

	@Override
	public String[] BlockingData(String[] data) {
		System.out.print("Q-GameBlocking");
		return null;
	}

}
