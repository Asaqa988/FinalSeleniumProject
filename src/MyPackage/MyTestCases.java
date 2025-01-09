package MyPackage;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestCases extends Parameters {

	@BeforeTest
	public void mySetup() {

		ConfigurationToAccess();
	}

	@Test(priority = 1)

	public void CheckTheDefaultLanguageIsEnglish() {

		String ActualLanaguage = driver.findElement(By.tagName("html")).getDomAttribute("lang");

		Assert.assertEquals(ActualLanaguage, ExpectedLanaguage);
	}

	@Test(priority = 2)

	public void CheckTheDefaultCurrency() {

		String ActualCurrency = driver.findElement(By.cssSelector(".sc-dRFtgE.fPnvOO")).getText();

		Assert.assertEquals(ActualCurrency, ExpectedCurrency);

	}

	@Test(priority = 3)

	public void CheckTheMobileNumber() {

		String ActualMobileNumber = driver.findElement(By.tagName("strong")).getText();

		Assert.assertEquals(ActualMobileNumber, ExpectedMobileNumber);

	}

	@Test(priority = 4)

	public void CheckQitafLogo() throws InterruptedException {

		WebElement TheFooter = driver.findElement(By.tagName("footer"));

		;

		WebElement TheContainerDiv = TheFooter.findElement(By.cssSelector(".sc-ghsgMZ.hIElfs"));
		WebElement QitafLogo = TheContainerDiv.findElement(By.tagName("svg"));

		boolean ActaualQitafLogoDisplay = QitafLogo.isDisplayed();

		Assert.assertEquals(ActaualQitafLogoDisplay, ExpectedQitafLogoDisplay);

	}

	@Test(priority = 5)

	public void CheckHotelTabIsNotSelected() throws InterruptedException {

		WebElement HotelTab = driver.findElement(By.id("uncontrolled-tab-example-tab-hotels"));

		String ActualValueforHotelTab = HotelTab.getDomAttribute("aria-selected");

		Assert.assertEquals(ActualValueforHotelTab, ExpectedValueForHotelTab);

	}
	
	@Test(priority = 6)

	public void CheckDepatureDate() throws InterruptedException {

		 List<WebElement> dates = driver.findElements(By.cssSelector(".sc-fvLVrH.hNjEjT"));

		 String ActualDepatureDate = dates.get(0).getText();
		 
		 Assert.assertEquals(ActualDepatureDate, Tomorrow);


		



	}
	
	@Test(priority = 7)

	public void CheckReturnDate() throws InterruptedException {



		



	}
	

}
