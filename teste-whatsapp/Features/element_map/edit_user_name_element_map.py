from selenium import webdriver as driver

class edit_user_name_element_map(object):
    chromedriver = driver.Chrome()

    def link_my_profile(self):
        return self.chromedriver.find_element_by_xpath('//*[@id="side"]/header/div[1]/div')

    def btn_edit_name(self):
        return self.chromedriver.find_element_by_xpath('//*[@id="app"]/div/div/div[1]/div[1]/span/div/div/div/div[2]/div[2]/div/span[2]/div/span')

    def input_user_name(self):
        return self.chromedriver.find_element_by_xpath('//*[@id="app"]/div/div/div[1]/div[1]/span/div/div/div/div[2]/div[2]/div[1]/div/div[2]')

    def btn_save_user_name(self):
        return self.chromedriver.find_element_by_xpath('//*[@id="app"]/div/div/div[1]/div[1]/span/div/div/div/div[2]/div[2]/div[1]/span[2]/div')

    def btn_back_home(self):
        return self.chromedriver.find_element_by_xpath('//*[@id="app"]/div/div/div[1]/div[1]/span/div/div/header/div/div[1]/button')

    