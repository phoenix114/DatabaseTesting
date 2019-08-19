package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class SchoolAllStudents_Page {

    WebDriver driver;


    public SchoolAllStudents_Page(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);


    }


    @FindBy (xpath = "//div[@class='dropdown profile-action']")
    public List<WebElement> threeDotsOnTheAddedStudent;

    @FindBy (xpath = "//a[@data-target='#delete_employee']")
    public List<WebElement> allTheDeleteOptions;

    @FindBy (xpath = "//div[@class='col-md-4 col-sm-6 col-12 col-lg-4 col-xl-3']")
    public List<WebElement> allTheStudentOptions;

    //public WebElement desiredDeleteButton= allTheDeleteOptions.get(allTheDeleteOptions.size()-1);

    @FindBy (xpath = "//button[.='Delete']")
    public WebElement deleteButton;





    @FindBy(xpath= "(//div/h4/a[.='mnwr']/../../div)[2]")
    public WebElement firstStudentToggle;

    @FindBy(xpath= "//a[@aria-expanded='true']/..//a[@data-target='#delete_employee']")
    public WebElement delete;





}
