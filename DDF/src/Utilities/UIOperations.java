package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UIOperations {

	public static WebDriver driver=null;
	public static WebElement element=null;
	
	
	public static boolean setBrowser(String brname)
	{
	try{
		if(brname.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
			
		/*else if (brname.equalsIgnoreCase("chrome"))
		{
			System.setProperty(key, value)
		}*/
		/*else if (brname.equalsIgnoreCase("ie"))
		{
			System.setProperty(key, value)
		}*/
			
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		return true;
		
	}
	
	public static boolean setURL(String URL)
	{
		
		try{
			if (URL!="" && URL!=null)
			{
				driver.get(URL);
			}
			
		}
		
		catch(Exception E)
		{System.out.println(E.getMessage());}
		return true;
		
		
	}
	
	
	public static boolean setText(String LocType,String LocValue,String Val)
	{
		
		try{
			
			if(LocType.equalsIgnoreCase("id"))
			{
				element=driver.findElement(By.id(LocValue));
				
			}
			else if(LocType.equalsIgnoreCase("name"))
			{
				element=driver.findElement(By.name(LocValue));
			}
			if(element.isDisplayed() && element.isEnabled())
			{
				element.sendKeys(Val);
			}
		}
		
		catch(Exception E)
		{
			
			System.out.println(E.getMessage());
		}
		return true;
				
	}
	
	public static boolean clickButton(String LocType,String LocValue)
	{
		
		try
		{
			if(LocType.equalsIgnoreCase("id"))
			{
				element=driver.findElement(By.id(LocValue));
				
			}
			else if(LocType.equalsIgnoreCase("name"))
			{
				element=driver.findElement(By.name(LocValue));
			}
			else if(LocType.equalsIgnoreCase("xpath"))
			{
				element=driver.findElement(By.xpath(LocValue));
			}
			
			if(element.isDisplayed() && element.isEnabled())
			{
				element.click();
			}
			
		}
		
		catch(Exception E)
		{
			
			System.out.println(E.getMessage());
		}
		
		return true;
		
		
	}
}
