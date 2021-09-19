Feature: TalentTek Sign Up feature test suite.
  @signup @regression @smoke @prod @test
  Scenario: User should be able to Sign Up with the valid email adress
    Given  I am at talentTek home page
    And  I click on create New Account button
    And I enter student information with valid email adress
    And I enter student's  date of birth
    And I enter  student gender as female
    And I agree with the form
    When I click Create my account button
    Then I should be able to get an student id