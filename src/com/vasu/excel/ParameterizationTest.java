package com.vasu.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ParameterizationTest 
{

	public void selTraining(String student1,String student2)
	{
		System.out.println("First Student is : "+student1);
		System.out.println("Second Student is : "+student2);
	}
	public static void main(String[] args) throws Exception 
	{
		ParameterizationTest v=new ParameterizationTest();
		 File srcFile=new File("C:\\Users\\vasu\\Desktop\\TestData.xlsx");
		  
		  FileInputStream fis=new FileInputStream(srcFile);
		  
		  XSSFWorkbook  wb=new XSSFWorkbook(fis);
		  
		  XSSFSheet ws=wb.getSheet("Sheet1");
		  
		  int rcnt=ws.getLastRowNum();
		  for (int i = 1; i <=rcnt; i++)
		  {
			  String student1=ws.getRow(i).getCell(0).getStringCellValue();
			  String student2=ws.getRow(i).getCell(1).getStringCellValue();
			  v.selTraining(student1, student2);
		}
		 
		
		
		

	}

}
