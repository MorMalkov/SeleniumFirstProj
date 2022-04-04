import org.junit.Assert;
import org.junit.Test;
public class TestP {

    @Test
    public void getURL() throws InterruptedException {
        SignInAutomation URL =new SignInAutomation("C:\\Selenium\\chromedriver.exe");
        System.out.println(URL.getURL());
        Assert.assertEquals(URL.getURL(),"http://automationpractice.com/index.php");


    }
    @Test
    public void getTitle() throws InterruptedException {
        SignInAutomation title=new SignInAutomation("C:\\Selenium\\chromedriver.exe");
       // פה נתקלנו בבעיה, בפועל בגוגל הtitle הוא My account-My Store אבל זה עשה את זה כהרצה שגויה.
        //בשורת השגיאה בjava הactual הראה My Store בלבד, ולאחר תיקון זה רץ ועבר.
        Assert.assertEquals(title.SignInTest(),"My Store");
        System.out.println(title);
    }
}
