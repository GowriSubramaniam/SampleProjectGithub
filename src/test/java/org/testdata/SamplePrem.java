package org.testdata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SamplePrem {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\Lenovo\\eclipse-workspace\\MavenHotelapp\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		WebElement txtusr=driver.findElement(By.id("username"));
		txtusr.sendKeys("KavithaGowri");
		
		WebElement txtpass=driver.findElement(By.id("password"));
		txtpass.sendKeys("arsika2016");
		
		WebElement login=driver.findElement(By.id("login"));
		login.click();
		
		Thread.sleep(3000);
		WebElement drlocation=driver.findElement(By.id("location"));
		Select s=new Select(drlocation);
		s.selectByVisibleText("London");
		
		WebElement drhotel=driver.findElement(By.id("hotels"));
		Select s1=new Select(drhotel);
		s1.selectByValue("Hotel Sunshine");
		
		WebElement room=driver.findElement(By.id("room_type"));
		Select s2=new Select(room);
		s2.selectByIndex(2);
		
		WebElement roomnos=driver.findElement(By.id("room_nos"));
		Select s3=new Select(roomnos);
		s3.selectByValue("2");
		
		WebElement datein=driver.findElement(By.id("datepick_in"));
		datein.sendKeys("25/12/2010");
		
		WebElement dateout=driver.findElement(By.id("datepick_out"));
		dateout.sendKeys("27/12/2010");
		
		WebElement adultroom=driver.findElement(By.id("adult_room"));
		Select s4=new Select(adultroom);
		s4.selectByValue("2");
		
		WebElement childroom=driver.findElement(By.id("child_room"));
		Select s5=new Select(childroom);
		s5.selectByValue("1");
		
		WebElement search=driver.findElement(By.id("Submit"));
		search.click();
		Thread.sleep(3000);
		
		WebElement radio=driver.findElement(By.id("radiobutton_0"));
		radio.click();
		
		WebElement contine=driver.findElement(By.id("continue"));
		contine.click();
		
		driver.findElement(By.id("first_name")).sendKeys("Gowri");
		
		driver.findElement(By.id("last_name")).sendKeys("Subramanian");
		
		driver.findElement(By.id("address")).sendKeys("75/22-C,T.P Road, Annur");
		
		driver.findElement(By.id("cc_num")).sendKeys("9876543210123456");
		
		WebElement cardtype=driver.findElement(By.id("cc_type"));
		Select s6=new Select(cardtype);
		s6.selectByVisibleText("VISA");
		
		WebElement expmnth=driver.findElement(By.id("cc_exp_month"));
		Select s7=new Select(expmnth);
		s7.selectByVisibleText("April");
		
		WebElement expyr=driver.findElement(By.id("cc_exp_year"));
		Select s8=new Select(expyr);
		s8.selectByVisibleText("2022");
		
		driver.findElement(By.id("cc_cvv")).sendKeys("852");
		
		driver.findElement(By.id("book_now")).click();
		Thread.sleep(5000);
		
		WebElement orderno=driver.findElement(By.id("order_no"));
		String txt=orderno.getAttribute("value");
		System.out.println("order no is:-"+txt);
		
		
		}
	
}
