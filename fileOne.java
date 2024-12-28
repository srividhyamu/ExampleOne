

 

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class fileOne {

	private static Object action;
	public fileOne() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\SrividhyaCoding\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Launching the website
		driver.get("https://elpais.com/");
		
		// printing the title of the page
		
		System.out.println("Title is:" +driver.getTitle());
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement accept = driver.findElement(By.id("didomi-notice-agree-button"));
		
		accept.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebElement language = driver.findElement(By.xpath("//*[@id=\'edition_head\']/a/span"));
		
		//*[@id="edition_head"]/a/span
		String websiteText = language.getText();
		System.out.println("Website text displayed is: "+websiteText);
		String expectedText = "ESPAÑA";
	
		WebElement opinion = driver.findElement(By.xpath("//*[@id=\"csw\"]/div[1]/nav/div/a[2]"));
		opinion.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement opinionTitle = driver.findElement(By.xpath("//*[@id='csw']/div/div/h1/a"));
		
			System.out.println(opinionTitle.getAttribute("title")); 
		
	for(int i=0;i<5;i++){
		
		WebElement article = driver.findElements(By.xpath("//div[1]/section/div/article/header/h2")).get(i);
		System.out.println("\n" +(article.getText()));
		
		WebElement articleContent = driver.findElements(By.xpath("//div[1]/section/div/article/p")).get(i);	
		
		System.out.println("\n" +(articleContent.getText())+"\n");
		
		
	}

	
	/*
	  WebElement image=driver.findElements(By.xpath("//div[1]/section/div/article/figure/a/img")).get(0);
	 
Actions actions = new Actions(driver);	
actions.contextClick(image).perform();
actions.getActiveWheel().createScroll(0, 0, 8, null, null);
*/
	
String lang_code = "English";


WebElement article1 = driver.findElements(By.xpath("//div[1]/section/div/article/header/h2")).get(0);
String articleHeading1 = article1.getText();
String input1 = articleHeading1;

WebElement article2 = driver.findElements(By.xpath("//div[1]/section/div/article/header/h2")).get(1);
String articleHeading2 = article2.getText();
String input2 = articleHeading2;

WebElement article3 = driver.findElements(By.xpath("//div[1]/section/div/article/header/h2")).get(2);
String articleHeading3 = article3.getText();
String input3 = articleHeading3;

WebElement article4 = driver.findElements(By.xpath("//div[1]/section/div/article/header/h2")).get(3);
String articleHeading4 = article4.getText();
String input4 = articleHeading4;

WebElement article5 = driver.findElements(By.xpath("//div[1]/section/div/article/header/h2")).get(4);
String articleHeading5 = article5.getText();
String input5 = articleHeading5;



driver.switchTo().newWindow(WindowType.TAB);


driver.get("https://translate.google.co.in/?sl=auto&tl="+lang_code+"&text="+input1+"&op=translate");
WebElement translatedText= driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[2]/div[2]/c-wiz/div/div[6]/div/div[1]/span[1]/span/span"));
System.out.println("Translated Heading: " +(translatedText.getText()));



driver.get("https://translate.google.co.in/?sl=auto&tl="+lang_code+"&text="+input2+"&op=translate");
 translatedText= driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[2]/div[2]/c-wiz/div/div[6]/div/div[1]/span[1]/span/span"));
System.out.println("Translated Heading: " +(translatedText.getText()));



driver.get("https://translate.google.co.in/?sl=auto&tl="+lang_code+"&text="+input3+"&op=translate");
 translatedText= driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[2]/div[2]/c-wiz/div/div[6]/div/div[1]/span[1]/span/span"));
System.out.println("Translated Heading: " +(translatedText.getText()));



driver.get("https://translate.google.co.in/?sl=auto&tl="+lang_code+"&text="+input4+"&op=translate");
 translatedText= driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[2]/div[2]/c-wiz/div/div[6]/div/div[1]/span[1]/span/span"));
System.out.println("Translated Heading: " +(translatedText.getText()));



driver.get("https://translate.google.co.in/?sl=auto&tl="+lang_code+"&text="+input5+"&op=translate");
 translatedText= driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[2]/div[2]/c-wiz/div/div[6]/div/div[1]/span[1]/span/span"));
System.out.println("Translated Heading: " +(translatedText.getText()));


driver.close();

driver.quit();
	
	}



}
