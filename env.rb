# encoding: utf-8

require 'rspec'
require 'rubygems'
require 'selenium/webdriver'
require 'capybara'
require 'capybara/cucumber'
require 'selenium-webdriver'


Capybara.configure do |config|
 
    config.default_driver = :selenium_chrome

end
