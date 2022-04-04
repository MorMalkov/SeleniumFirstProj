import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project2 {
    public static void main(String[] args) throws InterruptedException {
        //הגדרת דרייבר
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver driver2 = new ChromeDriver();
        //פקודת כניסה לגוגל
        driver2.get("https://www.google.co.il");
        //פקודת הגדלת מסך
        driver2.manage().window().maximize();
        //פקודת כניסה לאתר הנבדק
        driver2.get("http://automationpractice.com/index.php");
        //שורה הבאה היא תזמון שיקל על המערכת לפעול ביעילות וללא לחץ או חוסר זמן
        Thread.sleep(2500);
        //הגדרת לחיצה על כפתור ההרשמה שמופיע בצד ימין למעלה
        WebElement SignIn = driver2.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
        SignIn.click();
        Thread.sleep(2500);
        //הגדרת לחיצה על כפתור הגדרת מייל
        WebElement CreateEmailBou = driver2.findElement(By.xpath("//*[@id=\"email_create\"]"));
        Thread.sleep(2500);
        CreateEmailBou.click();
        //הגדרת התווים שיישלחו לתוך שדה מייל
        CreateEmailBou.sendKeys("projectt1@gmail.com");
        //הגדרת לחיצה על כפתור יצירת משתמש שיוביל לדף עם שדות למילוי למטרת יצירת חשבון
        WebElement CreateBou = driver2.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
        CreateBou.click();
        Thread.sleep(10000);
        //פקודת לחיצה על בחירה באדון או גברת
        WebElement MrMrsBou = driver2.findElement(By.xpath("//*[@id=\"id_gender1\"]"));
        MrMrsBou.click();
        //פקודת לחיצה על שדה שם פרטי
        WebElement FName = driver2.findElement(By.xpath("//*[@id=\"customer_firstname\"]"));
        Thread.sleep(2500);
        //הגדרת התווים שיישלחו לתוך שדה שם פרטי
        FName.sendKeys("project");
        WebElement LName = driver2.findElement(By.xpath("//*[@id=\"customer_lastname\"]"));
        Thread.sleep(2500);
        //LName.click();
        LName.sendKeys("number two");
        Thread.sleep(2500);
        //פקודת לחיצה על שדה ססמה
        WebElement Pass = driver2.findElement(By.xpath("//*[@id=\"passwd\"]"));
        //Pass.click();
        //הגדרת התווים שיישלחו לתוך שדה ססמה
        Pass.sendKeys("projectnum2");
        //פקודת לחיצה על שדה רשימת יום
        WebElement Day = driver2.findElement(By.xpath("//*[@id=\"days\"]"));
        //הוספה של 'קליק' כי בחירה מתוך רשימה
        Day.click();
        Thread.sleep(10000);
        //בחירה של יום מסויים מתוך הרשימה. נעשה על ידי העתקת XPATH של OPTION מתןך דף HTML
        WebElement SpecificDay = driver2.findElement(By.xpath("//*[@id=\"days\"]/option[3]"));
        //קליק מאחר וזה בחירה מתוך רשימה
        SpecificDay.click();
        Thread.sleep(10000);
        //פקודת לחיצה על שדה רשימת חודשים
        WebElement Month = driver2.findElement(By.xpath("//*[@id=\"months\"]"));
        Thread.sleep(10000);
        //קליק מאחר וזה בחירה מתוך רשימה
        Month.click();
        //בחירה של חודש מסויים מתוך הרשימה. נעשה ע"י העתקת XPATH של OPTION מתוך דף HTML
        WebElement SpecificMonthJUN = driver2.findElement(By.xpath("//*[@id=\"months\"]/option[2]"));
        Thread.sleep(10000);
        //קליק מאחר וזה בחירה מתוך רשימה
        SpecificMonthJUN.click();
        //פקודת לחיצה על שדה רשימת שנים
        WebElement Year = driver2.findElement(By.xpath("//*[@id=\"years\"]"));
        //הקצבת זמן גדולה כי לוקח למחשב יותר זמן לבצע פעולה מתוך רשימה
        Thread.sleep(10000);
        //קליק מאחר וזה בחירה מתוך רשימה
        Year.click();
        //בחירה של שנה ספציפית מתוך הרשימה. נעשה ע"י העתקת XPATH של OPTION מתוך הרשימה
        WebElement SpecificYear = driver2.findElement(By.xpath("//*[@id=\"years\"]/option[9]"));
        Thread.sleep(10000);
        SpecificYear.click();
        Thread.sleep(5000);
        //פקודת לחיצה על שדה כתובת
        WebElement Adress = driver2.findElement(By.xpath("//*[@id=\"address1\"]"));
        //Adress.click();
        //הגדרת התווים שיישלחו לתןך שדה הכתובת
        Adress.sendKeys("Ramat Gan 1001 qa qa");
        Thread.sleep(5000);
        //פקודת לחיצה על שדה עיר
        WebElement City = driver2.findElement(By.xpath("//*[@id=\"city\"]"));
        //City.click();
        //הגדרת התווים שיישלחו לתוך שדה עיר
        City.sendKeys("Ramat gan");
        Thread.sleep(5000);
        //פקודת לחיצה על שדה מדינה
        WebElement State = driver2.findElement(By.xpath("//*[@id=\"id_state\"]"));
        //קליק כי זו רשימה
        State.click();
        //בחירת ערך ספציפי מתוך רשימת המדינות
        WebElement SpecificState = driver2.findElement(By.xpath("//*[@id=\"id_state\"]/option[3]"));
        SpecificState.click();
        //פקודת לחיצה על מיקוד
        WebElement Zip = driver2.findElement(By.xpath("//*[@id=\"postcode\"]"));
        Zip.click();
        //הגדרת התווים שיישלחו לתוך שדה מיקוד
        Zip.sendKeys("12345");
        //פקודת לחיצה על ארץ
        WebElement Country = driver2.findElement(By.xpath("//*[@id=\"id_country\"]"));
        //קליק כי זו רשימה
        Country.click();
        //בחירת ערך ספציפי מתוך רשימת הארצות
        WebElement SpecificCountry = driver2.findElement(By.xpath("//*[@id=\"uniform-id_country\"]"));
        SpecificCountry.click();
        //פקודת בחירה בשדה מספר טלפון
        WebElement PhoneNum = driver2.findElement(By.xpath("//*[@id=\"phone_mobile\"]"));
        PhoneNum.click();
        //הגדרת התווים שיישלחו לתוך שדה מספר הטלפון
        PhoneNum.sendKeys("0500000000");
        //הגדרת ערך כתובת שוב
        WebElement AgainAdress = driver2.findElement(By.xpath("//*[@id=\"alias\"]"));
        AgainAdress.click();
        //הגדרת התווים שיישלחו לתוך השדה
        AgainAdress.sendKeys("Ramat Gan 1001 qa qa");
        //לחיצה על לחצן ההרשמה. יבצע הרשמה וכניסה לאתר ישירות לעמוד MY ACCOUNT - MY STORE
        WebElement Registor = driver2.findElement(By.xpath("//*[@id=\"submitAccount\"]/span"));
        Registor.click();
        Thread.sleep(3400);
        //סגירת העמוד
        driver2.close();

    }
}
