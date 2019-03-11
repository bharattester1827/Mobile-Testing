package testingAndroid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
//import org.testng.annotations.Test;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AndroidTesting {

	static AndroidDriver<MobileElement> driver; 
	@Test
	public void MobileTest1 () throws MalformedURLException, InterruptedException {
	DesiredCapabilities cap = DesiredCapabilities.android();
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "SamsungTest");
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "4.4.4");
	cap.setCapability(MobileCapabilityType.APP, "C:\\Users\\BharatP\\eclipse-workspace\\Evolvi Mobile_v19.00.00_apkpure.com.apk");
		
	driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	Thread.sleep(12000);
	driver.findElement(By.xpath("//android.widget.EditText[@text='Username' and @index='0']")).sendKeys("jenniferw@evolvi.co.uk");;
	driver.findElement(By.xpath("//android.widget.EditText[@text='••••••••' and @index='0']")).sendKeys("abc123");
	driver.findElement(By.xpath("//android.widget.EditText[@text='TMC' and @index='0']")).sendKeys("http://ldt3.dailybuild3.test/");
	driver.findElement(By.xpath("//android.widget.Button[@index='0']")).click();
	Thread.sleep(5000);
	driver.findElement(By.id("android:id/button1")).click();
	driver.findElement(By.id("android:id/button1")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//android.view.View[@content-desc='SAVE SETTINGS' and @index='0']")).click();
	driver.findElement(By.xpath("//android.view.View[@content-desc='liverpool (any)' and @index='1']")).sendKeys("Manchester");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//android.view.View[@content-desc='Manchester (any) [115]' and @index='0']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//android.view.View[@content-desc='london (any)' and @index='1']")).sendKeys("London");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//android.view.View[@content-desc='London (any) [182]' and @index='0']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//android.view.View[@content-desc='FARE SEARCH' and @index='0']")).click();
	
	//driver.quit();
	}

}
