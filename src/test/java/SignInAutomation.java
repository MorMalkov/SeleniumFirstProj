import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignInAutomation {
    private String URL;

    public SignInAutomation(String URL) {
        this.URL = URL;

       /* System.setProperty("webdrivr.chrome.driver", this.URL);
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver driverP = new ChromeDriver();*/
    }

    public String getURL() {
        System.setProperty("webdriver.chrome.driver", this.URL);
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        System.out.println(driver.getCurrentUrl());
        return driver.getCurrentUrl();

    }

    public String SignInTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", this.URL);
        WebDriver driver = new ChromeDriver();

        driver.get("http://automationpractice.com/index.php");
        WebDriver driver2 = new ChromeDriver();
        driver2.get("https://www.google.co.il");
        driver2.manage().window().maximize();
        driver2.get("http://automationpractice.com/index.php");
        Thread.sleep(2500);
        WebElement SignIn = driver2.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
        SignIn.click();
        Thread.sleep(2500);
        WebElement CreateEmailBou = driver2.findElement(By.xpath("//*[@id=\"email_create\"]"));
        Thread.sleep(2500);
        CreateEmailBou.click();
        CreateEmailBou.sendKeys("projectt99@gmail.com");
        WebElement CreateBou = driver2.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
        CreateBou.click();
        Thread.sleep(10000);
        WebElement MrMrsBou = driver2.findElement(By.xpath("//*[@id=\"id_gender1\"]"));
        MrMrsBou.click();
        WebElement FName = driver2.findElement(By.xpath("//*[@id=\"customer_firstname\"]"));
        Thread.sleep(2500);
        //FName.click();
        FName.sendKeys("project");
        WebElement LName = driver2.findElement(By.xpath("//*[@id=\"customer_lastname\"]"));
        Thread.sleep(2500);
        //LName.click();
        LName.sendKeys("number two");
        Thread.sleep(2500);
        WebElement Pass = driver2.findElement(By.xpath("//*[@id=\"passwd\"]"));
        //Pass.click();
        Pass.sendKeys("projectnum2");
        WebElement Day = driver2.findElement(By.xpath("//*[@id=\"days\"]"));
        Day.click();
        Thread.sleep(10000);
        WebElement SpecificDay = driver2.findElement(By.xpath("//*[@id=\"days\"]/option[3]"));
        SpecificDay.click();
        Thread.sleep(10000);
        WebElement Month = driver2.findElement(By.xpath("//*[@id=\"months\"]"));
        Thread.sleep(10000);
        Month.click();
        WebElement SpecificMonthJUN = driver2.findElement(By.xpath("//*[@id=\"months\"]/option[2]"));
        Thread.sleep(10000);
        SpecificMonthJUN.click();
        WebElement Year = driver2.findElement(By.xpath("//*[@id=\"years\"]"));
        Thread.sleep(10000);
        Year.click();
        WebElement SpecificYear = driver2.findElement(By.xpath("//*[@id=\"years\"]/option[9]"));
        Thread.sleep(10000);
        SpecificYear.click();
        Thread.sleep(5000);
        WebElement Adress = driver2.findElement(By.xpath("//*[@id=\"address1\"]"));
        //Adress.click();
        Adress.sendKeys("Ramat Gan 1001 qa qa");
        Thread.sleep(5000);
        WebElement City = driver2.findElement(By.xpath("//*[@id=\"city\"]"));
        //City.click();
        City.sendKeys("Ramat gan");
        Thread.sleep(5000);
        WebElement State = driver2.findElement(By.xpath("//*[@id=\"id_state\"]"));
        State.click();
        Thread.sleep(3000);
        WebElement SpecificState = driver2.findElement(By.xpath("//*[@id=\"id_state\"]/option[3]"));
        SpecificState.click();
        Thread.sleep(3000);
        WebElement Zip = driver2.findElement(By.xpath("//*[@id=\"postcode\"]"));
        Zip.click();
        Zip.sendKeys("12345");
        Thread.sleep(3000);
        WebElement Country = driver2.findElement(By.xpath("//*[@id=\"id_country\"]"));
        Country.click();
        Thread.sleep(3000);
        WebElement SpecificCountry = driver2.findElement(By.xpath("//*[@id=\"uniform-id_country\"]"));
        SpecificCountry.click();
        Thread.sleep(3000);
        WebElement PhoneNum = driver2.findElement(By.xpath("//*[@id=\"phone_mobile\"]"));
        PhoneNum.click();
        PhoneNum.sendKeys("0500000000");
        Thread.sleep(3000);
        WebElement AgainAdress = driver2.findElement(By.xpath("//*[@id=\"alias\"]"));
        AgainAdress.click();
        Thread.sleep(3000);
        AgainAdress.sendKeys("Ramat Gan 1001 qa qa");
        Thread.sleep(3000);
        WebElement Registor = driver2.findElement(By.xpath("//*[@id=\"submitAccount\"]/span"));
        Registor.click();
        Thread.sleep(3400);
        driver2.close();

        return driver.getTitle();
    }
}
