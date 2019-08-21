//biblioteca de assertions para as promises
const chai = require("chai").use(require("chai-as-promised"));
const expect = chai.expect;

var lastName = ''
var newName = ''

When('I click on the pencil beside my current name', function(callback) {
    //Por não ser uma aplicação 100% angular, adicionei esta flag
    browser.ignoreSynchronization = true;
    //Uso a chamada explicita para aguardar um elemento da tela carregar para que eu possa executar as demais ações
    let EC = ExpectedConditions;
    let condition = EC.presenceOf(element(by.xpath('//*[@id="app"]/div/div/div[2]/div[1]/span/div/div/header/div/div[2]')))
    browser.wait(condition, 20000)
        // capturo o nome existente e adiciono em uma variável
    let test = element(By.xpath('//*[@id="app"]/div/div/div[2]/div[1]/span/div/div/div/div[2]/div[2]/div[1]/div/div[2]'))
    test.getText().then(function(text) {
            lastName = text
        })
        //clico em salvar
    element(By.xpath('//*[@id="app"]/div/div/div[2]/div[1]/span/div/div/div/div[2]/div[2]/div[1]/span[2]/div/span')).click()
        //espera implicita de 2s para salvar o registro
    browser.driver.sleep(2000)
        .then(callback)
});


When('I type my new name', function(callback) {
    //Por não ser uma aplicação 100% angular, adicionei esta flag
    browser.ignoreSynchronization = true;
    newName = "Novo Nome"
        //apenas para aguardar a aplicação renderizar. Existem maneiras mais bonitas e robustas como chamadas explicitas, mas para essaa implementação preferi usar o sleep
    browser.driver.sleep(5000)
        //limpo o nome que já existe
    element(By.xpath('//*[@id="app"]/div/div/div[2]/div[1]/span/div/div/div/div[2]/div[2]/div[1]/div/div[2]')).clear()
        //digito o novo nome
    element(By.xpath('//*[@id="app"]/div/div/div[2]/div[1]/span/div/div/div/div[2]/div[2]/div[1]/div/div[2]')).sendKeys(newName)
        .then(callback)
});


When('I save it', function(callback) {
    //Por não ser uma aplicação 100% angular, adicionei esta flag
    browser.ignoreSynchronization = true;
    //clico no botão salvar
    element(By.xpath('//*[@id="app"]/div/div/div[2]/div[1]/span/div/div/div/div[2]/div[2]/div[1]/span[2]/div')).click()
    browser.driver.sleep(2000)
        .then(callback)
});


Then('I should see my name updated', function(callback) {
    //Por não ser uma aplicação 100% angular, adicionei esta flag
    browser.ignoreSynchronization = true;
    //capturo o xpath para que posteriormente possa pegar o valor texto existente
    var test1 = element(By.xpath('//*[@id="app"]/div/div/div[2]/div[1]/span/div/div/div/div[2]/div[2]/div[1]/div/div[2]'))
    return expect(test1.getText()).not.to.be.equal(lastName);
        .then(callback)
});