Feature: Automobile Insurance

  @run
   	
  Scenario: Fill out the forms about automobile Insurance
    Given I access the website "http://sampleapp.tricentis.com/101/app.php"
    When I enter Vehicle Data 
    Then I pressione next to go to the "Enter Insurant Data" tab
    And I enter Insurant Data 
    Then I pressione next to go to the "Enter Product Data" tab
 		And I enter Product Data 
 		Then I pressione next to go to the "Select Price Option" tab
    And I select price Option  
    Then I pressione next to go to the "Send Quote" tab
		And I Send Quote
		When I send
    Then I will see the message in the screen
