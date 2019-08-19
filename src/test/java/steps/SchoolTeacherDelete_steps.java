package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.SchoolAllTeachers_Page;
import pages.SchoolHome_Page;
import pages.SchoolTeachersDeleting_Page;
import utilities.Config;
import utilities.DBType;
import utilities.DBUtility;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

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
    @When("User will click on three dots and select delete")
    public void user_will_click_on_three_dots_and_select_delete() {
        schoolTeachersDeleting_page.threeDots.click();
        schoolTeachersDeleting_page.deleteButton.click();
        schoolTeachersDeleting_page.lastDeleteButton.click();
    }


    @Then("Tester verifies that Teacher is no longer exists in DataBase")
    public void tester_verifies_that_Teacher_is_no_longer_exists_in_DataBase() throws SQLException {
        DBUtility.openConnection(DBType.ORACLE);
        String query = "select first_name from teacher";
        String nameOfCurrentTeacher = Config.getProperty("firstName");

        List<Map<String, Object>> list = DBUtility.executeSQLquery(query);
        boolean check = true;
        for (Map<String, Object> map : list ) {
            if (map.get("FIRST_NAME").equals(nameOfCurrentTeacher)){
                check = false;
                break;
            }else {
                check=true;
            }
        }
        Assert.assertTrue("Test failed - Current teacher is still in the Data Base",check);

    }


}
