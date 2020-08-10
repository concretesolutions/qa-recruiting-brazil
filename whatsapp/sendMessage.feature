  @runSendWhatsFeature
  Feature: User status messages
    @critical
    Scenario Outline: User send a message successfully
      Given I open Whatsapp Application
      Then I'm on the chat screen
      When I click on Write Message icon
      Then New chat modal was open successful
      When I type on search textfield: <friendName>
      Then Users will be filtered and User
      When I click on the first result 
      Then I am on <friendName> private chat
      When I type on message textfield: <message> 
      Then send message button was displayed
      When I click on send message button
      Then The message was displayed on the internal screen
      Then The first checkmark was displayed

      Examples:
        | friendName             | message                                                                             | 
        | Renato Araújo          | Hi There!\n I'm sending you this message to testing the send message feature        |
        | Juliana Freitas        | :) follow my message with emoji to make your day even better                        |
        | Jhon Due Interviewer   | Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis massa leo, pretium non condimentum a, consequat et dui. Cras quis elit dignissim, fermentum ex non, convallis metus. Fusce facilisis pellentesque hendrerit. Fusce vitae scelerisque lacus, nec ultricies dolor. Sed tincidunt sagittis tempor. Donec posuere lacus vel semper iaculis. Praesent vel bibendum turpis. Aenean ultrices pulvinar interdum. Praesent scelerisque ipsum lacus, id iaculis enim efficitur vestibulum. Maecenas ac leo a tellus tincidunt tincidunt. Donec sodales ornare urna, sit amet porta nulla. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Sed eget libero tincidunt, imperdiet velit id, elementum nunc. Aliquam non tempus libero, vel porttitor mauris. Donec posuere nisi vitae lectus posuere, nec elementum ligula faucibus. Mauris dolor purus, blandit sit amet dapibus commodo, dictum nec mauris. Curabitur nec ante pretium, aliquam urna ut, pharetra sem. Maecenas ipsum tellus, sodales a neque id, euismod posuere tortor. Aenean porta risus quis turpis porta faucibus eget ultricies lectus. Cras porttitor eros non maximus euismod. Pellentesque non dui leo. Proin et tempor risus. Vestibulum sit amet porta odio. Curabitur sed lacus enim. Phasellus vehicula vestibulum justo quis auctor. Cras vitae finibus arcu. Aenean tempus malesuada tortor, a rhoncus risus sodales nec. Sed dapibus eleifend massa. Praesent volutpat pellentesque arcu in facilisis. \nEtiam nibh sapien, dignissim a erat id, efficitur pulvinar nunc. Suspendisse euismod ut tortor bibendum congue. Nulla erat orci, sodales ac dolor id, imperdiet viverra nisi. Interdum et malesuada fames ac ante ipsum primis in faucibus. Etiam eleifend sapien neque. Curabitur vitae pharetra nibh, tempor viverra diam. Pellentesque venenatis magna nisl, id placerat ligula vehicula nec. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Etiam eget malesuada leo. Nunc placerat orci neque, at dignissim diam venenatis vitae. Donec lobortis eu mi at mattis. Vestibulum molestie tellus a enim dapibus varius. Maecenas vitae augue augue.\n Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Duis ante enim, gravida consequat dolor ut, sodales volutpat sapien. Maecenas felis erat, laoreet euismod tempor a, tempor et libero. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Suspendisse eget felis erat. Integer pharetra pharetra elit tempus posuere. Phasellus consectetur at erat accumsan blandit. Etiam sed lacus libero. Sed hendrerit finibus hendrerit. Phasellus consectetur tempor quam eget semper. Cras congue molestie dui, id facilisis tortor sollicitudin a.       |

    @critical
    Scenario Outline: User delete for all a message
      Given I open Whatsapp Application
      Then I'm on the chat screen
      When I click on Write Message icon
      Then New chat modal was open successful
      When I type on search textfield: <friendName>
      Then Users will be filtered and User
      When I click on the first result 
      Then I am on <friendName> private chat
      When I type on message textfield: <message> 
      Then send message button was displayed
      When I click on send message button
      Then The message was displayed on the internal screen
      Then The first checkmark was displayed
      When I perform a long press on message: <message>
      Then The message dropdown is displayed
      When I click on Erase button
      Then The message: <message> are selected
      And The erase button is displayed
      When I click on erase button
      Then I choose to erase for all
      Then The first checkmark is not displayed
      And The send message now is replace

      Examples:
        | friendName             | message                                                                             | 
        | Renato Araújo          | Hi There!\n I'm sending you this message to testing the send message feature        |
        | Juliana Freitas        | :) follow my message with emoji to make your day even better                        |
        | Jhon Due Interviewer   | Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis massa leo, pretium non condimentum a, consequat et dui. Cras quis elit dignissim, fermentum ex non, convallis metus. Fusce facilisis pellentesque hendrerit. Fusce vitae scelerisque lacus, nec ultricies dolor. Sed tincidunt sagittis tempor. Donec posuere lacus vel semper iaculis. Praesent vel bibendum turpis. Aenean ultrices pulvinar interdum. Praesent scelerisque ipsum lacus, id iaculis enim efficitur vestibulum. Maecenas ac leo a tellus tincidunt tincidunt. Donec sodales ornare urna, sit amet porta nulla. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Sed eget libero tincidunt, imperdiet velit id, elementum nunc. Aliquam non tempus libero, vel porttitor mauris. Donec posuere nisi vitae lectus posuere, nec elementum ligula faucibus. Mauris dolor purus, blandit sit amet dapibus commodo, dictum nec mauris. Curabitur nec ante pretium, aliquam urna ut, pharetra sem. Maecenas ipsum tellus, sodales a neque id, euismod posuere tortor. Aenean porta risus quis turpis porta faucibus eget ultricies lectus. Cras porttitor eros non maximus euismod. Pellentesque non dui leo. Proin et tempor risus. Vestibulum sit amet porta odio. Curabitur sed lacus enim. Phasellus vehicula vestibulum justo quis auctor. Cras vitae finibus arcu. Aenean tempus malesuada tortor, a rhoncus risus sodales nec. Sed dapibus eleifend massa. Praesent volutpat pellentesque arcu in facilisis. \nEtiam nibh sapien, dignissim a erat id, efficitur pulvinar nunc. Suspendisse euismod ut tortor bibendum congue. Nulla erat orci, sodales ac dolor id, imperdiet viverra nisi. Interdum et malesuada fames ac ante ipsum primis in faucibus. Etiam eleifend sapien neque. Curabitur vitae pharetra nibh, tempor viverra diam. Pellentesque venenatis magna nisl, id placerat ligula vehicula nec. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Etiam eget malesuada leo. Nunc placerat orci neque, at dignissim diam venenatis vitae. Donec lobortis eu mi at mattis. Vestibulum molestie tellus a enim dapibus varius. Maecenas vitae augue augue.\n Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Duis ante enim, gravida consequat dolor ut, sodales volutpat sapien. Maecenas felis erat, laoreet euismod tempor a, tempor et libero. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Suspendisse eget felis erat. Integer pharetra pharetra elit tempus posuere. Phasellus consectetur at erat accumsan blandit. Etiam sed lacus libero. Sed hendrerit finibus hendrerit. Phasellus consectetur tempor quam eget semper. Cras congue molestie dui, id facilisis tortor sollicitudin a.       |                                             |
        | Myself                 | This test will fail                                                                 |

    @critical
    Scenario Outline: User send a message with internet thoubles
      Given I open Whatsapp Application
      Then I'm on the chat screen
      When I click on Write Message icon
      Then New chat modal was open successful
      When I type on search textfield: <friendName>
      Then Users will be filtered and User
      When I click on first result 
      Then I am on <friendName> private chat
      When I type on message textfield: <message> 
      Then send message button was displayed
      When I click on send message button
      And Intenet troubles are detected
      Then The message was displayed on the internal screen
      And The clockmark is was displayed
      When Connections are stabilized
      Then The first checkmark was displayed

      Examples:
        | friendName             | message                                                                             | 
        | Renato Araújo          | Hi There!\n I'm sending you this message to testing the send message feature        |
        | Juliana Freitas        | :) follow my message with emoji to make your day even better                        |
        | Jhon Due Interviewer   | Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis massa leo, pretium non condimentum a, consequat et dui. Cras quis elit dignissim, fermentum ex non, convallis metus. Fusce facilisis pellentesque hendrerit. Fusce vitae scelerisque lacus, nec ultricies dolor. Sed tincidunt sagittis tempor. Donec posuere lacus vel semper iaculis. Praesent vel bibendum turpis. Aenean ultrices pulvinar interdum. Praesent scelerisque ipsum lacus, id iaculis enim efficitur vestibulum. Maecenas ac leo a tellus tincidunt tincidunt. Donec sodales ornare urna, sit amet porta nulla. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Sed eget libero tincidunt, imperdiet velit id, elementum nunc. Aliquam non tempus libero, vel porttitor mauris. Donec posuere nisi vitae lectus posuere, nec elementum ligula faucibus. Mauris dolor purus, blandit sit amet dapibus commodo, dictum nec mauris. Curabitur nec ante pretium, aliquam urna ut, pharetra sem. Maecenas ipsum tellus, sodales a neque id, euismod posuere tortor. Aenean porta risus quis turpis porta faucibus eget ultricies lectus. Cras porttitor eros non maximus euismod. Pellentesque non dui leo. Proin et tempor risus. Vestibulum sit amet porta odio. Curabitur sed lacus enim. Phasellus vehicula vestibulum justo quis auctor. Cras vitae finibus arcu. Aenean tempus malesuada tortor, a rhoncus risus sodales nec. Sed dapibus eleifend massa. Praesent volutpat pellentesque arcu in facilisis. \nEtiam nibh sapien, dignissim a erat id, efficitur pulvinar nunc. Suspendisse euismod ut tortor bibendum congue. Nulla erat orci, sodales ac dolor id, imperdiet viverra nisi. Interdum et malesuada fames ac ante ipsum primis in faucibus. Etiam eleifend sapien neque. Curabitur vitae pharetra nibh, tempor viverra diam. Pellentesque venenatis magna nisl, id placerat ligula vehicula nec. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Etiam eget malesuada leo. Nunc placerat orci neque, at dignissim diam venenatis vitae. Donec lobortis eu mi at mattis. Vestibulum molestie tellus a enim dapibus varius. Maecenas vitae augue augue.\n Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Duis ante enim, gravida consequat dolor ut, sodales volutpat sapien. Maecenas felis erat, laoreet euismod tempor a, tempor et libero. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Suspendisse eget felis erat. Integer pharetra pharetra elit tempus posuere. Phasellus consectetur at erat accumsan blandit. Etiam sed lacus libero. Sed hendrerit finibus hendrerit. Phasellus consectetur tempor quam eget semper. Cras congue molestie dui, id facilisis tortor sollicitudin a.       |
        | Mysealf                | This test will fail