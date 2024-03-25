package runner;

import org.openqa.selenium.chrome.ChromeDriver;

import drivers.Drivers;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Executa extends Drivers{
	
	public void abrirNavegador() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();			
	}

	public void fecharNavegador() {
		driver.quit();
		
	}
}
