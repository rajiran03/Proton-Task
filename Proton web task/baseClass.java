package org.openqa.selenium.copy;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseClass {
	
	webDriver driver;
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajalakashmi\\Downloads\\chromedriver_win32.zip");//Go to the Local path of my chromeDriver installed
		 driver =new ChromeDriver();
		driver.get("https://account.proton.me/u/0/mail/folders-labels");//Login to proton mail
		driver.manage().window().maximize();//Proton mail page will be maximized in chrome

}
