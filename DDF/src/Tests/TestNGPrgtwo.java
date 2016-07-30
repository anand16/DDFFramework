package Tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

import Constants.ConstantValues;
import Utilities.UIOperations;
import XLOperations.XLFunctions;

public class TestNGPrgtwo {

	
	@Test
	public void SecondPage() throws IOException
	
	{
		FileInputStream fin=new FileInputStream(ConstantValues.Propfile);
		Properties pr=new Properties();
		pr.load(fin);
		Sleeper.sleepTightInSeconds(10);
		String pr_password=pr.getProperty("passwordid");
		String pr_button2=pr.getProperty("signinbuttonid");
		XLFunctions.setExcel(ConstantValues.XLFile, "Sheet1");
		String Password=XLFunctions.getExcelData(1, 1);
		//UIOperations.setBrowser("firefox");
		//UIOperations.setURL(ConstantValues.URL);
		UIOperations.setText("id", pr_password, Password);
		UIOperations.clickButton("id", pr_button2);
		
		
		
	}
}
