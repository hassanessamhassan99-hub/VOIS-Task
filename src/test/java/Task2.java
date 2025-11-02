import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 250)");

		WebElement LeavingFrom = driver
				.findElement(By.xpath("//*[@id=\"frmSearch\"]/div/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label"));
		LeavingFrom.sendKeys("CHIKKAMAGALURU");

		WebElement GoingTo = driver
				.findElement(By.xpath("//*[@id=\"frmSearch\"]/div/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label"));
		GoingTo.sendKeys("BENGALURU");

		WebElement arrivalDate = driver.findElement(By.id("departDate"));
		arrivalDate.click();

		WebElement dateSelect = driver
				.findElement(By.xpath("(//table[contains(@class,'ui-datepicker-calendar')]//a)[1]"));
		dateSelect.click();

		WebElement searchButton = driver.findElement(By.id("submitSearch"));
		searchButton.click();

		WebElement seat = driver.findElement(By.xpath("(//canvas[@class='pointer'])[1]"));
		seat.click();

		WebElement boarding = driver.findElement(By.xpath("(//input[@name='boardingPoint'])[1]"));
		boarding.click();

		WebElement dropping = driver.findElement(By.xpath("(//input[@name='droppingPoint'])[1]"));
		dropping.click();

		driver.findElement(By.id("mobileNo")).sendKeys("123456789");
		driver.findElement(By.id("email")).sendKeys("testuser1@gmail.com");

		driver.findElement(By.id("passengerName1")).sendKeys("Hassan");
		driver.findElement(By.id("genderCodeId1")).sendKeys("Male");
		driver.findElement(By.id("passengerAge1")).sendKeys("27");
		driver.findElement(By.id("concessionIds1")).sendKeys("GENERAL PUBLIC");

		WebElement paymentButton = driver.findElement(By.id("PgBtn"));
		paymentButton.click();

	}
}