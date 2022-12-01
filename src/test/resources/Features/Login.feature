Feature: Login
    In order to perform successful login
    As a User
    I have to enter correct username and password
    
    
Scenario: Login to the Facebook Website
        Given User navigates to the facebook website
        When  User validates the homepage title
        Then User enters Username
        And  User enters password
        And user clicks on the signin button
        And user open to Mainpage