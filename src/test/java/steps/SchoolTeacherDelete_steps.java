package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SchoolAllTeachers_Page;
import pages.SchoolHome_Page;
import pages.SchoolTeachersDeleting_Page;
import utilities.Config;

public class SchoolTeacherDelete_steps {
 SchoolAllTeachers_Page schoolAllTeachers_page = new SchoolAllTeachers_Page();
 SchoolTeachersDeleting_Page schoolTeachersDeleting_page= new SchoolTeachersDeleting_Page();
SchoolHome_Page schoolHome_page= new SchoolHome_Page();

    @When("User clicks on All Teachers")
    public void user_clicks_on_All_Teachers() {
        schoolHome_page.allTeacherButton.click();
    }
    @When("User will click on Teacher Name and write the name of the Teacher")
    public void user_will_click_on_Teacher_Name_and_write_the_name_of_the_Teacher() {
        schoolAllTeachers_page.inputForFirstName.sendKeys(Config.getProperty("firstName"));
    }

    @When("User will click on search button")
    public void user_will_click_on_search_button() {
        schoolAllTeachers_page.searchButton.click();
    }

    @When("User will click on {int} dots and select delete")
    public void user_will_click_on_dots_and_select_delete(Integer int1) {

    }

    @Then("Tester verifies that Teacher is no longer exists in DataBase")
    public void tester_verifies_that_Teacher_is_no_longer_exists_in_DataBase() {

    }


}
