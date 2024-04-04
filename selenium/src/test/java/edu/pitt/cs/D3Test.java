// Generated by Selenium IDE
package edu.pitt.cs;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class D3Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--headless");
    driver = new ChromeDriver(options);
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void tEST1LINKS() {
    // Test name: TEST-1-LINKS
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("http://localhost:8080/");
    String src = "http://localhost:8080";
    // 2 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 3 | storeAttribute | xpath=//li[8]/a@href | x
    {
      WebElement element = driver.findElement(By.xpath("//li[8]/a"));
      String attribute = element.getAttribute("href");
      vars.put("x", attribute);
    }
    // 4 | assert | x | /reset
    assertEquals(vars.get("x").toString(), src + "/reset");
  }
  @Test
  public void tEST2RESET() {
    // Test name: TEST-2-RESET
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("http://localhost:8080///");
    // 2 | runScript | document.cookie = "1=true";document.cookie = "2=true";document.cookie = "3=true"; | 
    js.executeScript("document.cookie = \"1=true\";document.cookie = \"2=true\";document.cookie = \"3=true\";");
    // 3 | click | linkText=Reset | 
    driver.findElement(By.linkText("Reset")).click();
    // 4 | assertText | xpath=//div/ul/li | ID 1. Jennyanydots
    assertThat(driver.findElement(By.xpath("//div/ul/li")).getText(), is("ID 1. Jennyanydots"));
    // 5 | assertText | xpath=//div/ul/li[2] | ID 2. Old Deuteronomy
    assertThat(driver.findElement(By.xpath("//div/ul/li[2]")).getText(), is("ID 2. Old Deuteronomy"));
    // 6 | assertText | xpath=//div/ul/li[3] | ID 3. Mistoffelees
    assertThat(driver.findElement(By.xpath("//div/ul/li[3]")).getText(), is("ID 3. Mistoffelees"));
  }
  @Test
  public void tEST4LISTING() {
    // Test name: TEST-4-LISTING
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("http://localhost:8080///");
    // 2 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 3 | click | linkText=Catalog | 
    driver.findElement(By.linkText("Catalog")).click();
    // 4 | assertElementPresent | xpath=//div/ul/li[3] | 
    {
      List<WebElement> elements = driver.findElements(By.xpath("//div/ul/li[3]"));
      assert(elements.size() > 0);
    }
    // 5 | assertElementNotPresent | xpath=//div/ul/li[4] | 
    {
      List<WebElement> elements = driver.findElements(By.xpath("//div/ul/li[4]"));
      assert(elements.size() == 0);
    }
    // 6 | assertText | xpath=//div/ul/li[3] | ID 3. Mistoffelees
    assertThat(driver.findElement(By.xpath("//div/ul/li[3]")).getText(), is("ID 3. Mistoffelees"));
  }
  @Test
  public void tEST5RENTACAT() {
    // Test name: TEST-5-RENT-A-CAT
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("http://localhost:8080///");
    // 2 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 3 | click | linkText=Rent-A-Cat | 
    driver.findElement(By.linkText("Rent-A-Cat")).click();
    // 4 | assertElementPresent | xpath=//button | 
    {
      List<WebElement> elements = driver.findElements(By.xpath("//button"));
      assert(elements.size() > 0);
    }
    // 5 | assertElementPresent | xpath=//div[3]/div[3]/button | 
    {
      List<WebElement> elements = driver.findElements(By.xpath("//div[3]/div[3]/button"));
      assert(elements.size() > 0);
    }
  }
  @Test
  public void tEST6RENT() {
    // Test name: TEST-6-RENT
    // Step # | name | target | value
    // 1 | open | http://localhost:8080// | 
    driver.get("http://localhost:8080//");
    // 2 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 3 | setWindowSize | 1280x672 | 
    driver.manage().window().setSize(new Dimension(1280, 672));
    // 4 | click | linkText=Rent-A-Cat | 
    driver.findElement(By.linkText("Rent-A-Cat")).click();
    // 5 | click | xpath=//input[@id='rentID'] | 
    driver.findElement(By.xpath("//input[@id=\'rentID\']")).click();
    // 6 | type | xpath=//input[@id='rentID'] | 1
    driver.findElement(By.xpath("//input[@id=\'rentID\']")).sendKeys("1");
    // 7 | click | xpath=//button[@onclick='rentSubmit()'] | 
    driver.findElement(By.xpath("//button[@onclick=\'rentSubmit()\']")).click();
    // 8 | assertText | xpath=//div[@id='listing']/ul/li | Rented out
    assertThat(driver.findElement(By.xpath("//div[@id=\'listing\']/ul/li")).getText(), is("Rented out"));
    // 9 | assertText | xpath=//div[@id='listing']/ul/li[2] | ID 2. Old Deuteronomy
    assertThat(driver.findElement(By.xpath("//div[@id=\'listing\']/ul/li[2]")).getText(), is("ID 2. Old Deuteronomy"));
    // 10 | assertText | xpath=//div[@id='listing']/ul/li[3] | ID 3. Mistoffelees
    assertThat(driver.findElement(By.xpath("//div[@id=\'listing\']/ul/li[3]")).getText(), is("ID 3. Mistoffelees"));
    // 11 | assertText | xpath=//div[2]/div[4] | Success!
    assertThat(driver.findElement(By.xpath("//div[2]/div[4]")).getText(), is("Success!"));
  }
  @Test
  public void tEST7RETURN() {
    // Test name: TEST-7-RETURN
    // Step # | name | target | value
    // 1 | open | http://localhost:8080// | 
    driver.get("http://localhost:8080//");
    // 2 | runScript | document.cookie = "1=false";document.cookie = "2=true";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=true\";document.cookie = \"3=false\";");
    // 3 | click | xpath=//a[contains(@href, '/rent-a-cat')] | 
    driver.findElement(By.xpath("//a[contains(@href, \'/rent-a-cat\')]")).click();
    // 4 | click | xpath=//input[@id='returnID'] | 
    driver.findElement(By.xpath("//input[@id=\'returnID\']")).click();
    // 5 | type | xpath=//input[@id='returnID'] | 2
    driver.findElement(By.xpath("//input[@id=\'returnID\']")).sendKeys("2");
    // 6 | click | xpath=//button[contains(.,'Return')] | 
    driver.findElement(By.xpath("//button[contains(.,\'Return\')]")).click();
    // 7 | assertText | xpath=//div[@id='returnResult'] | Success!
    assertThat(driver.findElement(By.xpath("//div[@id=\'returnResult\']")).getText(), is("Success!"));
    // 8 | assertText | xpath=//div[@id='listing']/ul/li | ID 1. Jennyanydots
    assertThat(driver.findElement(By.xpath("//div[@id=\'listing\']/ul/li")).getText(), is("ID 1. Jennyanydots"));
    // 9 | assertText | xpath=//div[@id='listing']/ul/li[2] | ID 2. Old Deuteronomy
    assertThat(driver.findElement(By.xpath("//div[@id=\'listing\']/ul/li[2]")).getText(), is("ID 2. Old Deuteronomy"));
    // 10 | assertText | xpath=//div[@id='listing']/ul/li[3] | ID 3. Mistoffelees
    assertThat(driver.findElement(By.xpath("//div[@id=\'listing\']/ul/li[3]")).getText(), is("ID 3. Mistoffelees"));
  }
  @Test
  public void tEST8FEEDACAT() {
    // Test name: TEST-8-FEED-A-CAT
    // Step # | name | target | value
    // 1 | open | http://localhost:8080// | 
    driver.get("http://localhost:8080//");
    // 2 | setWindowSize | 1280x672 | 
    driver.manage().window().setSize(new Dimension(1280, 672));
    // 3 | click | xpath=//a[contains(text(),'Feed-A-Cat')] | 
    driver.findElement(By.xpath("//a[contains(text(),\'Feed-A-Cat\')]")).click();
    // 4 | assertElementPresent | xpath=//button[contains(.,'Feed')] | 
    {
      List<WebElement> elements = driver.findElements(By.xpath("//button[contains(.,\'Feed\')]"));
      assert(elements.size() > 0);
    }
  }
  @Test
  public void tEST9FEED() {
    // Test name: TEST-9-FEED
    // Step # | name | target | value
    // 1 | open | http://localhost:8080// | 
    driver.get("http://localhost:8080//");
    // 2 | setWindowSize | 1280x672 | 
    driver.manage().window().setSize(new Dimension(1280, 672));
    // 3 | click | xpath=//a[contains(text(),'Feed-A-Cat')] | 
    driver.findElement(By.xpath("//a[contains(text(),\'Feed-A-Cat\')]")).click();
    // 4 | click | xpath=//input[@id='catnips'] | 
    driver.findElement(By.xpath("//input[@id=\'catnips\']")).click();
    // 5 | type | xpath=//input[@id='catnips'] | 6
    driver.findElement(By.xpath("//input[@id=\'catnips\']")).sendKeys("6");
    // 6 | click | xpath=//button[@onclick='feedSubmit()'] | 
    driver.findElement(By.xpath("//button[@onclick=\'feedSubmit()\']")).click();
    // 7 | assertText | xpath=//div[@id='feedResult'] | Nom, nom, nom.
    assertThat(driver.findElement(By.xpath("//div[@id=\'feedResult\']")).getText(), is("Nom, nom, nom."));
  }
  @Test
  public void tEST10GREETACAT() {
    // Test name: TEST-10-GREET-A-CAT
    // Step # | name | target | value
    // 1 | open | http://localhost:8080//reset | 
    driver.get("http://localhost:8080//reset");
    // 2 | setWindowSize | 1280x672 | 
    driver.manage().window().setSize(new Dimension(1280, 672));
    // 3 | click | xpath=//a[contains(text(),'Greet-A-Cat')] | 
    driver.findElement(By.xpath("//a[contains(text(),\'Greet-A-Cat\')]")).click();
    // 4 | assertText | xpath=//div[@id='greeting']/h4 | Meow!Meow!Meow!
    assertThat(driver.findElement(By.xpath("//div[@id=\'greeting\']/h4")).getText(), is("Meow!Meow!Meow!"));
  }
  @Test
  public void tEST11GREETACATWITHNAME() {
    // Test name: TEST-11-GREET-A-CAT-WITH-NAME
    // Step # | name | target | value
    // 1 | open | /greet-a-cat/Jennyanydots | 
    driver.get("http://localhost:8080//greet-a-cat/Jennyanydots");
    // 2 | assertText | xpath=//div[@id='greeting']/h4 | Meow! from Jennyanydots.
    assertThat(driver.findElement(By.xpath("//div[@id=\'greeting\']/h4")).getText(), is("Meow! from Jennyanydots."));
  }

  @Test
  public void tEST3CATALOG() {
    // Test name: TEST-3-CATALOG
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("http://localhost:8080//");
    String src = "http://localhost:8080";
    // 2 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 3 | click | linkText=Catalog | 
    driver.findElement(By.linkText("Catalog")).click();
    // 4 | storeAttribute | xpath=//li[2]/img@src | x
    {
      WebElement element = driver.findElement(By.xpath("//li[2]/img"));
      String attribute = element.getAttribute("src");
      vars.put("x", attribute);
    }
    // 5 | assert | x | /images/cat2.jpg
    assertEquals(vars.get("x").toString(), src + "/images/cat2.jpg");
  }
}
