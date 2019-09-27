Feature: Registration feature

  Scenario Outline: Register to the TeatMeApp
    Given The registraion page opened
    When user will enter username "<username>"
    And user enter firstname "<firstname>"
    And user enter lastname "<lastname>"
    And user enter password "<password>"
    And user enter  confirm "<confirm>"
    Then user press register button

    Examples: 
      |username|firstname|lastname|password |confirm |
      |name    |    first| last   | Pass1234|Pass1234|
