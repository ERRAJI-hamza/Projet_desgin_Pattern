package matching;

public class StrategyDistance implements MatchingStrategy{
	
	SimilariteChaine similariteChaine;
	
    public StrategyDistance(SimilariteChaine similariteChaine) {
    	this.similariteChaine = similariteChaine;
    }
	@Override
	public int Stratgie_choisi() {
		return 0;
	}

}
