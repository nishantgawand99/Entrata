import java.time.Duration;

public class testLayers {
	
	public class Testcase1 {
		
		public void main(String args[])
		
		{
			
			System.setProperty\\(\\"webdriver.chrome.driver","D;selinum file\\entrata\\chromedriver.exe");
			
			webDriver = new ChromeDriver();
			
			driver.get("https://www.entrata.com/");
			driver.manage ().window().maximize();
			driver.manage().deleteAllcookies();
			driver.manage().timeouts().implicitlywait(Duration.ofseconds(20));
			
			Homepage = new Homepage(driver);
			

					
		}
		
		
	}
		
		
		
		
		
		
	}
	
	
	
	


