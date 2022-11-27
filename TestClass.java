package org.openqa.selenium.copy;

import org.testng.Assert;

import com.qa.pages.homepage;

public class TestClass extends baseClass{
	public homepage home;
	public baseClass base;
	
	@BeforeTest
	public setup() {
		super.driver;
		home.login();//Login the page by entering user credentials folder and create a folder
	}
	
	@test
	public PR1createFolder{
		Assert.assertTrue(home.addFolder(),"could not add folder");//this will validate the createdFolder
		
	}
	
	@test
	public PR2editFolder{
		Assert.assertTrue(home.editFoldername(),"could not edit folder");//this will validate created Folder is editable or not
		
	}
	
	@test
	public PR3createLabel{
		Assert.assertTrue(home.addLabel(),"could not add label");//this will validate the createdLabel
		
	}
	
	@test
	public PR4editLabel{
		Assert.assertTrue(home.editLabelname(),"could not edit label");//this will validate created label is editable or not
		
	}
	
	@AfterTest
	public tearDown() {
		driver.quit();//close the Login page
	}
	}
