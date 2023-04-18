package testsuite;

import browserfactory1.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

    public class RegisterTest extends BaseTest {
        String baseURL = "https://demo.nopcommerce.com/";

        @Before
        public void setUp() {
            openBrowser(baseURL);
        }
        @Test
        public void userShouldNavigateToRegisterPageSuccessfully() {
            //click on registerLink
            WebElement registerLink = driver.findElement(By.linkText("Register"));
            registerLink.click();
            String expectedMessage = "Register";
            WebElement actualTextElement = driver.findElement(By.xpath("//a[@class='ico-register']"));
            String actualMessage = actualTextElement.getText();
            Assert.assertEquals("Register", expectedMessage, actualMessage);
        }
        @Test
        public void userShouldRegisterAccountSuccessfully() {
            //click on registerLink
            WebElement registerLink = driver.findElement(By.linkText("Register"));
            registerLink.click();

            //select female gender radio button
            driver.findElement(By.xpath("//input[@id='gender-female']")).click();

            //Enter first name
            driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Prime");

            //Enter last name
            driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("Testing");

            // Type the Email address to email field element
            driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("prime523425@gmail.com");

            //Find the Password Field Element and send password on password field
            driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Prime123");

            //Enter confirm password
            driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Prime123");

            //Click on register button
            driver.findElement(By.xpath("//button[@name='register-button']")).click();

            String expectedMessage = "Your registration completed";
            WebElement actualTextElement = driver.findElement(By.xpath("//div[@class='result']"));
            String actualMessage = actualTextElement.getText();
            Assert.assertEquals("Your registration completed", expectedMessage, actualMessage);
        }

        @After
        public void tearDown() {
            closeBrowser();


        }
    }
