import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Task1 {

	public static void main(String[] args) {

		 WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1024, 768));

		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();

		WebElement ContinueBtn = driver
				.findElement(By.xpath("/html/body/div/div[1]/div[3]/div/div/form/div/div/span/span/button"));
		ContinueBtn.click();

		WebElement SearchBox = driver.findElement(By.name("field-keywords"));
		SearchBox.sendKeys("car accessories");
		SearchBox.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 100)");

		WebElement AddFirstItem = driver.findElement(By.id("a-autoid-3-announce"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", AddFirstItem);
		AddFirstItem.click();

		js.executeScript("window.scrollBy(0, -500)");

		WebElement Cart = driver.findElement(By.id("nav-cart-count"));
		Cart.click();

		WebElement cartItem = driver.findElement(By.cssSelector(".sc-list-item-content"));

		if (cartItem.isDisplayed()) {
			System.out.println("Item is successfully added to the cart");
		} else {
			System.out.println("Item not found in the cart");
		}

		WebElement dismissBtn = driver
				.findElement(By.xpath("//*[@id=\"nav-flyout-iss-anchor\"]/div[2]/div/div[3]/span[1]"));
		dismissBtn.click();

		WebElement TodayDeal = driver.findElement(By.linkText("Today's Deals"));
		TodayDeal.click();

		js.executeScript("window.scrollBy(0, 350)");
		WebElement SeeMore = driver.findElement(By.xpath("//*[@id=\"DealsGridScrollAnchor\"]/div[2]/div[1]/button/a"));
		SeeMore.click();

		WebElement Grocorey = driver.findElement(By.xpath("//span[contains(text(),'Grocery & Gourmet Food')]"));
		Grocorey.click();

		js.executeScript("window.scrollBy(0, 600)");

		WebElement AddItem = driver.findElement(By.xpath("//*[@id=\"DealsGridScrollAnchor\"]/div[3]/div/div/div[2]/div[1]/div/div/div[2]/div[2]/div/a/div"));
		AddItem.click();

	}

}
