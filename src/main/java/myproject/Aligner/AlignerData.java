package myproject.Aligner;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Workbook;

import myproject.ReadData;

public class AlignerData {
	AlignerStrategy as;
	List<Workbook> data;


	public AlignerData(AlignerStrategy as) {
		data = new ArrayList<Workbook>();
		this.as = as;

	}
	public void AddData(Workbook data) {
		this.data.add(data);
	}
	public Workbook applyAlignerStrategy() {
		if(data.size() >1 && as instanceof PasAlignementSchemaStrategie) {
			throw new Error("there is more then one data here should modifier stratigy utiliser");
		}
		else if(data.size() <=1 && !(as instanceof PasAlignementSchemaStrategie)) {
			throw new Error("there is only one data here should modifier stratigy utiliser");
		}
		return as.AlignerData(this.data);
	}
}
