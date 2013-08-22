import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// Run against FF23
public class ClickTEst {
	public static void main (String[] args){
		WebDriver wd = new FirefoxDriver();
		wd.get("http://www.akhveras.hostyd.com/test_sites/ButtonSite.html");
		wd.findElement(By.id("hardlyClickableBtn")).click();
		
		try{
			wd.switchTo().alert();
		}
		catch (NoAlertPresentException e) {
			throw new RuntimeException("Button was not clicked!");
		}
		
		System.out.println("Button was clicked");
	}	
		
}
