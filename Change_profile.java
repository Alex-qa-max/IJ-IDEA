import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Change_profile {

    public static WebDriver driver;

    @Test
    public void Login() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "E:\\Testing\\Driver\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://users.bugred.ru/");
        driver.findElement(By.xpath("//*[contains(text(), \"Войти\")]")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("toptest1@gmail.com");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("123456");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/form/table/tbody/tr[3]/td[2]/input")).submit();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"fat-menu\"]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"fat-menu\"]/ul/li[1]/a")).click();
        WebElement UploadImg = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[1]/td[2]/input"));
        UploadImg.sendKeys("E:\\Testing\\Driver\\top.png");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[2]/td[2]/input")).clear();
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("newtoptest");
        Select drpname = new Select(driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[3]/td[2]/select")));
        drpname.getOptions();
        drpname.getFirstSelectedOption();
        drpname.selectByIndex(1);
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[4]/td[2]/input")).sendKeys("24.12.1999");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[5]/td[2]/input")).sendKeys("24.12.2019");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[6]/td[2]/textarea")).sendKeys("MORE TESTING");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[7]/td[2]/input")).sendKeys("123456789101");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[8]/td[2]/input")).click();

        driver.quit();
    }}