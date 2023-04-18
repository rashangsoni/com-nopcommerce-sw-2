package testsuite;

import browserfactory1.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {

    String baseURL = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseURL);
    }
    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        // click on Computers
        WebElement computers =  driver.findElement(By.linkText("Computers"));
        computers.click();

        //verify the text 'computer'
        String expectedMessage = "Computers";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(), 'Computers')]"));
        String actualMessage = actualTextElement.getText();
       Assert.assertEquals("Not navigated to Computers",expectedMessage,actualMessage);//for the message control+p

    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        // click on Electronics
        WebElement computers =  driver.findElement(By.linkText("Electronics"));
        computers.click();

        //verify the text 'Electronics'
        String expectedMessage = "Electronics";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(), 'Electronics')]"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals("Not navigated to Electronics",expectedMessage,actualMessage);//for the message control+p


    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        // click on Apparel
        WebElement computers =  driver.findElement(By.linkText("Apparel"));
        computers.click();

        //verify the text Apparel
        String expectedMessage = "Apparel";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(), 'Apparel')]"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals("Not navigated to Apparel",expectedMessage,actualMessage);//for the message control+p


    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        // click on DigitalDownloads
        WebElement computers =  driver.findElement(By.linkText("Digital downloads"));
        computers.click();

        //verify the text 'Digital downloads'
        String expectedMessage = "Digital downloads";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(), 'Digital downloads')]"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals("Not navigated to Digital downloads",expectedMessage,actualMessage);//for the message control+p


    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        // click on Books
        WebElement computers =  driver.findElement(By.linkText("Books"));
        computers.click();

        //verify the text 'Books'
        String expectedMessage = "Books";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(), 'Books')]"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals("Not navigated to Books",expectedMessage,actualMessage);//for the message control+p


    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        // click on Jewelry
        WebElement computers =  driver.findElement(By.linkText("Jewelry"));
        computers.click();

        //verify the text 'Jewelry'
        String expectedMessage = "Jewelry";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(), 'Jewelry')]"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals("Not navigated to Jewelry",expectedMessage,actualMessage);//for the message control+p


    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        // click on GiftCards
        WebElement computers =  driver.findElement(By.linkText("Gift Cards"));
        computers.click();

        //verify the text 'Gift Cards'
        String expectedMessage = "Gift Cards";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(), 'Gift Cards')]"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals("Not navigated to Gift Cards",expectedMessage,actualMessage);//for the message control+p


    }
    @After
    public void tearDown(){
        closeBrowser();
    }
}
