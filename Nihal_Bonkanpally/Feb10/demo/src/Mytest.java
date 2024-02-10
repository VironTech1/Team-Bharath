import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mytest {
    public static void main(String[] args) {
        System.out.println("hello selenium");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\NITHIIN\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.cricbuzz.com/");
    }
}