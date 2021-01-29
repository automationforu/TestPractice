Feature: Dropping a particular Drop Box

  Scenario: Dropping a drop box from one place to another place
    Given Open Browser
    When Enter url "https://jqueryui.com/"
    And click on Droppable
    And Switch to frame
    And select element to drop
    Then close browser