package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SchoolAddTeachers_Page;
import pages.SchoolHome_Page;
import utilities.Config;
import utilities.Driver;

public class SchoolTeacherAdd_steps {
    SchoolHome_Page schoolHome_page = new SchoolHome_Page();
    SchoolAddTeachers_Page schoolAddTeachers_page =new SchoolAddTeachers_Page();


    @Given("User is opening the cybertekTraining Page")
    public void user_is_opening_the_cybertekTraining_Page() {
        Driver.getDriver().get(Config.getProperty("schoolUrl"));
    }

    @When("User clicks on Teachers dropdown")
    public void user_clicks_on_Teachers_dropdown() {
        schoolHome_page.teachersButton.click();
    }

    @When("User clicks on Add Teacher")
    public void user_clicks_on_Add_Teacher() {
        schoolHome_page.addTeacherButton.click();
    }

    @When("User fills out information field")
    public void user_fills_out_information_field() {
        schoolAddTeachers_page.firstName.sendKeys(Config.getProperty("firstName"));
        schoolAddTeachers_page.lastName.sendKeys(Config.getProperty("lastName"));
        schoolAddTeachers_page.email.sendKeys(Config.getProperty("email"));
        schoolAddTeachers_page.joiningDate.sendKeys("01/12/2015");
        schoolAddTeachers_page.password.sendKeys(Config.getProperty("password"));
        schoolAddTeachers_page.subject.sendKeys(Config.getProperty("subject"));
        schoolAddTeachers_page.mobileNumber.sendKeys("1254784545");
        schoolAddTeachers_page.birthdate.sendKeys("12/01/1987");
        schoolAddTeachers_page.salary.sendKeys("1000");
        schoolAddTeachers_page.section.sendKeys("any");
        schoolAddTeachers_page.premanentAddress.sendKeys(Config.getProperty("premanentAddress"));
    }

    @When("User clicks on Submit button to submit new Teacher")
    public void user_clicks_on_Submit_button_to_submit_new_Teacher() {
        schoolAddTeachers_page.submitButton.click();
    }

    @Then("Tester verifies if new Teacher exists in DataBase")
    public void tester_verifies_if_new_Teacher_exists_in_DataBase() {

    }

}
