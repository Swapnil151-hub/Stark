Feature: create test for registration - TestMeApp

Scenario: Registration test
Given user should navigates Registration on chrome browser
And user enters the user name  as "user1"
And user enters with  first name as "Swapnil89"
And user enters with  last name as  "Ingole2"
And user enters with password as "Kanewilliamson"
And user enters with confirm password asw"Kanewilliamson"
And user selects gender
And user enters with email as "swapnilingo29@gmail.com"
And user enters with mobile number as "857954624"
And user enters with date of birth as "29/04/1997"
And user enters the address as "london"
And user select the security question
And user answer the security question
And user clicks on register button
Then user should verify registration success