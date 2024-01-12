package matching;

public class Naive implements FunctionMatching{
	
	MatchingStrategy matchingStrategy;
	
	public Naive(MatchingStrategy matchingStrategy){
		this.matchingStrategy = matchingStrategy;
	}

	@Override
	public int matchung() {
		// TODO Auto-generated method stub
		this.matchingStrategy.Stratgie_choisi();
		return 0;
	}

}
