package jpetstore;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class JpetstoreCartpage  {
	
	
	WebDriver driver;	
	@FindBy(xpath="//*[@id=\"Catalog\"]/form/table/tbody/tr[2]")
	WebElement dropdown;

	@FindBy(xpath="//*[@id=\"Catalog\"]/form/table/tbody/tr[6]/td[2]/input")
	WebElement fristname;
	@FindBy(xpath="//*[@id=\"Catalog\"]/form/table/tbody/tr[7]/td[2]/input")
	WebElement lastname;
	
	
	@FindBy(xpath="//*[@id=\"Catalog\"]/form/table/tbody/tr[8]/td[2]/input")
	WebElement address1;
	
	@FindBy(xpath="//*[@id=\"Catalog\"]/form/table/tbody/tr[9]/td[2]/input")
	WebElement address2;
	
	@FindBy(xpath="//*[@id=\"Catalog\"]/form/input")
	
	WebElement continuee;
	
	@FindBy(xpath="//*[@id=\"Catalog\"]/a")
	WebElement finish;
	
	@FindBy(xpath="//*[@id=\"BackLink\"]/a")
	WebElement returnn;
	@FindBy(xpath="//*[@id=\"MenuContent\"]/a[2]")
	WebElement signout;
	
public   JpetstoreCartpage(WebDriver driver) {
	super();
    this.driver = driver;
    PageFactory.initElements(driver, this); 
}

public void selectcardtype(String Visa) 
{
	
	Select select =new Select(dropdown);

	select.selectByValue(Visa);
	
	
}

public void details(String Akhilsanthosh,String pss)
{
	fristname.clear();
	fristname.sendKeys(Akhilsanthosh);
	lastname.clear();
	lastname.sendKeys(pss);
}
	
	public void dropdownmethord()
	{
	
		dropdown.click();
	
	}
	
	public void addresss()
	{
		address1.clear();
		address1.sendKeys("valiyaparambil");
		address2.clear();
		Actions act=new Actions(driver);
		act.keyDown(address1,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
		act.keyDown(address1,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
		act.keyDown(address2,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
		act.perform();
	}
	
	public void ending()
	{
		continuee.click();
		finish.click();
		returnn.click();
		signout.click();
	}
	
	
	
	
	}
	
	
	


