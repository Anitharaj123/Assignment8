package week3.Day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class Amazondemo {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();

	driver.manage().window().maximize();
	
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	WebElement Search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	Search.sendKeys("Bags");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[text()=' for boys']")).click();
//	Select options=new Select(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")));
//	options.selectByVisibleText("bags for boys");
	String Numofresults=driver.findElement(By.xpath("//div[contains(@class,'a-spacing-small a-spacing-top-small')]")).getText();
	System.out.println(Numofresults);
	Thread.sleep(5000);
	WebElement choice=driver.findElement(By.xpath("//li[@id='p_89/Safari']/span[1]/a[1]/div[1]/label[1]/i[1]"));
	choice.click();
	Thread.sleep(5000);
	
	WebElement choice1=driver.findElement(By.xpath("//li[@id='p_89/American Tourister']/span[1]/a[1]/div[1]/label[1]/i[1]"));
	choice1.click();
	Thread.sleep(5000);
	WebElement choice2=driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']"));
	choice2.click();
	driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
	String bagName=driver.findElement(By.xpath("(//span[contains(@class,'a-size-base-plus a-color-base')])[2]")).getText();
	System.out.println("The First Result BagName is: "+bagName);
	String bagPrice=driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
	System.out.println("The First resultBag price is: Rs. "+bagPrice);
	String tiTle=driver.getTitle();
	System.out.println("The Title of Current Page is: "+tiTle);
	driver.close();
	////span[@class='a-price-whole']
	
	
	
	
	////div[contains(@class,'s-navigation-checkbox aok-float-left')][3]

	}

}
