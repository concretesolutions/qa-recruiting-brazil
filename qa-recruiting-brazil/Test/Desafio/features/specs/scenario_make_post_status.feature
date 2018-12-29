# language: en

Feature: Make a post status

        i as the product owner (O.P) would
        Like to be able to post photo and
        Image and text
    Background: 
     Given I'm in the status list


    Scenario: Making a post status via photo
        When i take a picture 
        And i do send post picture
        Then the Image must have update on profile status


    Scenario: Making a post status via video
        When i take a video 
        And i do send post video
        Then the video must have update on profile status


    Scenario: Making a post status with a text 
        When i input any phase 
        And i do send post phase
        Then the post must have update on profile status this message
        