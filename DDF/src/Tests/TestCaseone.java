package Tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.server.browserlaunchers.Sleeper;

import Utilities.UIOperations;
import XLOperations.XLFunctions;
import Constants.ConstantValues;

public class TestCaseone {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream fin=new FileInputStream(ConstantValues.Propfile);
Properties pr=new Properties();
pr.load(fin);

String UserName=pr.getProperty("username1d");
System.out.println("");
String Usernamebutton=pr.getProperty("firstbuttonid");
String Password=pr.getProperty("passwordid");
String SigninButton=pr.getProperty("signinbuttonid");

XLFunctions.setExcel(ConstantValues.XLFile, "Sheet1");
String u_name=XLFunctions.getExcelData(1, 0);
String p_word=XLFunctions.getExcelData(1, 1);

UIOperations.setBrowser("firefox");
UIOperations.setURL(ConstantValues.URL);
UIOperations.setText("id", UserName,u_name);
UIOperations.clickButton("id", Usernamebutton);
Sleeper.sleepTightInSeconds(10);
UIOperations.setText("id", Password, p_word);
UIOperations.clickButton("id", SigninButton);





	}

}
