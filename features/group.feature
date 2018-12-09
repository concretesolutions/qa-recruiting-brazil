Feature: Group

    Background: WhatsApp Setup
        Given I am on Welcome page
        When  I click on agree and continue button
        Given I am on Permission page
        When  I click on continue button
        Given I am on Permission dialog
        And   I click on allow button
        And   I click on allow button
        Given I am on Verify phone number page
        When  I write my phone number
        And   I click on next button
        And   I click on confirm number button
        And   I click on continue button
        Given I am on Permission dialog
        And   I click on allow button
        Given I am Profile info page
        When  I click on next button on profile info page

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

    Scenario: TCG_002 - Create a group with accent marks on the group name
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
        When  I write the new group name "Farmácia São Paulo"
        And   I click on create new group
        Then  I verify the new group name

    Scenario: TCG_003 - Create a group with group name with the max length
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
        When  I write the new group name with "25" characters
        And   I click on create new group
        Then  I verify the new group name

    Scenario: TCG_003 - Create a group without set a group name
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
        When  I write the new group name with "0" characters
        And   I click on create new group
        Then  I verify that a snackbar is displayed asking the group name
