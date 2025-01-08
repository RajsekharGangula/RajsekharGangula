package Org.PageObjects.Android;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class login {

	AndroidDriver driver;

	public login(AndroidDriver driver)
	{
		this.driver=driver;
//		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath=("//android.widget.Button[@text=\"Allow\"]"))
	private WebElement notification;

	@AndroidFindBy(xpath=("//android.widget.TextView[@text=\"Skip\"]"))
	private WebElement button_skip;

	@AndroidFindBy(xpath=("//android.view.ViewGroup[@content-desc=\"Get Started\"]"))
	private WebElement button_getstarted;

	@AndroidFindBy(xpath=("//android.widget.EditText"))
	private WebElement Enter_phonenumber;

	@AndroidFindBy(xpath=("//android.view.ViewGroup[@content-desc=\"Next\"]"))
	private WebElement Click_Next;

	public void Allownotifications()
	{
		notification.click();
	}

	public void skip_carousal()
	{
		button_skip.click();
	}

    public void click_getstarted()
    {
    	button_getstarted.click();
    }
    
    public void Enter_mobile_number()
    {
    	Enter_phonenumber.sendKeys("");
    }
    
    public void click_Next()
    {
    	Click_Next.click();
    }

}
