package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Config;
import utilities.Driver;

public class SchoolTeachersDeleting_Page {
    public SchoolTeachersDeleting_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "(//div[@class='row staff-grid-row']/div)[1]")
    public WebElement teacherNameInDeletingClass;

    @FindBy (xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div/div[2]/div/a[2]")
    public WebElement deleteButton;

}
