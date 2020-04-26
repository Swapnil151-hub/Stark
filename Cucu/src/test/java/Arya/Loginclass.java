package Arya;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
 
public class Loginclass {
    static WebDriver c;
    //construtor
    public Loginclass(WebDriver c){
        this.c=c;
    }
    
    //save login page webelements
     //static By loginlink=By.linkText("Log in");
     
     @FindBy(linkText="Log in") static WebElement loginlink;
    static By email=By.id("Email");
    static By psd=By.id("Password");
    static By loginbutton=By.xpath("//input[@value='Log in']");
    
    //functionality or method
    
    public static void clicklogin(){
        loginlink.click();
        
    }
    public static void enteremail(String mail){
        c.findElement(email).sendKeys(mail);
        
    }
    public static void enterpsd(String password){
     c.findElement(psd).sendKeys(password);
    
    }
    public static void clickloginbutton(){
       c.findElement(loginbutton).click();
    }
 
}