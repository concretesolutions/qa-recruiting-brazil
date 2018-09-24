from selenium.webdriver.common_keys import Keys
from features.element_map.edit_user_name_element_map import edit_user_name_element_map


class edit_user_name_page():

    def access_whatsapp_web(self, url):
        super().chromedriver.get(url)
    
    def access_profile(self):
        super().link_my_profile().click()

    def click_edit_name(self):
        super().btn_edit_name().click()

    def insert_new_name(self, name):
        super().input_user_name().send_keys(name)

    def save_new_name(context):
        super().btn_save_user_name().click()

    def go_to_home_screen(context):
        super().btn_back_home().click()

    def verify_new_name(context, name):
        super().link_my_profile().click()
        self.asserttrue('Name still the same', super().getpagesource().is_text_present('Nenhuma conversa, contato ou mensagem foram encontradas'))