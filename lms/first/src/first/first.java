package first;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class first  
{
    public static void main(String[] args) throws InterruptedException
    {
        // Create a new instance of the Firefox driver
        // Notice that the remainder of the code relies on the interface, 
        // not the implementation.
       
    	WebDriver w = new FirefoxDriver();

        w.get("http://www.iathena.com/");
        
        
       // w.findElement(By.linkText("LOGIN")).click();
        
        
        // Thread.sleep(10000);
        // String mainwindow=w.getWindowHandle();
        
        // w.findElement(By.linkText("Log in")).click();
        
        
        
        
        
        
       // w.switchTo().frame(728);
        
        
        
        
       // w.findElement(By.id("username")).sendKeys("nilesh.khodke@navituseducation.com");;
       // w.findElement(By.id("Password")).sendKeys("123@abc123");
       
       // w.findElement(By.linkText("Log in")).click();
        
        w.findElement(By.linkText("COURSE CATALOG")).click();
        
      
        
        w.findElement(By.linkText("Microsoft Excel (Basic) - FREE")).click();
        
        w.findElement(By.name("addtocart"));
        
          
        
        //Close the browse
        w.quit();
    }
}