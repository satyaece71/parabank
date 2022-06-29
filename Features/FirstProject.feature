Feature:  Application Login Functionality

@para1
  Scenario: Verify Invalid user name message
    Given i launch the parabank application using  "http://automationpractice.com/index.php?controller=my-account"
    When i enter  USER NAME as "test1"
    And i enter PASSWORD as "test1"
    And i click on submit button
    Then i Verify  invalid  message is displayed as  "invalid user name"

#  Scenario: Verify Invalid password message
#    Given i launch the parabank application using  "URL"
#    When i enter  USER NAME as "test1"
#    And i enter PASSWORD as "test1"
#    And i click on submit button
#    Then i Verify  invalid  message is displayed as  "invalid password"

