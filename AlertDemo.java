package week3.Day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		Thread.sleep(3000);
		Alert Click=driver.switchTo().alert();
		Thread.sleep(3000);
		String simpleAlert=Click.getText();
		System.out.println(simpleAlert);
		Click.accept();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name='j_idt88:j_idt93']")).click();
		Thread.sleep(3000);
		String cnfrmAlert=Click.getText();
		System.out.println(cnfrmAlert);
		Click.dismiss();
		driver.findElement(By.xpath("//button[@name='j_idt88:j_idt104']")).click();
		Thread.sleep(3000);
	   Click.sendKeys("Anitha");
	   Thread.sleep(3000);
	   Click.accept();
	   String prmptoutput=driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
	   System.out.println(prmptoutput);
	  driver.findElement(By.xpath("//button[@name='j_idt88:j_idt95']")).click();
			
	  String swtalert=driver.findElement(By.xpath("//p[contains(text(),'You have clicked and open')]")).getText();
	  System.out.println(swtalert);
	
	  driver.findElement(By.xpath("//button[@name='j_idt88:j_idt98']")).click();
	  
	  driver.findElement(By.xpath("//button[@name='j_idt88:j_idt100']")).click();
	  String Sweetalrt=driver.findElement(By.xpath("//p[contains(text(),'Unless you close this')]")).getText();
	  System.out.println(Sweetalrt);
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("(//a[@role='button']//span)[2]")).click();
	  //Confirmation swtalert
	  driver.findElement(By.xpath("//span[text()='Delete']")).click();
	  String cnfmsweetalrt=driver.findElement(By.xpath("//span[text()='Are you sure you want to proceed?']")).getText();
	  System.out.println(cnfmsweetalrt);
	  driver.findElement(By.xpath("//span[text()='Yes']")).click();
	  //max or min
	  driver.findElement(By.xpath("//button[@name='j_idt88:j_idt111']")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-extlink']")).click();
	  String sweetmaxi = driver.findElement(By.xpath("(//p[@class='m-0'])[2]")).getText();
	  System.out.println(sweetmaxi);
	  driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[3]")).click();
	  driver.close();
	  
	  
	  
	  
	  
	  
	  
	  
	  
			   
			   
	   
	   
	   
	   
		
		
		
		
		
		
		

	
	
		
		
		
		

	}

}
