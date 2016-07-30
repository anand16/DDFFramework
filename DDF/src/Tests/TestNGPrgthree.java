package Tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

import Constants.ConstantValues;
import Utilities.UIOperations;
import XLOperations.XLFunctions;

public class TestNGPrgthree {
    @Test
	public void ThirdPage() throws IOException
	{
	FileInputStream fin=new FileInputStream(ConstantValues.Propfile);
	Properties pr=new Properties();
	pr.load(fin);
	Sleeper.sleepTightInSeconds(120);
	String xpathtologout=pr.getProperty("xpathbutton");
	UIOperations.clickButton("xpath", xpathtologout);
	}
}
