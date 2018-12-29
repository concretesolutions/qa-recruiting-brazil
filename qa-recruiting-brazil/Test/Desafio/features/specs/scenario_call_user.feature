# language: en

Feature: call for a user 
    i as a user would like to 
    Connect via audio and video
    As well as do the user lock.

    Background: 
     Given I'm in the conversation list

 Scenario: make a audio call
  When I select a user to make a audio call 
  And begin a audio call
  Then i see the making audio call for this contact


 Scenario: make a new video call
  When I select a user to make a video call 
  And begin a video call
  Then i see the making video call for this contact 


 Scenario: validate a blocked contact list.
  When i select a user list
  And apply the block
  Then i see a user must have status off locked