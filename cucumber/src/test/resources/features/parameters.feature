
Feature: login
  

  @login
  Scenario: login
    Given open browser and enter url
    When  enter "anjali" ,"chintu" and clickon signin
    And  user clickon logoff
    Then user logout from application
    
        
 