package jpetstore;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Jpetstorehomepage {
	
WebDriver driver;


@FindBy(xpath="//*[@id=\"LogoContent\"]/a/img")
WebElement logo;


@FindBy(xpath="//*[@id=\"MainImageContent\"]/img")
WebElement image;


@FindBy(tagName="a")
List<WebElement> allLinks;

@FindBy(xpath="//*[@id=\"SearchContent\"]/form/input[1]")
WebElement search;

@FindBy(xpath="//*[@id=\"SearchContent\"]/form/input[2]")
	WebElement searchclick;

@FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
WebElement productclick;

@FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")

 WebElement addcart;

@FindBy(xpath="//*[@id=\"Cart\"]/a")
WebElement proceedcheckout;

	
public  Jpetstorehomepage (WebDriver driver) {
	super();
    this.driver = driver;
    PageFactory.initElements(driver, this);
}

public void tittle()
{
	String s=driver.getTitle();
	String exp="JPetStore Demo";
if(s.equals(exp))
	{
		System.out.println(" expected tittle is passed");
	}
	else
	{
		System.out.println(" expected tittle is failed");
	}
}
public void takescreenshot() throws IOException {
	
File s=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileHandler.copy(s, new File("c://Screenshot//screenshot.png"));

File s1=image.getScreenshotAs(OutputType.FILE);
FileHandler.copy(s1, new File("./Screenshot/imagescreenshot.png"));
}







public void verifylogo()
{
	boolean l=logo.isDisplayed();
			if(l)
			{
				System.out.println("lopgo is  present");
			}
	
	else
	{
		System.out.println("logo is absent");
	}
	}






public void getlinkcount()
{
	System.out.println("total no of links="+allLinks.size());
	for
	(WebElement ele:allLinks)
	{
		String link=ele.getAttribute("href");
		verify(link);
		
	}
}

	public void verify(String link) {

	
		
		try
		{
			URI ob=new URI(link);
			HttpURLConnection con=(HttpURLConnection)ob.toURL().openConnection();
			if(con.getResponseCode()==200)
			{
				System.out.println("sucess response code is 200-------"+link);
			}
			else if(con.getResponseCode()==404)
			{
				System.out.println("broken link response code is 404------"+link);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		}
		
		
	

	public  void  searching(String fish)
	{
	search.sendKeys(fish);
	}
	
	
	
	
	public void  click()
	{
		searchclick.click();
		productclick.click();
		addcart.click();
		proceedcheckout.click();
	}

}
