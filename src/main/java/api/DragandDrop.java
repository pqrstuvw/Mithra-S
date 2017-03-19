package api;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragandDrop {
public static void main(String[] args) throws InterruptedException
{
	
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://jqueryui.com/");
	driver.findElementByLinkText("Draggable").click();
	WebElement x = driver.findElementByXPath("//iframe[@class='demo-frame']");
	driver.switchTo().frame(x);
    WebElement drag=driver.findElementByXPath("//div[@id='draggable']");
/*   int x= drag.getLocation().getX();
   int y= drag.getLocation().getY();*/
   Actions axis=new Actions(driver);
   axis.clickAndHold(drag).dragAndDropBy(drag, 150, 150).build().perform();
   Thread.sleep(2000);
   driver.close();
}
}
