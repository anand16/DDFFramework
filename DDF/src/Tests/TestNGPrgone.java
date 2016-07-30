package Tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import Utilities.UIOperations;
import XLOperations.XLFunctions;
import Constants.ConstantValues;

public class TestNGPrgone {
	@Test
	public void FirstPage() throws IOException
	
	{
		FileInputStream fin=new FileInputStream(ConstantValues.Propfile);
		Properties pr=new Properties();
		pr.load(fin);

		String UserName=pr.getProperty("username1d");
        System.out.println(UserName);
		String pr_button1=pr.getProperty("firstbuttonid");
		XLFunctions.setExcel(ConstantValues.XLFile, "Sheet1");
		String User=XLFunctions.getExcelData(1, 0);
		System.out.println(User);
		UIOperations.setBrowser("firefox");
		UIOperations.setURL(ConstantValues.URL);
		UIOperations.driver.manage().window().maximize();
		UIOperations.setText("id", UserName, User);
		UIOperations.clickButton("id", pr_button1);
		
		
		
	}

}
