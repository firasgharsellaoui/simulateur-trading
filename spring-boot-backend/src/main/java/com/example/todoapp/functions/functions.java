package com.example.todoapp.functions;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import com.example.todoapp.functions.db;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.HeaderColumnNameMappingStrategy;
public class functions {
	public static double action(String op,String currency,int amount,String begin,String end) {
		double b=0;
		double e = 0;
		double spread=0;
		double diff=0;
		if (op=="buy") { spread=0.001;
			
		}
		else {spread=0.0007;}
		try {
			CSVReader reader = new CSVReader(new FileReader("C:\\Users\\21620\\tt\\spring-boot-backend\\src\\main\\java\\com\\example\\todoapp\\functions\\forexdb.csv"));
		
		HeaderColumnNameMappingStrategy<db> forexStrategy = new HeaderColumnNameMappingStrategy<db>();
		forexStrategy.setType(db.class);
		CsvToBean<db> csvToBean = new CsvToBean<db>();

		@SuppressWarnings("deprecation")
		List<db> forex = csvToBean.parse(forexStrategy, reader);
		
		for (db dto : forex) {
		   if(dto.getDate().toString().equals(begin)) {
			   switch(currency) {
				case "EUR_USD_Close":  b=dto.getEUR_USD_Close();
				break;
		        case "EUR_USD_High":  b=dto.getEUR_USD_High();
		        break;
				case "EUR_USD_Low":  b=dto.getEUR_USD_Low();
				break;
		    
				case "USD_JPY_Close":  b=dto.getUSD_JPY_Close();
				break;
		      
				case "USD_JPY_High":  b=dto.getUSD_JPY_High();
				break;
				case "USD_JPY_Low":  b=dto.getUSD_JPY_Low();
				break;
				case "USD_CHF_Close":  b=dto.getUSD_CHF_Close();
				break;
				case "USD_CHF_High":  b=dto.getUSD_CHF_High();
				break;
				case "USD_CHF_Low":  b=dto.getUSD_CHF_Low();
				break;
				case "GBP_USD_Close":  b=dto.getGBP_USD_Close();
				break;
				case "GBP_USD_High":  b=dto.getGBP_USD_High();
				break;
				case "GBP_USD_Low":  b=dto.getGBP_USD_Low();
				break;
				case "USD_CAD_Close": b=dto.getUSD_CAD_Close();
				break;
				case "USD_CAD_High":  b=dto.getUSD_CAD_High();
				break;
				case "USD_CAD_Low":  b=dto.getUSD_CAD_Low();
				break;
				case "EUR_GBP_Close":  b=dto.getEUR_GBP_Close();
				break;
				case "EUR_GBP_High":  b=dto.getEUR_GBP_High();
				break;
				case "EUR_GBP_Low":  b=dto.getEUR_GBP_Low();
				break;
		        case "EUR_JPY_Close":  b=dto.getEUR_JPY_Close();
		        break;
				case "EUR_JPY_High":  b=dto.getEUR_JPY_High();
				break;
				case "EUR_JPY_Low":  b=dto.getEUR_JPY_Low();
				break;
				case "EUR_CHF_Close":  b=dto.getEUR_CHF_Close();
				break;
				case "EUR_CHF_High":  b=dto.getEUR_CHF_High();
				break;
				case "EUR_CHF_Low":  b=dto.getEUR_CHF_Low();
				break;
				case "AUD_USD_Close":  b=dto.getAUD_USD_Close();
		        break;
				case "AUD_USD_High":  b=dto.getAUD_USD_High();
				break;
				case "AUD_USD_Low":  b=dto.getAUD_USD_Low();
		        break;
				case "GBP_JPY_Close":  b=dto.getGBP_JPY_Close();
				break;
				case "GBP_JPY_High":  b=dto.getGBP_JPY_High();
		        break;
				case "GBP_JPY_Low":  b=dto.getGBP_JPY_Low();
				break;
				case "CHF_JPY_Close":  b=dto.getCHF_JPY_Close();
				break;
				case "CHF_JPY_High":  b=dto.getCHF_JPY_Close();
				break;
				case "CHF_JPY_Low":  b=dto.getCHF_JPY_Low();
				break;
				case "GBP_CHF_Close":  b=dto.getGBP_CHF_Close();
				break;
				case "GBP_CHF_High":  b=dto.getGBP_CHF_High();
				break;
				case "GBP_CHF_Low":  b=dto.getGBP_CHF_Low();
				break;
				case "NZD_USD_Close":  b=dto.getNZD_USD_Close();
				break;
				case "NZD_USD_High":  b=dto.getNZD_USD_High();
				break;
				case "NZD_USD_Low":  b=dto.getNZD_USD_Low();
				break;
				}
			   e=dto.getEUR_USD_Close();
			    System.out.println("b found");
		   }
		   if(dto.getDate().toString().equals(end)) {
			   switch(currency) {
				case "EUR_USD_Close":  e=dto.getEUR_USD_Close();
				break;
		        case "EUR_USD_High":  e=dto.getEUR_USD_High();
		        break;
				case "EUR_USD_Low":  e=dto.getEUR_USD_Low();
				break;
		    
				case "USD_JPY_Close":  e=dto.getUSD_JPY_Close();
				break;
		      
				case "USD_JPY_High":  e=dto.getUSD_JPY_High();
				break;
				case "USD_JPY_Low":  e=dto.getUSD_JPY_Low();
				break;
				case "USD_CHF_Close":  e=dto.getUSD_CHF_Close();
				break;
				case "USD_CHF_High":  e=dto.getUSD_CHF_High();
				break;
				case "USD_CHF_Low":  e=dto.getUSD_CHF_Low();
				break;
				case "GBP_USD_Close":  e=dto.getGBP_USD_Close();
				break;
				case "GBP_USD_High":  e=dto.getGBP_USD_High();
				break;
				case "GBP_USD_Low":  e=dto.getGBP_USD_Low();
				break;
				case "USD_CAD_Close": e=dto.getUSD_CAD_Close();
				break;
				case "USD_CAD_High":  e=dto.getUSD_CAD_High();
				break;
				case "USD_CAD_Low":  e=dto.getUSD_CAD_Low();
				break;
				case "EUR_GBP_Close":  e=dto.getEUR_GBP_Close();
				break;
				case "EUR_GBP_High":  e=dto.getEUR_GBP_High();
				break;
				case "EUR_GBP_Low":  e=dto.getEUR_GBP_Low();
				break;
		        case "EUR_JPY_Close":  e=dto.getEUR_JPY_Close();
		        break;
				case "EUR_JPY_High":  e=dto.getEUR_JPY_High();
				break;
				case "EUR_JPY_Low":  e=dto.getEUR_JPY_Low();
				break;
				case "EUR_CHF_Close":  e=dto.getEUR_CHF_Close();
				break;
				case "EUR_CHF_High":  e=dto.getEUR_CHF_High();
				break;
				case "EUR_CHF_Low":  e=dto.getEUR_CHF_Low();
				break;
				case "AUD_USD_Close":  e=dto.getAUD_USD_Close();
		        break;
				case "AUD_USD_High":  e=dto.getAUD_USD_High();
				break;
				case "AUD_USD_Low":  e=dto.getAUD_USD_Low();
		        break;
				case "GBP_JPY_Close":  e=dto.getGBP_JPY_Close();
				break;
				case "GBP_JPY_High":  e=dto.getGBP_JPY_High();
		        break;
				case "GBP_JPY_Low":  e=dto.getGBP_JPY_Low();
				break;
				case "CHF_JPY_Close":  e=dto.getCHF_JPY_Close();
				break;
				case "CHF_JPY_High":  e=dto.getCHF_JPY_Close();
				break;
				case "CHF_JPY_Low":  e=dto.getCHF_JPY_Low();
				break;
				case "GBP_CHF_Close":  e=dto.getGBP_CHF_Close();
				break;
				case "GBP_CHF_High":  e=dto.getGBP_CHF_High();
				break;
				case "GBP_CHF_Low":  e=dto.getGBP_CHF_Low();
				break;
				case "NZD_USD_Close":  e=dto.getNZD_USD_Close();
				break;
				case "NZD_USD_High":  e=dto.getNZD_USD_High();
				break;
				case "NZD_USD_Low":  e=dto.getNZD_USD_Low();
				break;
				}
			   e=dto.getEUR_USD_Close();

			    System.out.println("e found");
		   }
		  // System.out.println(dto.getDate().toString());
		}
		
		
		}
		catch (FileNotFoundException exception) {
			// TODO Auto-generated catch block
			exception.printStackTrace();
		}
		if (op=="buy") { spread=0.001;diff=e-b;}
		else {spread=0.0007;diff=1/e-1/b;}
		System.out.println(e);
		System.out.println(b);
		System.out.println(amount*(diff-spread));
		return(amount*(diff-spread));
		
	}
	public static double indicators (String ind,String currency) {
		double a=0;
		try {
			CSVReader reader = new CSVReader(new FileReader("C:\\Users\\21620\\tt\\spring-boot-backend\\src\\main\\java\\com\\example\\todoapp\\functions\\results.csv"));
		
		HeaderColumnNameMappingStrategy<db> forexStrategy = new HeaderColumnNameMappingStrategy<db>();
		forexStrategy.setType(db.class);
		CsvToBean<db> csvToBean = new CsvToBean<db>();
		
		@SuppressWarnings("deprecation")
		List<db> forex = csvToBean.parse(forexStrategy, reader);
		int indicator=0;
		if (ind=="average") {indicator=0;}
		if (ind=="minimum") {indicator=1;}
		if (ind=="maximum") {indicator=2;}
		if (ind=="std") {indicator=3;}
		switch(currency) {
		case "EUR_USD_Close":  a=forex.get(indicator).getEUR_USD_Close();
		break;
        case "EUR_USD_High":  a=forex.get(indicator).getEUR_USD_High();
        break;
		case "EUR_USD_Low":  a=forex.get(indicator).getEUR_USD_Low();
		break;
    
		case "USD_JPY_Close":  a=forex.get(indicator).getUSD_JPY_Close();
		break;
      
		case "USD_JPY_High":  a=forex.get(indicator).getUSD_JPY_High();
		break;
		case "USD_JPY_Low":  a=forex.get(indicator).getUSD_JPY_Low();
		break;
		case "USD_CHF_Close":  a=forex.get(indicator).getUSD_CHF_Close();
		break;
		case "USD_CHF_High":  a=forex.get(indicator).getUSD_CHF_High();
		break;
		case "USD_CHF_Low":  a=forex.get(indicator).getUSD_CHF_Low();
		break;
		case "GBP_USD_Close":  a=forex.get(indicator).getGBP_USD_Close();
		break;
		case "GBP_USD_High":  a=forex.get(indicator).getGBP_USD_High();
		break;
		case "GBP_USD_Low":  a=forex.get(indicator).getGBP_USD_Low();
		break;
		case "USD_CAD_Close": a=forex.get(indicator).getUSD_CAD_Close();
		break;
		case "USD_CAD_High":  a=forex.get(indicator).getUSD_CAD_High();
		break;
		case "USD_CAD_Low":  a=forex.get(indicator).getUSD_CAD_Low();
		break;
		case "EUR_GBP_Close":  a=forex.get(indicator).getEUR_GBP_Close();
		break;
		case "EUR_GBP_High":  a=forex.get(indicator).getEUR_GBP_High();
		break;
		case "EUR_GBP_Low":  a=forex.get(indicator).getEUR_GBP_Low();
		break;
        case "EUR_JPY_Close":  a=forex.get(indicator).getEUR_JPY_Close();
        break;
		case "EUR_JPY_High":  a=forex.get(indicator).getEUR_JPY_High();
		break;
		case "EUR_JPY_Low":  a=forex.get(indicator).getEUR_JPY_Low();
		break;
		case "EUR_CHF_Close":  a=forex.get(indicator).getEUR_CHF_Close();
		break;
		case "EUR_CHF_High":  a=forex.get(indicator).getEUR_CHF_High();
		break;
		case "EUR_CHF_Low":  a=forex.get(indicator).getEUR_CHF_Low();
		break;
		case "AUD_USD_Close":  a=forex.get(indicator).getAUD_USD_Close();
        break;
		case "AUD_USD_High":  a=forex.get(indicator).getAUD_USD_High();
		break;
		case "AUD_USD_Low":  a=forex.get(indicator).getAUD_USD_Low();
        break;
		case "GBP_JPY_Close":  a=forex.get(indicator).getGBP_JPY_Close();
		break;
		case "GBP_JPY_High":  a=forex.get(indicator).getGBP_JPY_High();
        break;
		case "GBP_JPY_Low":  a=forex.get(indicator).getGBP_JPY_Low();
		break;
		case "CHF_JPY_Close":  a=forex.get(indicator).getCHF_JPY_Close();
		break;
		case "CHF_JPY_High":  a=forex.get(indicator).getCHF_JPY_Close();
		break;
		case "CHF_JPY_Low":  a=forex.get(indicator).getCHF_JPY_Low();
		break;
		case "GBP_CHF_Close":  a=forex.get(indicator).getGBP_CHF_Close();
		break;
		case "GBP_CHF_High":  a=forex.get(indicator).getGBP_CHF_High();
		break;
		case "GBP_CHF_Low":  a=forex.get(indicator).getGBP_CHF_Low();
		break;
		case "NZD_USD_Close":  a=forex.get(indicator).getNZD_USD_Close();
		break;
		case "NZD_USD_High":  a=forex.get(indicator).getNZD_USD_High();
		break;
		case "NZD_USD_Low":  a=forex.get(indicator).getNZD_USD_Low();
		break;
		}
			
		
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(a);
		return(a);
		
	}
	
	public static double test(String ind,String pair) {
	List<String[]> rowList = new ArrayList<String[]>();
	try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\21620\\tt\\spring-boot-backend\\src\\main\\java\\com\\example\\todoapp\\functions\\results.csv"))) {
	    String line;
	    while ((line = br.readLine()) != null) {
	        String[] lineItems = line.split(",");
	        rowList.add(lineItems);
	    }
	    br.close();
	}
	catch(Exception e){
	    // Handle any I/O problems
	}
	String[][] matrix = new String[rowList.size()][];
	for (int i = 0; i < rowList.size(); i++) {
	    String[] row = rowList.get(i);
	    matrix[i] = row;
	}
	//for (int i=0 ; i< rowList.size();i++) {
		//if(matrix[0][i].equals("2012-07-30"))
	int indicator=0;
	if (ind=="average") {indicator=1;}
	if (ind=="minimum") {indicator=2;}
	if (ind=="maximum") {indicator=3;}
	if (ind=="std") {indicator=4;}
	int a=0;
	switch(pair) {
	case "EUR_USD_Close":  a=1;
break;
    case "EUR_USD_High":  a=2;
	case "EUR_USD_Low":  a=3;

	case "USD_JPY_Close":  a=4;
	case "USD_JPY_High":  a=5;
	case "USD_JPY_Low":  a=6;
  
	case "USD_CHF_Close":  a=7;
	case "USD_CHF_High":  a=8;
	case "USD_CHF_Low":  a=9;
    
	case "GBP_USD_Close":  a=10;
    
	case "GBP_USD_High":  a=11;
   
	case "GBP_USD_Low":  a=12;
    
	case "USD_CAD_Close": a=13;
    
	case "USD_CAD_High":  a=14;
    
	case "USD_CAD_Low":  a=15;
   
	case "EUR_GBP_Close":  a=16;
    
	case "EUR_GBP_High":  a=17;
   
	case "EUR_GBP_Low":  a=18;
   
    case "EUR_JPY_Close":  a=19;
   
	case "EUR_JPY_High":  a=20;
   
	case "EUR_JPY_Low":  a=21;
   
	case "EUR_CHF_Close":  a=22;
   
	case "EUR_CHF_High":  a=23;
   
	case "EUR_CHF_Low":  a=24;
   
	case "AUD_USD_Close":  a=25;
	case "AUD_USD_High":  a=26;
	case "AUD_USD_Low":  a=27;
   
	case "GBP_JPY_Close":  a=28;

	case "GBP_JPY_High":  a=29;
   
	case "GBP_JPY_Low":  a=30;
	
	case "CHF_JPY_Close":  a=31;
	case "CHF_JPY_High":  a=32;
	case "CHF_JPY_Low":  a=33;
	
	case "GBP_CHF_Close":  a=34;

	case "GBP_CHF_High":  a=35;
	case "GBP_CHF_Low":  a=36;
	case "NZD_USD_Close":  a=37;
	case "NZD_USD_High":  a=38;
	case "NZD_USD_Low":  a=39;
	break;
	default: break;
	}

	System.out.println(Double.parseDouble(matrix[indicator][a]));
	System.out.println(matrix[4][8]+"***"+a);
	return(Double.parseDouble(matrix[indicator][a]));
	
	
	}
	/*public String test() {
	"if ((var Code = Java.type('com.example.todoapp.functions.functions');var result = Code.indicators('std','EUR_USD_Close');print(result);) <= 0) {\n  print('1');\n} else {\n  print('2');\n}\n"
	}*/
}




