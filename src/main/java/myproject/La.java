package myproject;

import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import myproject.Aligner.AlignerData;
import myproject.Aligner.ManualMethode;
import myproject.Aligner.PasAlignementSchemaStrategie;

public class La {

	public static void main(String[] args ) {
		ReadData rd = new ReadData();
		rd.setBs(new Exel());
		AlignerData ad = new AlignerData(new ManualMethode());
		ad.AddData(rd.applyReader("C:\\\\Users\\\\ousss\\\\Downloads\\\\atelierHafidi.xlsx"));
		ad.AddData(rd.applyReader("C:\\\\Users\\\\ousss\\\\Downloads\\\\atelierHafidi2.xlsx"));
		Workbook data = ad.applyAlignerStrategy();
		System.out.println(data);
	}
}