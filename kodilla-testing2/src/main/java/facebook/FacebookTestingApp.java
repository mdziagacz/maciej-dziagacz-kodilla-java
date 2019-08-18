package facebook;

import config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_DAY = "//select[contains(@name, \"day\")]";
    public static final String XPATH_MONTH = "//select[contains(@name, \"month\")]";
    public static final String XPATH_YEAR = "//select[contains(@name, \"year\")]";


    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement selectDay = driver.findElement(By.xpath(XPATH_DAY));
        Select day = new Select(selectDay);
        day.selectByValue("19");

        WebElement selectMonth = driver.findElement(By.xpath(XPATH_MONTH));
        Select month = new Select(selectMonth);
        month.selectByValue("8");

        WebElement selectYear = driver.findElement(By.xpath(XPATH_YEAR));
        Select year = new Select(selectYear);
        year.selectByValue("1986");
    }
}
