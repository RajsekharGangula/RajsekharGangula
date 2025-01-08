package MobileTesting.SnapMoneyAgentApp;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.BeforeClass;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;


public class BaseClass {

	public AndroidDriver driver;
	public AppiumDriverLocalService service;

	@BeforeClass
	public void configuration() throws MalformedURLException
	{

		AppiumDriverLocalService service=new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\ADMIN\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();

		service.start();
		UiAutomator2Options options= new UiAutomator2Options();
		options.setDeviceName("Pixel_8a_API_34");
		options.setApp("C:\\Users\\Admin\\eclipse-workspace\\SnapMoneyAgentApp\\src\\test\\java\\resources\\application-c0032b6a-0afb-4d7e-887f-bc5f7f674a97.apk");
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	//	public void LongPressAction(WebElement ele)
	//	{
	//		((JavascriptExecutor)driver).executeScript("mobile: LongClickGesture",
	//				ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),
	//				"duration",2000));
	//	}

	public void scrollToText(String text)
	{
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\"" +text+"\"));"));
	}
}
