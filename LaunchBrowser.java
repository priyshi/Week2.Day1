package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LaunchBrowser {

	public static void main(String[] args) {
	
		
		//setup / manage / download driver version automatically
		WebDriverManager.chromedriver().setup();
		
		//create a new object for ChromeDriver using which we will deal with controlling the browser
		//This will LAUNCH the chrome browser 
		ChromeDriver driver = new ChromeDriver();
		
		//maximize as default will be a small window
		driver.manage().window().maximize();
		
		//load a specific url
		//driver.get("https://google.com");
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		String title = driver.getTitle();
		
		//driver.close();
		
		WebElement userName= driver.findElement(By.id("username"));
		userName.sendKeys("demosalesmanager");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		
		WebElement loginButton= driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();
		
		WebElement crmsfaLink = driver.findElement(By.linkText("CRM/SFA"));
		crmsfaLink.click();
		
		// Leads Tab - > CreateLead
				WebElement leadsTab = driver.findElement(By.linkText("Leads"));
				leadsTab.click();

				WebElement createLeadButton = driver.findElement(By.linkText("Create Lead"));
				createLeadButton.click();

				// Fill the details
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test leaf");
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Priya Shine");
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("D");
				driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Priya");
				driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("D");
				driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Single");
				driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("09/20/98");
				driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Miss");
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
				driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("400000");
				driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("1000");
				driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("2");
				driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("Yes");
				driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium");
				driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Switch to another company");
				WebElement countryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
				countryCode.clear();
				countryCode.sendKeys("4");						
				driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("32");
				driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9677103928");
				driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("198");
				driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Shine");
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("priyabharathi@gmail.com");
				driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.testleaf.com");
				driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Priya");
				//driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Bharu");
				//driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("N0 31, Nehru Street");
				//driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Near Skywalk");
				//driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("chennai");
				//driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600049");
				//driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("49");
				
				WebElement createLeadSubmit = driver.findElement(By.className("smallSubmit"));
				createLeadSubmit.click();
                
				driver.close();
	}
				
	}


