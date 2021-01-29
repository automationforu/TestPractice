Feature: To Drag a Web Element

  Scenario: To Drag a WebElement From one place to another place
    Given Open Browser
    When launch url "https://jqueryui.com/"
    And click on Draggable
    And Switch to frame
    And Select WebElement To Drag
    Then Close Browser