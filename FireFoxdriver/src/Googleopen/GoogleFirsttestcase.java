package Googleopen;

import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleFirsttestcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		try
		{
			//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			//driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
			driver.get("https://www.mail.com");
			System.out.println("Hello Mail.com");;
			//driver.manage().window().maximize();
			//Thread.sleep(5000);
			
		}
		catch(Exception e)
		{
			System.out.println("Exception->" +e.toString());
		}
		finally
		{
			//System.out.println("Pass");
			driver.close();
			driver.quit();
		}
		

	}

}
