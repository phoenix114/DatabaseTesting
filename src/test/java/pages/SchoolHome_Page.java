package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SchoolHome_Page {
    WebDriver driver;


    public SchoolHome_Page(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);


    }

    @FindBy(xpath= "(//a[@href ='#'])[5]/span[1]")
    public WebElement studentDrop;

    @FindBy(xpath = "(//a[@href ='all-students.html'])")
    public WebElement allStudents;

    @FindBy(linkText = "Add Student")
    public WebElement addStudent;

    @FindBy (xpath = "//a[.='Add Teacher']")
    public WebElement addTeacherButton;

    @FindBy (xpath = "//li[@class='submenu']//span[.=' Teachers']")
    public WebElement teachersButton;

    @FindBy (xpath = "//a[.='All Teacher']")
    public WebElement allTeacherButton;

    @FindBy(xpath = "//a[.='All Students']")
    public WebElement allStudentsButton;

    @FindBy(xpath = "//a[.='Add Student']")
    public WebElement addStudentButton;

    @FindBy (xpath = "//li[@class='submenu']//span[.=' Students']")
    public WebElement studentsButton;

}
