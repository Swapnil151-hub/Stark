Feature: create test for registration - Demowebshop

Scenario: Registration test
Given user should navigates demowebshod on chrome browser
When user clicks on register link
And user selects gender
And user enters with  first name
And user enters with  last name
And user enters with email
And user enters with password
And user enters with confirm password
And user clicks on register button
Then user should verify registration success
