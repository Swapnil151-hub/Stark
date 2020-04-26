Feature: create test for registration - Demowebshop

Scenario Outline: Registration test
* user should navigates demowebshod on chrome browser
* user clicks on register link
* user selects gender
* user enters with  first name as "<fn>"
* user enters with  last name as "<ln>"
*  user enters with email as "<email>"
* user enters with password as "<psd>"
* user enters with confirm password as "<confirmpsd>"
* user clicks on register button
* user should verify registration success


Examples:
|fn|ln|email|confirmpsd|
|swapnil|Ingole|swapnilingole29@gmail.com|Swapnil@29|
|Swapnil1|Ingole1|swapnilingole29@gmail.com|Swapnil@29|
