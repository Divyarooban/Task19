import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Locators {
    WebDriver driver;
    @BeforeClass
    public void setUp(){
        //Launch the webdriver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

    }
   @Test
   public void loc() throws InterruptedException {
        //Locating title and url
       driver.get("https://www.guvi.in/register/");
       Assert.assertEquals(driver.getTitle(),"GUVI | Sign Up");
       Assert.assertEquals(driver.getCurrentUrl(),"https://www.guvi.in/register/");

       //Locating Logo
       WebElement logo=driver.findElement(By.tagName("img"));
       Assert.assertEquals(logo.getAttribute("src"),"https://www.guvi.in/web-build/images/guvi-logo.8eeef9e2027d374479531095b012a87e.svg");

       //Switching to iframe
       WebElement iframe=driver.findElement(By.xpath("//iframe[@title='Sign in with Google Button']"));
       driver.switchTo().frame(iframe);

       //Signup with google
       driver.findElement(By.xpath("//span[@id='button-label']"));

       //Signup with email
       //Switching back to default content
       driver.switchTo().defaultContent();
       WebElement text=driver.findElement(By.xpath("//p[text()='Or Sign Up with Email']"));
       Assert.assertEquals(text.getText(),"Or Sign Up with Email");

       //Verifying the text Fullname
       WebElement fullname= driver.findElement(By.xpath("//label[@for='name']"));
       Assert.assertEquals(fullname.getText(),"Full Name");

       //Fullname textbox
       //By ID
       WebElement fname=driver.findElement(By.id("name"));
       fname.sendKeys("John");
       Thread.sleep(2000);
       fname.clear();

       //By Xpath
       WebElement fname2=driver.findElement(By.xpath("//input[@class='form-control'][1]"));
       fname2.sendKeys("Freddy");
       Thread.sleep(2000);
       fname2.clear();

       //By css selector
       WebElement fname4=driver.findElement(By.cssSelector("input[id='name']"));
       fname4.sendKeys("Divya N");
       Thread.sleep(2000);

       //Verifying the certificates text
       WebElement cert=driver.findElement(By.className("certificates"));
       Assert.assertEquals(cert.getText(),"*This name will appear in certificates");

       WebElement cert2=driver.findElement(By.xpath("//small[@class='certificates']"));
       Assert.assertEquals(cert2.getText(),"*This name will appear in certificates");

       //Verifying the email id label
       WebElement email= driver.findElement(By.cssSelector("label[for='email']"));
       Assert.assertEquals(email.getText(),"Email Address");


       //Verifying the email id textbox
       //Cssselector
       WebElement email1= driver.findElement(By.cssSelector("input[type='email']"));
       WebElement email2= driver.findElement(By.cssSelector("input[id='email']"));
       email1.sendKeys("test2ams@gmail.com");
       Thread.sleep(2000);
       email1.clear();

       email2.sendKeys("test3ams@gmail.com");
       Thread.sleep(2000);
       email2.clear();


       //ID
       WebElement email3= driver.findElement(By.id("email"));
       email3.sendKeys("test3ams@gmail.com");
       Thread.sleep(2000);
       email3.clear();


       //Xpath
       WebElement email4=driver.findElement(By.xpath("//input[@type='email']"));
       WebElement email5=driver.findElement(By.xpath("//input[@id='email']"));
       email4.sendKeys("test4ams@gmail.com");
       Thread.sleep(2000);
       email4.clear();
       email5.sendKeys("divya30ams@gmail.com");
       Thread.sleep(2000);

       //To verify password text
       //Css selector
       WebElement pwd= driver.findElement(By.cssSelector("label[for='password']"));
       Assert.assertEquals(pwd.getText(),"Password");

       //Xpath
       WebElement pwd2= driver.findElement(By.xpath("//label[@for='password']"));
       Assert.assertEquals(pwd2.getText(),"Password");


       //Verifying the Password textbox
       //Cssselector
       WebElement password= driver.findElement(By.cssSelector("input[type='password']"));
       WebElement pwd3= driver.findElement(By.cssSelector("input[id='password']"));
       password.sendKeys("Hockey@123");
       password.clear();
       pwd3.sendKeys("Hockey@1234");
       pwd3.clear();
       Thread.sleep(2000);

       //ID
       WebElement pwd5= driver.findElement(By.id("password"));
       pwd5.sendKeys("Hockey@12345");
       pwd5.clear();
       Thread.sleep(2000);

       //Xpath
       WebElement pwd6=driver.findElement(By.xpath("//input[@type='password']"));
       WebElement pwd7=driver.findElement(By.xpath("//input[@id='password']"));
       pwd6.sendKeys("Hockey@123456");
       pwd6.clear();
       pwd7.sendKeys("Hockey@123456");
       Thread.sleep(2000);

       //To verify Mobile number text
       //Css selector
       WebElement mbno= driver.findElement(By.cssSelector("label[for='mobileNumber']"));
       Assert.assertEquals(mbno.getText(),"Mobile number");
       Thread.sleep(2000);

       //Xpath
       WebElement mbno1= driver.findElement(By.xpath("//label[@for='mobileNumber']"));
       Assert.assertEquals(mbno1.getText(),"Mobile number");
       Thread.sleep(2000);

       //Verifying the Mobile number textbox
       //Cssselector
       WebElement mbno3= driver.findElement(By.cssSelector("input[id='mobileNumber']"));
       mbno3.sendKeys("9789456311");
       Thread.sleep(2000);
       mbno3.clear();


       //ID
       WebElement mbno5= driver.findElement(By.id("mobileNumber"));
       mbno5.sendKeys("9789456321");
       Thread.sleep(2000);
       mbno5.clear();


       //Xpath
       WebElement mbno6=driver.findElement(By.xpath("//input[@id='mobileNumber']"));
       mbno6.sendKeys("9789456322");
       Thread.sleep(2000);

       //Verifying the signup button
       //Css selector
       WebElement signup= driver.findElement(By.cssSelector("a[id='signup-btn']"));
       WebElement signup2= driver.findElement(By.cssSelector(("a[class='btn signup-btn']")));
       Assert.assertEquals(signup.getText(),"Sign Up");
       Assert.assertEquals(signup2.getText(),"Sign Up");


       //ID
       WebElement signup3= driver.findElement(By.id("signup-btn"));
       Assert.assertEquals(signup3.getText(),"Sign Up");


       //xpath
       WebElement signup4= driver.findElement(By.xpath("//a[@id='signup-btn']"));
       WebElement signup5= driver.findElement(By.xpath("//a[@class='btn signup-btn']"));
       Assert.assertEquals(signup4.getText(),"Sign Up");
       Assert.assertEquals(signup5.getText(),"Sign Up");
   }

    @AfterClass
    public void tearDown(){

        driver.quit();
    }


}
