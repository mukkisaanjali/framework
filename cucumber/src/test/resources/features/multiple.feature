
Feature: login
  I want to use this template for my feature file

  @login
  Scenario: login
    Given open browser and enter url
    When enter username,password and clickon signin
    Then user login into application
    When user clickon signoff
    Then user logout from application
    
     @download
     Scenario: download
     Given open firefoxbrowser and enter url
     When  click on download tab
     And clickon download tab
     And clickon save a file button
     Then file will be uploaded
     @upload
     Scenario: upload  
     Given open browser and enter url
     When  click on post your resume
     And clickon upload your resume 
     And enter filename and clickon open
     Then file will be uploaded