package json;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import matching.DistanceJaccard;
import matching.FunctionMatching;
import matching.MatchingStrategy;
import matching.Naive;
import matching.SimilariteChaine;
import matching.StrategyLogique;
import myproject.Exel;
import myproject.ReadData;
import myproject.Aligner.AlignerData;
import myproject.Aligner.ManualMethode;
import myproject.DATA.BlockingStrategy;
import myproject.DATA.DataFilter;
import myproject.DATA.HashBlocking;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.core.async.BlockingQueueFactory;
import org.apache.poi.ss.usermodel.Workbook;
public class Myclass {
	
	public static void main(String[] args) {
		/*
		 * Data d = new JsonData(); d.ReadData();
		 */
		
		SimilariteChaine sa = new DistanceJaccard();
		
		MatchingStrategy m = new StrategyLogique(sa);
		
		FunctionMatching ff = new Naive(m);
		
		
		DataFactory d =new ExcelFactory();
		Data dd = d.creatData("excel");
		AlignerData ad = new AlignerData(new ManualMethode());
		ad.AddData((Workbook)dd.ReadData("C:\\\\Users\\\\user\\\\Documents\\\\atelierHafidi.xlsx"));
		ad.AddData((Workbook)dd.ReadData("C:\\\\Users\\\\user\\\\Documents\\\\atelierHafidi.xlsx"));
		Workbook data = ad.applyAlignerStrategy();
		System.out.println(data);
		BlockingStrategy b = new HashBlocking();
		DataFilter f = new DataFilter();
		f.setBs(b);
		String[] s = {"a","b","c"};
		String[] ss =f.getBs().BlockingData(s);
		
		ff.matchung();
		
		
		
    }
}
