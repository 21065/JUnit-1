import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JafarianiYounesLab8 {
	
private static  WebDriver driver = null;
	
	@BeforeAll
	public static void setup() {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	
	    Logger.getLogger("").setLevel(Level.OFF);
	    driver = new ChromeDriver();
	    
	    System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true"); 
	}
	
	@AfterAll
	public static void teardown() {
		driver.close();
	}
	
	@Test
	void TestHomePageUrl() {
		String baseUrl = "http://demo.guru99.com/test/newtours/";
        driver.get(baseUrl);
        String expectedUrl = "http://demo.guru99.com/test/newtours/" ;
        assertEquals(baseUrl, expectedUrl);
                 
	}
	
	@Test
	void TestRegisterLink() throws Exception 
	{
		String RegisterUrl = "http://demo.guru99.com/test/newtours/register.php";
		driver.get(RegisterUrl);
        WebElement registerLink = driver.findElement(By.cssSelector("a[href='"+"register.php"+"']"));
        registerLink.click();
        
        //fill the first name box
    	String firsNameR = "Younes";
        WebElement textBox = driver.findElement(By.name("firstName"));
        textBox.sendKeys(firsNameR);
        
        //fill the last name box
    	String lastNameR = "Jafariani";
        WebElement textBox2 = driver.findElement(By.name("lastName"));
        textBox2.sendKeys(lastNameR);
        
        //fill the phone box
    	String phoneNumber= "519";
        WebElement textBox3 = driver.findElement(By.name("phone"));
        textBox3.sendKeys(phoneNumber);
        
        
        //fill the email box
    	String email= "yj@yahoo.com";
        WebElement textBox4 = driver.findElement(By.name("userName"));
        textBox4.sendKeys(email);
        
        
        //fill the address box
    	String address= "01 wonderland rd";
        WebElement textBox5 = driver.findElement(By.name("address1"));
        textBox5.sendKeys(address);
        
        
        //fill the city box
    	String city= "London";
        WebElement textBox6 = driver.findElement(By.name("city"));
        textBox6.sendKeys(city);
        
        
        //fill the state/province box 
    	String province= "ON";
        WebElement textBox7 = driver.findElement(By.name("state"));
        textBox7.sendKeys(province);
        
        
        //fill the postal code box 
    	String postalCode= "6H";
        WebElement textBox8 = driver.findElement(By.name("postalCode"));
        textBox8.sendKeys(postalCode);
        
        
        //choose the country 
        Select country = new Select (driver.findElement(By.name("country")));
        country.selectByValue("CANADA");
       
        
        //fill the user name box 
     	String userName= "abc";
        WebElement textBox9 = driver.findElement(By.name("email"));
        textBox9.sendKeys(userName);
       
        
        String passWord= "123";
        WebElement textBox10 = driver.findElement(By.name("password"));
        textBox10.sendKeys(passWord);
        
        
        String confirmPassword= "123";
        WebElement textBox11 = driver.findElement(By.name("confirmPassword"));
        textBox11.sendKeys(confirmPassword);
        
        
        //find the search button by name
        WebElement submitButton = driver.findElement(By.name("submit"));
        submitButton.click();
        Thread.sleep(2000);
                
	}
	
	@Test
	void TestFlightsUrl() throws Exception  {
		String FlightsUrl = "http://demo.guru99.com/test/newtours/reservation.php";
        driver.get(FlightsUrl);
        
        
      //choose the trip type
        WebElement radio1 = driver.findElement(By.name("tripType"));
        radio1.click();
        
        
        //choose the passengers numbers 
         Select passengers = new Select (driver.findElement(By.name("passCount")));
         passengers.selectByValue("2");
        
        
        
        //choose the depart city
        Select depart = new Select (driver.findElement(By.name("fromPort")));
        depart.selectByValue("London");
       
        
        //choose the month from
        Select monthFrom = new Select (driver.findElement(By.name("fromMonth")));
        monthFrom.selectByValue("6");
        
        
        //choose the day from
        Select dayFrom = new Select (driver.findElement(By.name("fromDay")));
        dayFrom.selectByValue("11");
        
        
        //choose the arrive city
        Select arrive = new Select (driver.findElement(By.name("toPort")));
        arrive.selectByValue("Paris");
        
      //choose the month to
        Select monthArrive = new Select (driver.findElement(By.name("toMonth")));
        monthArrive.selectByValue("8");
        
        //choose the day to
        Select dayArrive = new Select (driver.findElement(By.name("toDay")));
        dayArrive.selectByValue("1");
        
        //choose the service type
        WebElement radio3 = driver.findElement(By.name("servClass"));
        radio3.click();
        
      //choose the airline
        Select airline = new Select (driver.findElement(By.name("airline")));
       airline.selectByVisibleText("Unified Airlines");
        Thread.sleep(2000);
        
        //find the search button by name
        WebElement continueButton = driver.findElement(By.name("findFlights"));
        continueButton.click();
        Thread.sleep(1000);
        
        
        //does the message match ?
        
        String actualResult = "http://demo.guru99.com/test/newtours/reservation2.php";
        String expectedResult = "http://demo.guru99.com/test/newtours/reservation2.php";
        assertEquals(actualResult, expectedResult);
        
             
	}
       
        
       }
	
	
	

   
	


