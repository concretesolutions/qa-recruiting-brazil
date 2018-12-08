Feature: Group

    Scenario: TCG_001 - Create a group successfully
        Given I am on Chat list page
        When  I click on 3-dots icon
        And   I click on New Group button
        Given I am on Search page
        When  I click on search button
        And   I search for the contact "Paulo"
        And   I click on the contact "1"
        And   I click on search button
        And   I search for the contact "Roberto"
        And   I click on the contact "1"
        And   I click next page on the Search page
        Given I am on the New group page
        When  I write the new group name "New Group"
        And   I click on create new group
        Then  I verify the new group name
