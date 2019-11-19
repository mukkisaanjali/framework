

  Feature: login
  @login
    
    
  Scenario Outline: login
    Given open browser and enter url
    When enter "<username>" and "<password>" clickon signin
    And user clickon logoff
    Then user logout from application

    Examples: 
      | username|password|
      | mercury|mercury|
      | admin|admin123|
