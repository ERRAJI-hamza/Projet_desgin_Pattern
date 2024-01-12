package myproject.Aligner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import java.io.FileInputStream;


public class ManualMethode implements AlignerStrategy {

	
	  private Workbook workbookOne; private Workbook workbookTwo; private
	  Map<String, String> columnMappings; // pour stocker les correspondances de
	
	  
	  @Override public Workbook AlignerData(List<Workbook> data) {
			
			  System.out.print("Manuel Methode"); this.workbookOne = data.get(0);
			  this.workbookTwo = data.get(1);
			  
			  this.columnMappings = new HashMap<>(); detectAndAlignSchemas(); // faut
			  System.out.println("Colonnes similaires :");
		        for (Map.Entry<String, String> entry : columnMappings.entrySet()) {
		            System.out.println(entry.getKey() + " -> " + entry.getValue());
		        }
			  
			  return null;

	 }
  


    public void detectAndAlignSchemas() {
        Sheet sheetOne = workbookOne.getSheetAt(0); // obtenir la première feuille
        Sheet sheetTwo = workbookTwo.getSheetAt(0); // obtenir la première feuille de l'autre fichier

        
        
        
        
        Row headerRowOne = sheetOne.getRow(0); // supposer que la première ligne est l'en-tête
        Row headerRowTwo = sheetTwo.getRow(0);

        // Détecter les colonnes similaires et créer une carte de mappage
        for (Cell cellOne : headerRowOne) {
            for (Cell cellTwo : headerRowTwo) {
                if (isSimilar(cellOne.getStringCellValue(), cellTwo.getStringCellValue())) {
                        System.out.println(cellOne.getStringCellValue()+ "  " +  cellTwo.getStringCellValue() + "iiiiiiiiiis");

                    //le scolone semmelaire va mettre dans ce mapping 
                    columnMappings.put(cellOne.getStringCellValue(), cellTwo.getStringCellValue());
                }
            }
        }

       
    }

    private boolean isSimilar(String headerOne, String headerTwo) {
             System.out.println(headerOne + " " + headerTwo);
               int threshold = Math.max(headerOne.length(), headerTwo.length()) / 4;
        return levenshteinDistance(headerOne, headerTwo) <= threshold;
    }
    private int levenshteinDistance(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        // i == 0
        int[] costs = new int[b.length() + 1];
        for (int j = 0; j < costs.length; j++)
            costs[j] = j;
        for (int i = 1; i <= a.length(); i++) {
            // j == 0; nw == lev(i - 1, j)
            costs[0] = i;
            int nw = i - 1;
            for (int j = 1; j <= b.length(); j++) {
                int cj = Math.min(1 + Math.min(costs[j], costs[j - 1]), a.charAt(i - 1) == b.charAt(j - 1) ? nw : nw + 1);
                nw = costs[j];
                costs[j] = cj;
            }
        }
        return costs[b.length()];
    }
  



	


}
