import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Start {
    WebDriver wd;

    @Test
    public void myTest(){
        wd= new ChromeDriver();
        wd.get("https://telranedu.web.app/home");
        //wd.close(); //only one tab
        wd.quit();

    }

    @Test
    public void secondTest(){

    }
}
