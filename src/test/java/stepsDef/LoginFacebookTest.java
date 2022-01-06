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

public class LoginFacebookTest extends env_target {

    protected String url = tfile.getProperty("url");
    protected String email = tfile.getProperty("email");
    protected String pass = tfile.getProperty("pass");


    @Given("^user is on homepage$")
    public void user_is_on_homepage() throws Throwable {
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

    @When("^user click Facebook Login button$")
    public void user_click_Facebook_Login_button() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='login_facebook']")).click();
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\buttonlogin_facebook.png"));
    }

    @When("^user input email facebook$")
    public void user_input_email_facebook() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\email_facebook.png"));
    }

    @When("^user input password facebook$")
    public void user_input_password_facebook() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pass);
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\password_facebook.png"));
    }

    @When("^user click Log in button$")
    public void user_click_Log_in_button() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\button_login_facebook.png"));
    }

    @Then("^user is on pre-screening page$")
    public void user_is_on_pre_screening_page() throws Throwable {
        Thread.sleep(3000);
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(projectPath+ "\\src\\test\\java\\screenshots\\pre_screening_page.png"));
        driver.quit();
    }
}