package crossbrowsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parallellaunch {

	public static WebDriver driver;
	 // @Test
	  @Parameters("launch")
	  public void print(String n)   // n recieves the value from xml file
	  {
		  System.out.println(n);
		  if(n.equals("chrome"))    //chrome is value in parallellaunch.xml
		  {
			  WebDriverManager.chromedriver().setup();
			  driver=new ChromeDriver();
		  }
		  else 
		  {
			 WebDriverManager.firefoxdriver().setup();
			 driver= new FirefoxDriver();
		  }
		  driver.get("https://www.zomato.com/");
	  }
	}

