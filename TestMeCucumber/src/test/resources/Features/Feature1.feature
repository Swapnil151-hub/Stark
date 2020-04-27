Feature: create test for registration - TestMeApp

Scenario: Registration test
Given user should navigates Registration on chrome browser
And user enters the user name
And user enters with  first name
And user enters with  last name
And user enters with password
And user enters with confirm password
And user selects gender
And user enters with email
And user enters with mobile number
And user enters with date of birth
And user enters the address
And user select the security question
And user answer the security question
And user clicks on register button
Then user should verify registration success

