package jpetstore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class JpetstoreLoginpage extends JpetstoreBaseclass{

   // WebDriver driver;

  
    

    @FindBy(xpath = "/html/body/div[2]/div/form/p[2]/input[1]")
    WebElement username;

    @FindBy(xpath = "/html/body/div[2]/div/form/p[2]/input[2]")
    WebElement password;
    
    @FindBy(xpath = "/html/body/div[2]/div/form/input")
    WebElement login;

   
    public JpetstoreLoginpage(WebDriver driver) {
    	super();
        this.driver = driver;
        PageFactory.initElements(driver, this); 
    }
    

   
    public void test(String un, String pwd) {
    	username.clear();
        username.sendKeys(un);
        password.clear();
        password.sendKeys(pwd);
    }

    
    public void submitloginbutton() {
        login.click();
    }
}

