@Smoke
Feature: Adding Teacher to the School database and verifying

  Background: User in on the School page

    Given User is opening the cybertekTraining Page


  @Azamat
  Scenario: Teacher is feeling out all info and adding to the list of the Teachers

    And User clicks on Teachers dropdown
    And User clicks on Add Teacher
    And User fills out information field
    And User clicks on Submit button to submit new Teacher
    Then Tester verifies if new Teacher exists in DataBase