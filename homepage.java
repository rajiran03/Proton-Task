package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import org.openqa.selenium.*;

public class homepage extends baseClass{
	
	//WebDriver driver;
	@FindBy(xpath="//input[@id='username']")//Enter the userName
	WebElement userName;
	
	@FindBy(xpath="//input[@id='password']")//Enter the password
	WebElement password;
	
	@FindBy(xpath="//button[contains(text(),'Sign in')]")//Click sign in
	WebElement loginBtn;

	@FindBy(xpath="//button[contains(text(),'Add folder')]")//Click the Plus button in folder and try to create a folder
	WebElement addFolderBtn;
	
	@FindBy(xpath="//input[@placeholder=\"Folder name\"]")//name the folder 
	WebElement folderNameInput;
	
	@FindBy(xpath="//button[contains(text(),'Save')]")//save the folder 
	WebElement saveBtn;
	
	
	@FindBy(xpath="//body/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/main[1]/div[1]/section[1]/div[1]/ul[1]/li[2]/div[1]/div[1]/div[3]/div[1]/div[1]/button[2]")
	WebElement findFolderName;
	

	@FindBy(xpath="//button[contains(text(),'Delete')]")//Delete the created folder
	WebElement deleteFolderBtn;
	
	@FindBy(xpath="//button[contains(text(),'Add label')]")//Click the Plus button in Label and try to create a Label
	WebElement addLabelBtn;
	
	@FindBy(xpath="//input[@placeholder=\"Label name\"]")//name the Label
	WebElement labelNameInput;
	
	@FindBy(xpath="//button[contains(text(),'Save')]")//save the Label
	WebElement saveBtn;
	
	@FindBy(xpath="//button[contains(text(),'Edit')]")//Edit the Label name
	WebElement editBtn;
	
	@FindBy(xpath="//span[contains(text(),'Labels')]")//Click the folder and open the created Label
	WebElement deleteFolderBtn;
	
	
	public homepage() {
		//super();
		PageFactory.initElements(driver, this);
	}
	
	public void login() {
		//super();
		userName.sendkeys("Rajirangarajan01@proton.me");
		password.sendkeys("Catchme@2022");
		loginBtn.click();
	}
	
	public boolean addFolder(){
	
		
		addFolderBtn.Click();
		folderNameInput.sendKeys("New Folder Raji");
		saveBtn.Click();
		
		return true;
	
		}
	
	public boolean addLabel(){
		
			
			addLabelBtn.Click();
			labelNameInput.sendKeys("New label Test");
			saveBtn.Click();
			
			return true;
		
			}
		
	public boolean editLabelname(){
			
				
			    editBtn.Click();
				labelNameInput.sendKeys("New name label Test 1");
				saveBtn.Click();
				
				return true;
			
				}
			
     public boolean editFoldername(){
				
					
					editBtn.Click();
					folderNameInput.sendKeys("New name folder Raji 1");
					saveBtn.Click();
					
					return true;
				
				}		
       public boolean deleteFoldername(){
				
				
        	  findFolderName.Click();
        	  deleteFolderBtn.Click();//select the delete option
        	  deleteFolderBtn.Click();//Click the delete confirmation
        	 	
				
				return true;
			
			}		
 }
				
				
