
require 'appium_lib'

caps = Appium.load_appium_txt file: File.join('./appium.txt')



Appium::Driver.new(caps, true)
Appium.promote_appium_methods Object