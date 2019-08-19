package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SchoolAddTeachers_Page {

    public SchoolAddTeachers_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//form//input)[1]")
    public WebElement firstName;

    @FindBy(xpath = "(//form//input)[2]")
    public WebElement email;

    @FindBy(xpath = "(//form//input)[3]")
    public WebElement password;

    @FindBy(xpath = "(//form//input)[4]")
    public WebElement subject;

    @FindBy(xpath = "(//form//input)[5]")
    public WebElement birthdate;


    @FindBy(xpath = "(//form//input)[6]")
    public WebElement lastName;

    @FindBy(xpath = "(//form//input)[7]")
    public WebElement joiningDate;

    @FindBy(xpath = "(//form//input)[9]")
    public WebElement mobileNumber;

    @FindBy(xpath = "(//form//input)[10]")
    public WebElement salary;

    @FindBy(xpath = "(//form//input)[11]")
    public WebElement section;


    @FindBy(css = "textarea[id='message']")
    public WebElement premanentAddress;

    @FindBy(xpath = "(//select)[1]")
    public WebElement genderSelect;

    @FindBy(xpath = "(//select)[2]")
    public WebElement batchSelect;

    @FindBy(xpath = "(//select)[3]")
    public WebElement deparment;

    @FindBy(xpath = "//button[.='Submit']")
    public WebElement submitButton;

}
