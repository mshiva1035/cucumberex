Feature: Ripley Shopping Automation

Scenario: add to basket
Given I am on the shopping website
When I search for the item
And I go to the item details page
And I add the item to the basket
Then I can view the item in my basket