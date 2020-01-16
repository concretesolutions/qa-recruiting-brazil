Feature: Choose a Whatsapp chat wallpaper from different options
  Whatsapp allows the user to select different chat wallpapers.
  User can select a chat wallpaper from Wallpaper Library, Solid Colors or Photos.
  Also, to each option selected by the user, a preview must be shown to the user.

  Scenario: Select a wallpaper from Wallpaper Library
    Given I have a WhatsApp account configured in my phone
    When I select Whatsapp Setings
    And I click on Chat Wallpaper
    And I click on Wallpaper Library
    And I chose a wallpaper image
    And I click on Set on the preview shown
    Then a new chat wallpaper must be applied

  Scenario: Select a wallpaper from Solid Colors
    Given I have a WhatsApp account configured in my phone
    When I select Whatsapp Setings
    And I click on Chat Wallpaper
    And I click on Solid Colors
    And I chose a wallpaper image
    And I click on Set on the preview shown
    Then a new chat wallpaper must be applied

  Scenario: Select a wallpaper from Photos
    Given I have a WhatsApp account configured in my phone
    And I have at least one image in my gallery
    When I select Whatsapp Setings
    And I click on Chat Wallpaper
    And I click on Photos
    And I chose a wallpaper image
    And I click on Set on the preview shown
    Then a new chat wallpaper must be applied