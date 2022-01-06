package stepsDef;

import config.env_target;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class LoginManualTest extends env_target {

    protected String url = tfile.getProperty("url");
    protected String email_manual = tfile.getProperty("email_manual");
    protected String password_manual = tfile.getProperty("password_manual");


    @Given("^user is on homepage login manual$")
    public void user_is_on_homepage_login_manual() throws Throwable {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable--notifications");
        System.setProperty("webdriver.chrome.driver",
                projectPath + "\\src\\test\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(url);
    }

    @When("^user input registered Alamat email$")
    public void user_input_registered_Alamat_email() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='input_email']")).sendKeys(email_manual);
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\loginmanual_email.png"));
    }

    @When("^user input Password$")
    public void user_input_Password() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='input_password']")).sendKeys(password_manual);
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\loginmanual_password.png"));
    }

    @When("^user click log in Masuk Manual button$")
    public void user_click_log_in_Masuk_Manual_button() throws Throwable {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='submit_login']")).click();
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\buttonmasuk_manual.png"));
    }

    @Then("^user is on pre-screening page login manual$")
    public void user_is_on_pre_screening_page_login_manual() throws Throwable {
        Thread.sleep(3000);
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\pre_screening_page_login_manual.png"));
        driver.quit();
    }
}