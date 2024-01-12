package myproject.Aligner;

import java.util.List;

import org.apache.poi.ss.usermodel.Workbook;

public interface AlignerStrategy {
	public Workbook  AlignerData(List<Workbook> data);

}
