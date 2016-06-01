package libs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NoteUtilities {
	public static void clickOnButtonContinue(WebDriver driver) {
		driver.findElement(By.className("android.widget.Button")).click();
		System.out.println("Button continue was clicked");
	}
	
	
	public static void createNote(WebDriver driver, String text) {
		driver.findElement(By.name("New note")).click();
		driver.findElement(By.className("android.widget.EditText")).sendKeys(text);
		System.out.println("Note was created");
		
	}
	
	public static void clearNoteByText(WebDriver driver, String text) {
		driver.findElement(By.name(text)).click();
		driver.findElement(By.className("android.widget.EditText")).clear();
		driver.findElement(By.name("Save")).click();
		System.out.println("Note was deleted");
	}
}
