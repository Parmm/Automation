package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver; 
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
public class Registration{
   public static void main(String[] args) {
     
	   //set chromedriver.exe file path
      System.setProperty("webdriver.chrome.driver","/Users/vishwaskamboj/Downloads/chromedriver"); 
      WebDriver driver = new SafariDriver();
     
      
      // Launch the registration web page
      driver.navigate().to("https://www.hashtag-ca.com/careers/apply?jobCode=QAE001");
      driver.manage().window().maximize();
      
      //Registration Form Validation
     
      driver.findElement(By.name("name")).sendKeys("Parm");
      driver.findElement(By.name("email")).sendKeys("parm@example.com");
      driver.findElement(By.xpath("//input[@name=\"phone\"]")).sendKeys("838387872998865656576");
      
      WebElement upload_file = driver.findElement(By.id("inputFile"));

      upload_file.sendKeys("/Users/vishwaskamboj/Downloads/Resume.docx ");
      
      driver.findElement(By.xpath("//textarea[@name=\"description\"]")).sendKeys("I am a tester with about 4.5 years of manual & automation testing experience in different project and technological environments.I have extensively written test cases and executed test cases on different applications in my organization.");
     
      driver.findElement(By.xpath("//*[@id=\"contact-form\"]/div/div[7]/div/button[1]")).click();

           driver.quit();
   }
}

