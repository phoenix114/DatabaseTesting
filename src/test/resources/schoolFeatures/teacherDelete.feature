@Smoke
Feature: Deleting Teacher from School UI and Verifying that it does't exist in DB

  @TarikAbi&Delal
  Scenario: Deleting a Teacher
    Given User is opening the cybertekTraining Page
    When User clicks on Teachers dropdown
    And User clicks on All Teachers
    And User will click on Teacher Name and write the name of the Teacher
    And User will click on search button
    And User will click on three dots and select delete
    Then Tester verifies that Teacher is no longer exists in DataBase