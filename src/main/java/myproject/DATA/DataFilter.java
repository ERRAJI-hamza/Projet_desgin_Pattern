package myproject.DATA;

public class DataFilter {
	BlockingStrategy bs;
	
	public DataFilter() {

	}
	public BlockingStrategy getBs() {
		return bs;
	}
	public void setBs(BlockingStrategy bs) {
		this.bs = bs;
	}
	public String[] applyBlockingStrategy(String[] data) {
		return bs.BlockingData(data);
	}
}
