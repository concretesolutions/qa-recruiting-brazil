Feature: DATA AND STORAGE USAGE
  As a user
  In order to manage how much data and store I used
  I want to configure my data and storage usage

  Scenario: User setting all media auto-download to wi-fi only successfully

    Given User is on Data and Store Usage Settings
    When all "media options" is setting to "Wi-Fi"
    Then all "media options" is displayed as Wi-Fi

  Scenario: User reset media auto-download successfully

    Given User is on Data and Store Usage Settings
    When "Reset Auto-Download Settings" is pressed
    Then "Photos" is displayed as "Wi-Fi and Cellular"
    And "Audio", "Videos" and "Documents" are displayed as "Wi-Fi"

  Scenario: User is able to view statistics of Network Usage successfully

    Given User is on Data and Store Usage Settings
    When "Network usage" is pressed
    Then statistics of "Messages", "Chat Media", "Status Media", "Whatsapp Calls" and "Total Bytes" are displayed