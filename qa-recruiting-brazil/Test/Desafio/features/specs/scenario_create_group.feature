# language: en

Feature: create a new gruop
   i like user whatsapp would 
   Like to be able to create groups
   For interaction with friends.     
Background: 
  Given I'm in the conversation list
   
Scenario: create a gruop with four contacts
  When I choose to create a new group with four contacts
  And I give the name of the group
  Then a new group must be shown in the conversation list

Scenario: change image profile
  Given I'm in the group chat
  When I change the image of the group 
  Then a new image should be displayed
 
Scenario: apply notification mute a group
  When I'm in the group chat
  And enable mute option for 8 o'clock
  Then the group without notification should be viewed


