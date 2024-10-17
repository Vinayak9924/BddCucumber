@test
Feature: Handling Forms

  @Enterdata
  Scenario Outline: Entering data into form
    Given user user has launched the website
    When user enters name as Test
    And Selects "<favdrink>" as his fav drink
    Then user verifies he has selected water as his fav drink

    Examples: 
      | favdrink |
      | Milk     |
      | Coffee   |
      | Water    |
      | Wine     |

  @Handlinguploadfile
  Scenario: upload the file
    Given user has launched the website for upload the file
    When user uploads file

  @EnteringDataByUsingDataTables
  Scenario: Entering data into form
    Given user user has launched the website
    When user enters name as Test
      | Milk   |
      | Coffee |
      | Water  |
      | Wine   |
    Then user takes screenshot
