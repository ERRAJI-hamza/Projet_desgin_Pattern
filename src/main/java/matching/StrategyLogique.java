package matching;

public class StrategyLogique implements MatchingStrategy{
	
    SimilariteChaine similariteChaine;
	
    public StrategyLogique(SimilariteChaine similariteChaine) {
    	this.similariteChaine = similariteChaine;
    }

	@Override
	public int Stratgie_choisi() {
		// TODO Auto-generated method stub
		this.similariteChaine.distance();
		return 0;
	}

}
