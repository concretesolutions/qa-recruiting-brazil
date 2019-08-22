# usando bibliote behave para rodar testes em BDD no Python
from behave import *

from selenium import webdriver

from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
import time

from nose.tools import assert_equals

@given(u'I am logged in on Whatsapp Web')
def wpp_login(context):
    context.driver = webdriver.Safari()
    context.driver.get("https://web.whatsapp.com")
	# Aguardo a presença do QR-Code e espero um tempo para escanea-lo
    WebDriverWait(context.driver,10).until(EC.presence_of_element_located((By.XPATH,'//*[@id="app"]/div/div/div[2]/div[1]/div/div[2]/div/img')))
    time.sleep(5)


# Passo o contato como parametro e busco pelo xpath usando o título como parametro de busca
@when(u'I search for {contact}')
def search_contact(context, contact):
    context.driver.find_element_by_xpath('//*[@id="side"]/div[1]/div/label').send_keys(contact)
    xpath_contact_name = '"//*title='+contact+'"'
    WebDriverWait(context.driver,10).until(EC.presence_of_element_located((By.XPATH,xpath_contact_name)))
    time.sleep(5)

# Escolhendo um contato para abrir uma conversa
@when(u'I click on {contact} to open a conversation')
def select_contact(context, contact):
    xpath_contact_name = '"//*title='+contact+'"'
    context.driver.find_element_by_xpath(context.xpath_contact_name).click()
    WebDriverWait(context.driver,10).until(EC.presence_of_element_located((By.XPATH,context.xpath_contact_name)))
    time.sleep(5)


# Enviando a mensagem para o contato selecionado
@when(u'I send {message}')
def message_to_send(context, message):
    context.driver.find_element_by_xpath('//*[@id="main"]/footer/div[1]/div[2]').send_keys(message)
    context.driver.find_element_by_xpath('//*[@id="main"]/footer/div[1]/div[3]').click()
    time.sleep(5)

# Validando a mensagem enviada para o usuário correto.
@then(u'I should see the {message} sent to {contact}')
def message_sent_confirmation(context):
    xpath_message = '//span/span [text()='+'"'+message+'"'+"'"
    assert_equals(message, context.driver.find_element_by_xpath(xpath_message).text)
    assert_equals(contact, context.driver.find_element_by_xpath('//*[@title="main"]').text)
    time.sleep(5)