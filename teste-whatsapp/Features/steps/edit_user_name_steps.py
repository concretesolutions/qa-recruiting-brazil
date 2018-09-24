from behave import Given, Step, When, Then
from features.pages.edit_user_name_page.py import edit_user_name_page

edit_user_name_page = edit_user_name_page()

@Given ('i access the WhatsApp home screen via "{url}"')
def access_whatsapp_web(context, url):
    edit_user_name_page.access_whatsapp_web(url)

@Then ('access my profile')
def access_profile(context):
    edit_user_name_page.access_profile()

@And ('click do edit my name')
def click_edit_name(context):
    edit_user_name_page.click_edit_name()

@And ('insert the new user name: "{name}"')
def insert_new_name(context, name):
    edit_user_name_page.insert_new_name(name)

@Then ('i click save the new user name')
def save_new_name(context):
    edit_user_name_page.save_new_name()

@And ('go back do home screen')
def go_to_home_screen(context):
    edit_user_name_page.go_to_home_screen()

@When ('i access my profile')
def acces_profile_after_change(context):
    edit_user_name_page.access_profile()

@Then ('my user name should be "{name}"')
def verify_new_name(context, name):
    edit_user_name_page.verify_new_name(name)