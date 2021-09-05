Feature: TalentTek Sign up feature test suite.

  Scenario: User should be able to sign up with the valid email adress
    Given  I am at talentTek home page
    And  I click on create new account
    And I enter student information with valid email adress
    And I enter student's  date of birth
    And I enter  student gender as female
    And I agree with the form
    When I click Create my account button
    Then I should be able to get an student ID


  Scenario: User should not be able to sign up with the invalid email adress
    Given  I am at talentTek home page
    And  I click on create new account
    And I enter student information with invalid email adress
    And I enter student's  date of birth
    And I enter  student gender as female
    And I agree with the form
    When I click Create my account button
    Then I should not be able to get an student ID