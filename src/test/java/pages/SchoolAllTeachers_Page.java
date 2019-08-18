package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SchoolAllTeachers_Page {

    public SchoolAllTeachers_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "(//div[@id='app']//input)[2]")
    public WebElement inputForFirstName;

    @FindBy(xpath = "//a[.=' Search ']")
    public WebElement searchButton;
}
